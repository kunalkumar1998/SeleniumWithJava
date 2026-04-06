package PageObjectModelDemo.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	WebDriver driver;
	
	@BeforeClass
	public void TestStep() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void LoginTest() {
		PageClass pg = new PageClass(driver);
		pg.setusername("Admin");
		pg.setPassword("admin123");
		pg.clickLoginButton();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	
	@AfterClass
	public void AfterTest() {
		driver.quit();
	}

}
