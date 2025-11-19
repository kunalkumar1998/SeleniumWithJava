package SeleniumWebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverSetupGuide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How to do Do Setup for Selenium Webdriver in Java
		//1. Create a maven project 
		//2. Click on POm.Xml 
		/*
		 * paste this dependencies and save it
		 * <dependencies> 
   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.36.0</version>
</dependency> 
  </dependencies>
		 */
		
		//After that create a package in Src/test/java folder under package create a class file
		
		//initailize Webdriver 
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		
		//
		driver.get("");
		
		driver.close();
		

	}

}