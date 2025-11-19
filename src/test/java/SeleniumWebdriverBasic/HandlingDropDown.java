package SeleniumWebdriverBasic;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		//Explicit Wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drpcountry = driver.findElement(By.id("country"));
		//Select Class
		Select selectElement = new Select(drpcountry);
		//Select option from dropdown
		selectElement.selectByValue("usa");
		selectElement.selectByIndex(4);
		selectElement.selectByContainsVisibleText("China");
		
		//list 
		List<WebElement>options =selectElement.getOptions();
		System.out.println("Number of Dropdown :" + options.size());
		//printing the options
		for(int i=0; i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
		//Enhanced for 
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		
	 List<WebElement> list = driver.findElements(By.xpath(""));
		
	}

}