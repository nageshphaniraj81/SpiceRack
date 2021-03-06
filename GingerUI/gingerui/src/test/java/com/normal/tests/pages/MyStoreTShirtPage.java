/**
 * 
 */
package com.normal.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.frameworkutilities.SyncronizationHelper;
import com.spicerack.framework.initialization.BasePage;

// TODO: Auto-generated Javadoc
/**
 * The Class MyStoreTShirtPage.
 *
 * @author Nagesh Phaniraj
 */
public class MyStoreTShirtPage extends BasePage{
	
	/**
	 * Instantiates a new my store T shirt page.
	 */
	public MyStoreTShirtPage() {
		super();
	}

	/** The txt title. */
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'T-shirts')]")
	public WebElement txtTitle;
	
	/** The tab T shirts. */
	@FindBy(how = How.XPATH, using = "//div[@id='block_top_menu']/ul/li/*[contains(@title,'T-shirts')]")
	public WebElement tabTShirts;
	
	/**
	 * Switch to T shirts tab.
	 * @throws InterruptedException 
	 */
	public void switchToTShirtsTab() throws InterruptedException{
		
	    Thread.sleep(5000);
		if(tabTShirts.isDisplayed()){
			tabTShirts.click();
		}else{
			System.out.println("Women Tab not displayed");
		}

		
	}
	
	/**
	 * Wait till page load.
	 */
	public void waitTillPageLoad(){
		SyncronizationHelper sync = new SyncronizationHelper();
		sync.waitForElement(By.xpath("//div[@id='center_column']//h1/span[contains(text(),'T-shirts')]"), 10);
		}

	/**
	 * Checks if is title displayed.
	 *
	 * @return true, if is title displayed
	 * @throws InterruptedException 
	 */
	public boolean isTitleDisplayed() throws InterruptedException {

		Thread.sleep(2000);
		if (txtTitle.isDisplayed()) {
			System.out.println("Title of the text is displayed");
			return true;
		} else {
			System.out.println("Title of the text is not displayed");
			return false;
		}

	}
}
