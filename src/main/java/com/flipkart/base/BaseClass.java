package com.flipkart.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	public void openFlipkart() {
		driver.get("https://www.flipkart.com/");
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
