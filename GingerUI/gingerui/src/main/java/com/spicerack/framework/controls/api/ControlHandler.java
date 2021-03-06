/**
 * 
 */
package com.spicerack.framework.controls.api;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import com.spicerack.framework.controls.internals.Control;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * The Class ControlHandler.
 *
 * @author Nagesh Phaniraj
 */
public class ControlHandler implements InvocationHandler {

	/** The locator. */
	private final ElementLocator locator;

	/** The wrapping type. */
	private final Class<?> wrappingType;

	/**
	 * Instantiates a new control handler.
	 *
	 * @param <T>
	 *            the generic type
	 * @param interfaceType
	 *            the interface type
	 * @param locator
	 *            the locator
	 */
	/*
	 * Generates a handler to retrieve the WebElement from a locator for a given
	 * WebElement interface descendant.
	 */
	public <T> ControlHandler(Class<T> interfaceType, ElementLocator locator) {
		this.locator = locator;
		if (!Control.class.isAssignableFrom(interfaceType)) {
			throw new RuntimeException("interface not assignable to Control.");
		}

		this.wrappingType = ImplementedByProcessor.getWrapperClass(interfaceType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object object, Method method, Object[] objects) throws Throwable {
		WebElement element = locator.findElement();

		if ("getWrappedElement".equals(method.getName())) {
			return element;
		}
		@SuppressWarnings("rawtypes")
		Constructor cons = wrappingType.getConstructor(WebElement.class);
		Object thing = cons.newInstance(element);
		try {
			return method.invoke(wrappingType.cast(thing), objects);
		} catch (InvocationTargetException e) {
			// Unwrap the underlying exception
			throw e.getCause();
		}
	}
}
