package org.definition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;
	
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			System.out.println("User sucessfully enters into the homepage");
			
		} catch (Exception e) {
			System.out.println("User failed to enter into the homepage");
			e.printStackTrace();
			
		}
		
	   
	   
	}
	@When("User enter the product name that they wanted to search")
	public void user_enter_the_product_name_that_they_wanted_to_search() {
	    try {
	    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
	    	System.out.println("User sucessfully enters the product details");
			
		} catch (Exception e) {
			System.out.println("User failed to enter the product details");
			e.printStackTrace();
			
		}
	   
	}
	@And("User click the search button and also clicks the particular product title they wanted")
	public void user_click_the_search_button_and_also_clicks_the_particular_product_title_they_wanted() {
    try {
    	driver.findElement(By.id("nav-search-submit-button")).click();
    	driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 (128 GB) - Starlight'])[3]")).click();
    	System.out.println("User sucessfuly clicks the search button and also clicks the particular product title");
		
	} catch (Exception e) {
		System.out.println("User failed to click the search button and also the particular product title");
		
	}
	    
	    
	}
	@Then("User should lands on the particular product details page")
	public void user_should_lands_on_the_particular_product_details_page() {
		try {
			String expectedTitle = "Amazon.in : iphone 14";
			String actualTitle = driver.getTitle().trim();
			
			
			if(actualTitle.equals(expectedTitle)) {
				System.out.println("User sucessfully lands on the particular product details page");
			}
			else {
				System.out.println("User failed to lands on the particular product details page");
			}
			
		} catch (Exception e) {
			System.out.println("Changed by QA");
			
		}
	   
	}


}
