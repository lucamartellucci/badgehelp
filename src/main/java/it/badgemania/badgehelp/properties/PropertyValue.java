package it.badgemania.badgehelp.properties;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Defines method / variable that should be injected with value read from some arbitrary resource (e.g. from
 * <code>properties</code> file.)
 * 
 */
@Qualifier
@Retention(RUNTIME)
@Target({ TYPE, METHOD, FIELD, PARAMETER })
public @interface PropertyValue {

	 /**
     * Key that will be searched when injecting the value.
     */
    @Nonbinding
    String value() default "";

    /**
     * Defines if value for the given key must be defined.
     */
    @Nonbinding
    boolean required() default true;
}
