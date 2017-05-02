/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.security.Credentials;
import com.spicerack.framework.initialization.DriverContext;

/**
 * @author Nagesh Phaniraj
 *
 */
public class AlertBase implements Alerts {
	
	private static Alert alert;
	
	public AlertBase(){
		alert = DriverContext.Driver.switchTo().alert();
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.Alerts#acceptAlert()
	 */
	
	@Override
	public void acceptAlert() {
		alert.accept();
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.Alerts#dismissAlert()
	 */
	@Override
	public void dismissAlert() {
		alert.dismiss();
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.Alerts#setCredentials(org.openqa.selenium.security.Credentials)
	 */
	@Override
	public void setCredentials(Credentials credentials) {
		alert.setCredentials(credentials);
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.Alerts#authenticateUsingCredentials(org.openqa.selenium.security.Credentials)
	 */
	@Override
	public void authenticateUsingCredentials(Credentials credentials) {
		alert.authenticateUsing(credentials);
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.Alerts#getAleartText()
	 */
	@Override
	public String getAleartText() {
		return alert.getText();
	}



}