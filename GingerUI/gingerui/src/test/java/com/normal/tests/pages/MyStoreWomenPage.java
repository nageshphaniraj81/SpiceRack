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
 * The Class MyStoreWomenPage.
 *
 * @author Nagesh Phaniraj
 */
public class MyStoreWomenPage extends BasePage {
	
	/**
	 * Instantiates a new my store women page.
	 */
	public MyStoreWomenPage() {
		super();
	}

	/** The txt title. */
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'Women')]")
	public WebElement txtTitle;
	
	/** The tab women. */
	@FindBy(how = How.XPATH, using = "//div[@id='block_top_menu']/ul/li//*[contains(@title,'Women') and contains(@class,'sf-with-ul')]")
	public WebElement tabWomen;
	
	/**
	 * Switch to women tab.
	 * @throws InterruptedException 
	 */
	public void switchToWomenTab() throws InterruptedException{
		Thread.sleep(4000);
		if(tabWomen.isDisplayed()){
		tabWomen.click();
		}else{
			System.out.println("Women Tab not displayed");
		}
	
	}
	
	/**
	 * Wait till page load.
	 */
	public void waitTillPageLoad(){
	
		SyncronizationHelper sync = new SyncronizationHelper();
		sync.waitForElement(By.xpath("//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'Women')]"), 10);
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
