package com.flipkart.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                     glue = {"com.flipkart.stepdefinitions","com.flipkart.hooks"},
                   plugin = {"pretty","html:target/report.html"},
               monochrome = true,
                   dryRun = false)
public class TestRunner {

}
