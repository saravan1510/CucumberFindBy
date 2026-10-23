package com.flipkart.hooks;

import com.flipkart.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeScenario() {
		launchBrowser();
		openFlipkart();
	}
	@After
	public void afterScenario() {
		closeBrowser();
	}

}