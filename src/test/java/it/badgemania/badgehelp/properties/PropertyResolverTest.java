package it.badgemania.badgehelp.properties;

import static org.junit.Assert.assertEquals;
import it.badgemania.badgehelp.logging.LoggingProducer;

import javax.inject.Inject;

import org.jglue.cdiunit.ActivatedAlternatives;
import org.jglue.cdiunit.AdditionalPackages;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
@AdditionalPackages(value={PropertyResolver.class, LoggingProducer.class})
@ActivatedAlternatives(value = { ConfigLocationProducer.class })
public class PropertyResolverTest {
	
	@Inject
	PropertyResolver propertyResolver;
	
	@Test
	public void testGetValue() throws Exception {
		assertEquals("mystring", propertyResolver.getValue("string.prop"));
		assertEquals("true", propertyResolver.getValue("boolean.prop"));
		assertEquals("23.4", propertyResolver.getValue("double.prop"));
		assertEquals("11", propertyResolver.getValue("integer.prop"));
	}

}
