/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.security.Credentials;

/**
 * @author Nagesh Phaniraj
 *
 */
public interface Alerts {
	void acceptAlert();
	void dismissAlert();
	void setCredentials(Credentials credentials);
	void authenticateUsingCredentials(Credentials credentials);
	String getAleartText();
}
