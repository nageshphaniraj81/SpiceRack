/**
 * 
 */
package com.spicerack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.base.BasePage;
import com.spicerack.framework.base.DriverContext;
import com.spicerack.framework.utilities.SyncronizationHelper;

/**
 * @author Nagesh Phaniraj
 *
 */
public class MyStoreTShirtPage extends BasePage{
	public MyStoreTShirtPage() {
		super();
	}

	@FindBy(how = How.XPATH, using = ".//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'T-shirts')]")
	public WebElement txtTitle;
	
	@FindBy(how = How.XPATH, using = ".//div[@id='block_top_menu']/ul/li/*[contains(@title,'T-shirts')]")
	public WebElement tabTShirts;
	
	public void switchToTShirtsTab(){
		if(tabTShirts.isDisplayed()){
			tabTShirts.click();
		}else{
			System.out.println("Women Tab not displayed");
		}
		
	}
	
	public void waitTillPageLoad(){
		SyncronizationHelper sync = new SyncronizationHelper(DriverContext.Driver);
		sync.waitForElement(By.xpath(".//div[@id='center_column']/h1/span[contains(@class,'cat-name') and contains(text(),'T-shirts')]"), 10);
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