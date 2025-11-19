package SeleniumWebdriverBasic;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Get method & Conditional & Browser Method
public class ConditionalGetandBrowserMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Get Method
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//getTitle()
		driver.getTitle();
		System.out.println(	driver.getTitle());
		
		//getCurrentUrl();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		//get 
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.37.0");
		
		//getCurrentUrl();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		//getpageSource()
		driver.getPageSource();
		System.out.println(driver.getPageSource());
	
		//getWindowhandle
		String windowid =driver.getWindowHandle();
		System.out.println(windowid);
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		//getWindowhandles
		Set<String> windowsid =driver.getWindowHandles();
		System.out.println(windowsid);
		
		//conditional Methods 
		// isDisplay() isSelected() isEnabled()
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		// isDisplay()
		WebElement title = driver.findElement(By.xpath("//h1[@class=\"title\"]"));
		title.isDisplayed();
		System.out.println("Title is visible :"+title.isDisplayed());
		
		// isEnabled()
		WebElement typebox = driver.findElement(By.cssSelector("#name"));
		typebox.isEnabled();
		System.out.println("input allowed :"+typebox.isEnabled());
		
		//isSelected
		WebElement checkbox = driver.findElement(By.cssSelector("#sunday"));
		checkbox.isSelected();
		System.out.println("Checkbox Selected :"+checkbox.isSelected());
		
		
		//Browser Methods
		
		driver.close(); //driver.close() will close that window.webdriver is currently focus 
		driver.quit(); // driver.quit() will close all browser instance()
		
		
		
		
	}

}
