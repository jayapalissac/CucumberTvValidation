package com.project.stepdefanition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvValidationsteps {
	
String name1="";
	@When("user search Tv {string}")
	public void user_search_Tv(String Tv) {
	    // Write code here that turns the phrase above into concrete actions
		
  name1=Tv;
		
		mobilevalidationsteps.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement name=mobilevalidationsteps.driver.findElement(By.xpath("//input[@name='q']"));
			name.sendKeys(name1,Keys.ENTER);
	
	}

	@When("user select the Tv and click add to cart")
	public void user_select_the_Tv_and_click_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		
		mobilevalidationsteps.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mob=mobilevalidationsteps.driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
		mob.click();
		
     Set<String> child=mobilevalidationsteps.driver.getWindowHandles();
		
		List<String> name = new ArrayList<>(child);
		
		mobilevalidationsteps.driver.switchTo().window(name.get(1));
		
		WebElement mobname=mobilevalidationsteps.driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		
	      String text=	mobname.getText();
	
	System.out.println(text);
	   
	}
	   
	}	
	
	
	
	
//static WebDriver driver;
	
//	@Given("user launch the flipkart application")
//	public void user_launch_the_flipkart_application()  {
//	    WebDriverManager.chromedriver().setup();
//	    
//	    driver=new ChromeDriver();
//	    driver.get("https://www.flipkart.com/");
//	    driver.manage().window().maximize();
//	  
//	    
//	}
//
//	@Given("user handle login")
//	public void user_hande_login(){
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement log=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		
//		log.click();
//			
//	}
// 
//String name1="";
//	
//	@When("user search mobile {string}")
//	public void user_search_mobile(String Tv) {
//	    // Write code here that turns the phrase above into concrete actions
//		 
//		name1=Tv;
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		WebElement name=driver.findElement(By.xpath("//input[@name='q']"));
//			name.sendKeys(name1,Keys.ENTER);
//	   
//	}
//	
//	
//
//	@When("user select the mobile and click add to cart")
//	
//	public void user_select_the_mobile_and_click_add_to_cart() {
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//		WebElement mob=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
//		mob.click();
//		
//     Set<String> child=driver.getWindowHandles();
//		
//		List<String> name = new ArrayList<>(child);
//		
//		driver.switchTo().window(name.get(1));
//		
//		WebElement mobname=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
//		
//	      String text=	mobname.getText();
//	
//	System.out.println(text);
//	   
//	}
//
//	@When("user doing payment")
//	
//	public void user_doing_payment() throws Throwable {
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		WebElement down =driver.findElement(By.xpath("//div[text()='Specifications']"));
//		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		
//				   
//	}
//
//	@Then("user recive the confirmation message")
//	
//	public void user_recive_the_confirmation_message() throws Throwable {
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		TakesScreenshot tk = (TakesScreenshot)driver;
//		
//		File ip=tk.getScreenshotAs(OutputType.FILE);
//		
//		File out =new File("C:\\Users\\AR\\eclipse-workspace\\Cucumbersep\\src\\test\\resources/Redmi");
//		
//		FileUtils.copyFile(ip,out);
//		
//		driver.quit();
//	   
//	}
//
//		
//
//

