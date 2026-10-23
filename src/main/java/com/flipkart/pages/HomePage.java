package com.flipkart.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver,wait);
	}
	
	public void searchProduct(String product) {
		searchBox.clear();
		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);
	}
	public void closeLoginPopupIfPresent() {

		List<WebElement> closeButtons = driver.findElements(
		        By.xpath("//button[@aria-label='Close']"));

		    if (!closeButtons.isEmpty()) {
		        closeButtons.get(0).click();
		        System.out.println("Login popup closed.");
		    } else {
		        System.out.println("Login popup not displayed. Continuing...");
		    }
		}
		
    }