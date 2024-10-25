Feature: Amazon product search
Scenario: Validate the product search with valid inputs
Given user is on the homepage
When User enter the product name that they wanted to search
And User click the search button and also clicks the particular product title they wanted
Then User should lands on the particular product details page 