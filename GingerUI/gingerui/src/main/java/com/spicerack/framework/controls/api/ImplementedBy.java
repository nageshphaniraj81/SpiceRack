/**
 * 
 */
package com.spicerack.framework.controls.api;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.spicerack.framework.controls.internals.ControlBase;

/**
 * @author Nagesh Phaniraj
 *
 */


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ImplementedBy {

    Class<?> value() default ControlBase.class;

}
