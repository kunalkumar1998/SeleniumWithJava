package SeleniumWebdriverBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement inputbox =driver.findElement(By.xpath("//input[@id=\"name\"]"));
		
		
		// JavaScript Executor 
		//handled input box 
		//import from import org.openqa.selenium.JavascriptExecutor;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value' , 'john')",inputbox);
		
		
		
		// Handled Radio button 
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()",radioBtn);
		
		//Handled Scroll bar by javascript 
		js.executeScript("window.scrollBy(0,2000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Handled Scroll bar till element visible
		
		WebElement element = driver.findElement(By.xpath("//a[@class=\"active\"]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//scroll till end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//scrolling back to previous position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		// Zooom by Javascript at  some level 
		js.executeScript("document.body.style.zoom ='50%'");
		
		//other way of implementation 
		/*
		 * ChromeDriver driver = new ChromeDriver();
		  JavascriptExecutor js = driver;
		  js.executeScript("arguments[0].click()",radioBtn);
		  js.executeScript("arguments[0].setAttribute('value' , 'john')",inputbox);
		  
		*/
		
	}
	
}
