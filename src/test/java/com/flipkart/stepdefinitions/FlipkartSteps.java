package com.flipkart.stepdefinitions;

import com.flipkart.base.BaseClass;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.ProductPage;
import com.flipkart.pages.SearchResultsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSteps extends BaseClass {
	
	HomePage homepage;
	SearchResultsPage searchResultsPage;
	ProductPage productPage;

	@Given("Flipkart is opened")
	public void flipkartOpened() {
	    homepage=new HomePage(driver,wait);
	    System.out.println("Flipkart opened successfully");
	    homepage.closeLoginPopupIfPresent();
	}

	@When("I search for {string}")
	public void searchProduct(String product) {
		homepage.searchProduct(product);
		searchResultsPage=new SearchResultsPage(driver,wait);
		System.out.println("Product Searched: "+product);
	}

	@When("I print all product titles")
	public void printAllProductTitles() {
		searchResultsPage.printProductTitles();
		System.out.println("Product Link Count : "+searchResultsPage.getProductLinkCount());
	}

	@When("I select the first product")
	public void selectProduct() {
		searchResultsPage.selectProduct();
		productPage=new ProductPage(driver,wait);
	}

	@Then("I print the selected product details")
	public void printSelectedProductDetails() {
	   System.out.println("Product URL: "+productPage.getCurrentUrl());
	   
	}
}
