package com.project.stepdefanition;

import java.io.File;
import java.io.IOException;
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

public class mobilevalidationsteps {
	
	static WebDriver driver;
	
	@Given("user launch the flipkart application")
	public void user_launch_the_flipkart_application()  {
	    WebDriverManager.chromedriver().setup();
	    
	    driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	  
	    
	}

	@Given("user handle login")
	public void user_hande_login(){

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement log=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		log.click();
			
	    
	}

	String name1="";
	
	@When("user search mobile {string}")
	public void user_search_mobile(String mobile) {
	    // Write code here that turns the phrase above into concrete actions
		 
		name1=mobile;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement name=driver.findElement(By.xpath("//input[@name='q']"));
			name.sendKeys(name1,Keys.ENTER);
	   
	}
	
		
	  
	

	@When("user select the mobile and click add to cart")
	
	public void user_select_the_mobile_and_click_add_to_cart() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement mob=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
		mob.click();
		
     Set<String> child=driver.getWindowHandles();
		
		List<String> name = new ArrayList<>(child);
		
		driver.switchTo().window(name.get(1));
		
		WebElement mobname=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		
	      String text=	mobname.getText();
	
	System.out.println(text);
	   
	}

	@When("user doing payment")
	
	public void user_doing_payment() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement down =driver.findElement(By.xpath("//div[text()='Specifications']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		
				   
	}

	@Then("user recive the confirmation message")
	
	public void user_recive_the_confirmation_message() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File ip=tk.getScreenshotAs(OutputType.FILE);
		
		File out =new File("C:\\Users\\AR\\eclipse-workspace\\Cucumbersep\\src\\test\\resources/Redmi");
		
		FileUtils.copyFile(ip,out);
		
		driver.quit();
	   
	}


@When("user search mobile by using oneD list")
   

    public void user_search_mobile_by_using_oneD_list(io.cucumber.datatable.DataTable dataTable) {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	  List<String> datas =dataTable.asList();
	  
	  
		name1=datas.get(1);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement name=driver.findElement(By.xpath("//input[@name='q']"));
			name.sendKeys(name1,Keys.ENTER);
}
	

@When("user select the mobile and click add to cart oneD")
 
public void user_select_the_mobile_and_click_add_to_cart_oneD() {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // Write code here that turns the phrase above into concrete actions
	
	WebElement sam =driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
	sam.click();
	
 Set<String> samchild=driver.getWindowHandles();
	
	List<String> redmi = new ArrayList<>(samchild);
	
	driver.switchTo().window(redmi.get(1));
	
	WebElement sammobname=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
	
      String text1=	sammobname.getText();

System.out.println(text1);
    
}

@When("user doing payment oneD")
public void user_doing_payment_oneD() {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // Write code here that turns the phrase above into concrete actions
	
	WebElement down =driver.findElement(By.xpath("//div[text()='Specifications']"));
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	

	
	js.executeScript("arguments[0].scrollIntoView(true)", down);
	
    
}

@Then("user recive the confirmation message oneD")
public void user_recive_the_confirmation_message_oneD() throws Throwable {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // Write code here that turns the phrase above into concrete actions
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	TakesScreenshot tk = (TakesScreenshot)driver;
	
	File ip1=tk.getScreenshotAs(OutputType.FILE);
	
	File out1 =new File("C:\\Users\\AR\\eclipse-workspace\\Cucumbersep\\src\\test\\resources/Samsung");
	
	FileUtils.copyFile(ip1,out1);
	
	driver.quit();
   
}
    
}


