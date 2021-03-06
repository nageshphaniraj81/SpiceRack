/**
 * 
 */
package com.spicerack.framework.controls.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;


/**
 * A factory for creating Control objects.
 *
 * @author Nagesh Phaniraj
 */
public class ControlFactory extends PageFactory {

	/**
	 * Inits the elements.
	 *
	 * @param <T>
	 *            the generic type
	 * @param driver
	 *            the driver
	 * @param pageClassToProxy
	 *            the page class to proxy
	 * @return the t
	 */
	public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy) {
		try {
			T page = pageClassToProxy.newInstance();
			PageFactory.initElements(new ControlFieldDecorator(new DefaultElementLocatorFactory(driver)), page);
			return pageClassToProxy.cast(page);
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}

	}
}
