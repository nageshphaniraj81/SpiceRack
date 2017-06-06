/**
 * 
 */
package com.normal.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.controls.elements.Button;
import com.spicerack.framework.controls.elements.TextBox;
import com.spicerack.framework.frameworkutilities.SyncronizationHelper;
import com.spicerack.framework.initialization.BasePage;

// TODO: Auto-generated Javadoc
/**
 * The Class MyStoreDressesPage.
 *
 * @author Nagesh Phaniraj
 */
public class MyStoreDressesPage extends BasePage{
	
	/**
	 * Instantiates a new my store dresses page.
	 */
	public MyStoreDressesPage() {
		super();
	}

	/** The txt title. */
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'Dresses')]")
	public TextBox txtTitle;
	
	/** The tab dresses. */
	@FindBy(how = How.XPATH, using = ".//div[@id='block_top_menu']/ul/li/*[contains(@title,'Dresses')]")
	public Button tabDresses;
	
	/**
	 * Switch to dresses tab.
	 * @throws InterruptedException 
	 */
	public void switchToDressesTab() throws InterruptedException {
		
		Thread.sleep(2000);
		if(tabDresses.isDisplayed()){
			tabDresses.click();
		}else{
			System.out.println("Women Tab not displayed");
		}
	
	}
	
	/**
	 * Wait till page load.
	 */
	public void waitTillPageLoad(){
		
		SyncronizationHelper sync = new SyncronizationHelper();
		sync.waitForElement(By.xpath("//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'Dresses')]"), 10);
		
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
