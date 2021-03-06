/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.security.Credentials;

/**
 * The Interface Alerts.
 *
 * @author Nagesh Phaniraj
 */
public interface Alerts {

	/**
	 * Accept alert.
	 */
	void acceptAlert();

	/**
	 * Dismiss alert.
	 */
	void dismissAlert();

	/**
	 * Sets the credentials.
	 *
	 * @param credentials
	 *            the new credentials
	 */
	void setCredentials(Credentials credentials);

	/**
	 * Authenticate using credentials.
	 *
	 * @param credentials
	 *            the credentials
	 */
	void authenticateUsingCredentials(Credentials credentials);

	/**
	 * Gets the aleart text.
	 *
	 * @return the aleart text
	 */
	String getAleartText();
}
