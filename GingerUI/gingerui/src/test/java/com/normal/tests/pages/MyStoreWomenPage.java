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
import com.spicerack.framework.initialization.DriverContext;

/**
 * @author Nagesh Phaniraj
 *
 */
public class MyStoreWomenPage extends BasePage {
	public MyStoreWomenPage() {
		super();
	}

	@FindBy(how = How.XPATH, using = ".//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'Women')]")
	public WebElement txtTitle;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li//*[contains(@title,'Women') and contains(@class,'sf-with-ul')]")
	public WebElement tabWomen;
	
	public void switchToWomenTab(){
	
		if(tabWomen.isDisplayed()){
		tabWomen.click();
		}else{
			System.out.println("Women Tab not displayed");
		}
	
	}
	
	public void waitTillPageLoad(){
	
		SyncronizationHelper sync = new SyncronizationHelper(DriverContext.Driver);
		sync.waitForElement(By.xpath(".//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'Women')]"), 10);
		}

	public boolean isTitleDisplayed() {

		if (txtTitle.isDisplayed()) {
			System.out.println("Title of the text is displayed");
			return true;
		} else {
			System.out.println("Title of the text is not displayed");
			return false;
		}

	}
}
