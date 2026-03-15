package SeleniumWebdriverBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		//input date 
		String requireYear = "2025";
		String requireMonth = "April";
		String requireDate = "27";
		
		driver.findElement(By.xpath("//input[@id='start-date']")).click();
		

	}

}
