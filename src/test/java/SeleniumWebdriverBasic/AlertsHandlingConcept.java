package SeleniumWebdriverBasic;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHandlingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		//Explicit Wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Handling Simple alert
		driver.findElement(By.xpath("//button[text()=\"Simple Alert\"]")).click();
	
		mywait.until(ExpectedConditions.alertIsPresent());
		
		//handle Simple alert 
		Alert myalert =driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		
		//Handling Confirmation alert
		driver.findElement(By.xpath("//button[text()=\"Confirmation Alert\"]")).click();
			
		mywait.until(ExpectedConditions.alertIsPresent());
				
	     //handle Simple alert 
		Alert confirmalert =driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		confirmalert.accept(); //will click on ok
		//confirmalert.dismiss();  // handle cancel option
				
		//Handling Confirmation alert
		driver.findElement(By.xpath("//button[text()=\"Prompt Alert\"]")).click();
					
		mywait.until(ExpectedConditions.alertIsPresent());
						
	   //handle Simple alert 
		Alert promptalert =driver.switchTo().alert();
		System.out.println(promptalert.getText());
		promptalert.sendKeys("Welcome to Automation World");

		promptalert.accept(); //will click on ok
	   //myalert.dismiss();  // handle cancel option
		
		driver.close();
		
	}
	
	

}
