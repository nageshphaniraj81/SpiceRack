/**
 * 
 */
package com.spicerack.framework.controls.internals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;

/**
 * The Class ControlBase.
 *
 * @author Nagesh Phaniraj
 */
public class ControlBase implements Control {
	
	/** The element. */
	private final WebElement element;
	
	/**
	 * Instantiates a new control base.
	 *
	 * @param element
	 *            the element
	 */
	public ControlBase(WebElement element) {
		this.element = element;
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#clear()
	 */
	@Override
	public void clear() {
		element.clear();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#click()
	 */
	@Override
	public void click() {
		element.click();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#findElement(org.openqa.selenium.By)
	 */
	@Override
	public WebElement findElement(By arg0) {
		return element.findElement(arg0);
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#findElements(org.openqa.selenium.By)
	 */
	@Override
	public List<WebElement> findElements(By arg0) {
		return element.findElements(arg0);
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#getAttribute(java.lang.String)
	 */
	@Override
	public String getAttribute(String arg0) {
		return element.getAttribute(arg0);
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#getCssValue(java.lang.String)
	 */
	@Override
	public String getCssValue(String arg0) {
		return element.getCssValue(arg0);
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#getLocation()
	 */
	@Override
	public Point getLocation() {
		return element.getLocation();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#getRect()
	 */
	@Override
	public Rectangle getRect() {
		return element.getRect();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#getSize()
	 */
	@Override
	public Dimension getSize() {
		return element.getSize();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#getTagName()
	 */
	@Override
	public String getTagName() {
		return element.getTagName();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#getText()
	 */
	@Override
	public String getText() {
		return element.getText();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#isDisplayed()
	 */
	@Override
	public boolean isDisplayed() {
		return element.isDisplayed();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return element.isEnabled();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#isSelected()
	 */
	@Override
	public boolean isSelected() {
		return element.isSelected();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#sendKeys(java.lang.CharSequence[])
	 */
	@Override
	public void sendKeys(CharSequence... charSequences) {
		element.sendKeys(charSequences);
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.WebElement#submit()
	 */
	@Override
	public void submit() {
		element.submit();
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.TakesScreenshot#getScreenshotAs(org.openqa.selenium.OutputType)
	 */
	@Override
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		return element.getScreenshotAs(arg0);
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.internal.WrapsElement#getWrappedElement()
	 */
	@Override
	public WebElement getWrappedElement() {
		return element;
	}


	/* (non-Javadoc)
	 * @see org.openqa.selenium.internal.Locatable#getCoordinates()
	 */
	@Override
	public Coordinates getCoordinates() {
		return null;
	}

}
