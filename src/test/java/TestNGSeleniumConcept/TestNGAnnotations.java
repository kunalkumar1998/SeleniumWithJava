package TestNGSeleniumConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	
	WebDriver driver;

	//@BeforeMethod
	@Test(priority=1)
	public void OpenBrowser() {
      
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://sauce-demo.myshopify.com/account/login");
		driver.manage().window().maximize();

	}
	//DependOnMethods 
	@Test(priority=2, dependsOnMethods = {"OpenBrowser"})
	public void LoginApp() {
		
		driver.findElement(By.id("customer_email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("customer_password")).sendKeys("xyz@1234");
		driver.findElement(By.xpath("//input[@value=\"Sign In\"]")).click();
	}
	
	//@AfterMethod
	@Test(priority=3)
	public void CloseBrowser() {
		
		driver.close();
	}
	
	
}
