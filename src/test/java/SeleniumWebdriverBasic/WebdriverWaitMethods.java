package SeleniumWebdriverBasic;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//initialize Webdriver
	   WebDriver driver = new ChromeDriver();
	   
		//Java provide sleep
	    // Thread.sleep(2000);
	   
	   //Implicit wait Explicit Wait Fluent wait
	   //Implicity wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit Wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Used of explicit wait 
		WebElement newtab =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"New Tab\"]")));
		newtab.click();
		
		//focus on main page 
		driver.switchTo().defaultContent();
		
		//Fluent wait 
		//Declaration of fluent Wait
		Wait<WebDriver> mywaitt =new FluentWait<WebDriver>(driver)
		   .withTimeout(Duration.ofSeconds(10))
		   .pollingEvery(Duration.ofSeconds(5))
		   .ignoring(NoSuchElementException.class);
		
		WebElement txtemail = mywait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.cssSelector("#email"));
			}
		});
		
	}

}