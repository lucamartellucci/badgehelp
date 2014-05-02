package it.badgemania.badgehelp.properties;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.slf4j.Logger;

public class PropertyValueProducer {

	@Inject
	private PropertyResolver resolver;
	
	@Inject
	private Logger logger;

	@Produces
	@PropertyValue
	public String getStringConfigValue(InjectionPoint ip) {

		String fqn = new StringBuilder(ip.getMember().getDeclaringClass().getName()).append(".").append(ip.getMember().getName()).toString();
		logger.info("fqn {}",fqn);

		// Trying with explicit key defined on the field
		String key = ip.getAnnotated().getAnnotation(PropertyValue.class).value();
		boolean isKeyDefined = !key.trim().isEmpty();

		boolean valueRequired = ip.getAnnotated().getAnnotation(PropertyValue.class).required();

		if (isKeyDefined) {
			return resolver.getValue(key);
		}

		// Falling back to fully-qualified field name resolving.
		key = fqn;
		String value = resolver.getValue(fqn);

		// No luck... so perhaps just the field name?
		if (value == null) {
			key = ip.getMember().getName();
			value = resolver.getValue(key);
		}

		// No can do - no value found but you've said it's required.
		if (value == null && valueRequired) {
			throw new IllegalStateException(new StringBuilder("No value defined for field: ").append(fqn).append(" but field was marked as required.").toString());
		}

		return value;
	}

//	@Produces
//	@PropertyValue
//	public Double getDoubleConfigValue(InjectionPoint ip) {
//		String value = getStringConfigValue(ip);
//
//		return (value != null) ? Double.valueOf(value) : null;
//	}
//	
//	@Produces
//	@PropertyValue
//	public Integer getIntegerConfigValue(InjectionPoint ip) {
//		String value = getStringConfigValue(ip);
//
//		return (value != null) ? Integer.valueOf(value) : null;
//	}

}
