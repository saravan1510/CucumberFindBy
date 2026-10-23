Feature: Flipkart product search

Scenario:Search for a mobile and select a product

Given Flipkart is opened
When I search for "iPhone 17 Pro"
And I print all product titles
And I select the first product 
Then I print the selected product details
