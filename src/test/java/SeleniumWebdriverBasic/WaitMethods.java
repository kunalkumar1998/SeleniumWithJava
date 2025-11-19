package SeleniumWebdriverBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//navigate
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		
		//driver.get()
		driver.get("https://www.naukri.com/");
		
		//get methods
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		
		//navigation Methods
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//navigation Methods
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.getTitle();
		System.out.println(driver.getTitle());
	
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		Set<String> windowIds = driver.getWindowHandles();
		
		//Approach1
		List<String> windowlist =new ArrayList(windowIds);
		
		String parentid = windowlist.get(0);
		String childid = windowlist.get(1);
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}