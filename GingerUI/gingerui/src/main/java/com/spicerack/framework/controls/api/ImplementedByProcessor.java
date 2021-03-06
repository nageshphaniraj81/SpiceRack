/**
 * 
 */
package com.spicerack.framework.controls.api;

import com.spicerack.framework.controls.internals.Control;


/**
 * The Class ImplementedByProcessor.
 *
 * @author Nagesh Phaniraj
 */
public final class ImplementedByProcessor {

	/**
	 * Instantiates a new implemented by processor.
	 */
	public ImplementedByProcessor() {
	}

	/**
	 * Gets the wrapper class.
	 *
	 * @param <T>
	 *            the generic type
	 * @param iface
	 *            the iface
	 * @return the wrapper class
	 */
	public static <T> Class<?> getWrapperClass(Class<T> iface) {
		if (iface.isAnnotationPresent(ImplementedBy.class)) {
			ImplementedBy annotation = iface.getAnnotation(ImplementedBy.class);
			Class<?> clazz = annotation.value();
			if (Control.class.isAssignableFrom(clazz)) {
				return annotation.value();
			}
		}
		throw new UnsupportedOperationException("Apply @ImplementedBy interface to your Interface "
				+ iface.getCanonicalName() + " if you want to extend ");
	}
}
