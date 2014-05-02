package it.badgemania.badgehelp.foursquare.rest;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


@Qualifier
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface FoursquareVenuesWebTarget {

}