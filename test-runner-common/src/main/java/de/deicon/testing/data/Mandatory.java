package de.deicon.testing.data;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
/**
 * Mark parameter as mandatory
 * @author dieter
 *
 */
@interface Mandatory {
	
}
