/**
 * 
 */
package com.spicerack.framework.controls.api;

import java.lang.reflect.*;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import com.spicerack.framework.controls.internals.Control;


/**
 * The Class ControlFieldDecorator.
 *
 * @author Nagesh Phaniraj
 */
public class ControlFieldDecorator implements FieldDecorator {

	/** The factory. */
	protected ElementLocatorFactory factory;

	/**
	 * Instantiates a new control field decorator.
	 *
	 * @param factory
	 *            the factory
	 */
	public ControlFieldDecorator(ElementLocatorFactory factory) {
		this.factory = factory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.openqa.selenium.support.pagefactory.FieldDecorator#decorate(java.lang
	 * .ClassLoader, java.lang.reflect.Field)
	 */
	@Override
	public Object decorate(ClassLoader loader, Field field) {

		if (!(WebElement.class.isAssignableFrom(field.getType()) || isDecoratableList(field))) {
			return null;
		}
		ElementLocator locator = factory.createLocator(field);
		if (locator == null) {
			return null;
		}
		Class<?> fieldType = field.getType();
		if (WebElement.class.equals(fieldType)) {
			fieldType = Control.class;
		}

		if (WebElement.class.isAssignableFrom(fieldType)) {
			return proxyForLocator(loader, fieldType, locator);
		} else if (List.class.isAssignableFrom(fieldType)) {
			Class<?> erasureClass = getErasureClass(field);
			return proxyForListLocator(loader, erasureClass, locator);
		} else {
			return null;
		}
	}

	/**
	 * Gets the erasure class.
	 *
	 * @param field
	 *            the field
	 * @return the erasure class
	 */
	@SuppressWarnings("rawtypes")
	private Class getErasureClass(Field field) {
		Type genericType = field.getGenericType();
		if (!(genericType instanceof ParameterizedType)) {
			return null;
		}
		return (Class) ((ParameterizedType) genericType).getActualTypeArguments()[0];
	}

	/**
	 * Checks if is decoratable list.
	 *
	 * @param field
	 *            the field
	 * @return true, if is decoratable list
	 */
	protected boolean isDecoratableList(Field field) {
		if (!List.class.isAssignableFrom(field.getType())) {
			return false;
		} else {
			Type genericType = field.getGenericType();
			if (!(genericType instanceof ParameterizedType)) {
				return false;
			} else {
				Type listType = ((ParameterizedType) genericType).getActualTypeArguments()[0];
				return !WebElement.class.equals(listType) ? false
						: field.getAnnotation(FindBy.class) != null || field.getAnnotation(FindBys.class) != null
								|| field.getAnnotation(FindAll.class) != null;
			}
		}
	}

	/**
	 * Proxy for locator.
	 *
	 * @param <T>
	 *            the generic type
	 * @param loader
	 *            the loader
	 * @param interfaceType
	 *            the interface type
	 * @param locator
	 *            the locator
	 * @return the t
	 */
	protected <T> T proxyForLocator(ClassLoader loader, Class<T> interfaceType, ElementLocator locator) {
		InvocationHandler handler = new ControlHandler(interfaceType, locator);
		T proxy;
		proxy = interfaceType.cast(Proxy.newProxyInstance(loader,
				new Class[] { interfaceType, WebElement.class, WrapsElement.class, Locatable.class }, handler));
		return proxy;
	}

	/**
	 * Proxy for list locator.
	 *
	 * @param <T>
	 *            the generic type
	 * @param loader
	 *            the loader
	 * @param interfaceType
	 *            the interface type
	 * @param locator
	 *            the locator
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	protected <T> List<T> proxyForListLocator(ClassLoader loader, Class<T> interfaceType, ElementLocator locator) {
		InvocationHandler handler = new ControlListHandler(interfaceType, locator);

		List<T> proxy;
		proxy = (List<T>) Proxy.newProxyInstance(loader, new Class[] { List.class }, handler);
		return proxy;
	}

}
