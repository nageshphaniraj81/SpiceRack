/**
 * 
 */
package com.spicerack.framework.controls.api;

/**
 * @author Nagesh Phaniraj
 *
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.spicerack.framework.controls.internals.Control;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * The Class ControlListHandler.
 */
public class ControlListHandler implements InvocationHandler {

	/** The locator. */
	private final ElementLocator locator;

	/** The wrapping type. */
	private final Class<?> wrappingType;

	/**
	 * Given an interface and a locator, apply a wrapper over a list of
	 * elements.
	 *
	 * @param <T>
	 *            type of the interface.
	 * @param interfaceType
	 *            interface type we're trying to wrap around the element.
	 * @param locator
	 *            locator on the page for the elements.
	 */
	public <T> ControlListHandler(Class<T> interfaceType, ElementLocator locator) {
		this.locator = locator;
		if (!Control.class.isAssignableFrom(interfaceType)) {
			throw new RuntimeException("interface not assignable to Control.");
		}
		this.wrappingType = ImplementedByProcessor.getWrapperClass(interfaceType);

	}

	/**
	 * Executed on invoke of the requested proxy. Used to gather a list of
	 * wrapped WebElements.
	 *
	 * @param o
	 *            object to invoke on
	 * @param method
	 *            method to invoke
	 * @param objects
	 *            parameters for method
	 * @return return value from method
	 * @throws Throwable
	 *             when frightened.
	 */
	@Override
	public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
		List<Object> wrappedList = new ArrayList<Object>();
		Constructor<?> cons = wrappingType.getConstructor(WebElement.class);
		for (WebElement element : locator.findElements()) {
			Object thing = cons.newInstance(element);
			wrappedList.add(wrappingType.cast(thing));
		}
		try {
			return method.invoke(wrappedList, objects);
		} catch (InvocationTargetException e) {
			// Unwrap the underlying exception
			throw e.getCause();
		}
	}
}
