package com.flipkart.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends BasePage{
	
	@FindAll({
	    @FindBy(xpath = "//a[contains(@href,'/p/')]"),
	    @FindBy(css = "a[data-id]")
	})
	private List<WebElement> productLinks;
	
	@FindBys({
	    @FindBy(xpath = "//div[contains(@class,'_1AtVbE')]"),
	    @FindBy(xpath = "//div[contains(@class,'KzD1HZ')]")
	})
	private List<WebElement> productTitles;
		
	public SearchResultsPage(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
	}
	public int getProductLinkCount() {
		return productLinks.size();
	}
		
	public void printProductTitles() {
	    System.out.println("Product Titles: ");

	    for (WebElement title : productTitles) {
	        System.out.println(title.getText());
	    }
	}
	public void selectProduct() {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    WebElement productLink = wait.until(
		        ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[.//*[contains(normalize-space(),'Apple iPhone 17 Pro (Silver, 256 GB)')]])[1]")));

		    String productUrl = productLink.getAttribute("href");

		    System.out.println("Product URL: " + productUrl);

		    driver.get(productUrl);
	}}