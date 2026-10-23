package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {
	
	@FindBy(xpath = "//span[contains(@class,'VU-ZEz')]")
	private WebElement productTitle;
	
	public ProductPage(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
