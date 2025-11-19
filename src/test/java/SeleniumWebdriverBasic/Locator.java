package SeleniumWebdriverBasic;


import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println("You're Doing something Great ");
	 System.out.println("Testing is in Progress ......");
		
		WebDriver driver = new ChromeDriver();
		
		//go to url
		driver.get("https://www.naukri.com/");
		//maximize window
		driver.manage().window().maximize();
		
		//Implicit wait 
		//it will implement when wait is required in all script
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit Wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		
		// Locator 
		//by id
		WebElement signin = driver.findElement(By.id("login_Layer"));
		signin.click();
		
		//by xpath
		WebElement username = driver.findElement(By.cssSelector("input[placeholder=\"Enter your active Email ID / Username\"]"));
		username.sendKeys("kunalkumar20898@gmail.com");
		
		//By css selector
		WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Enter your password\"]"));
		password.sendKeys("Password");
		
		//By tagname
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
		//by link text
		WebElement viewProfile = driver.findElement(By.linkText("View profile"));
		//explict Wait
     	mywait.until(ExpectedConditions.elementToBeClickable(viewProfile));
		viewProfile.click();
		
		
	
		
		//

		//By xpath
		WebElement jobs= driver.findElement(By.xpath("//div[text()='Jobs']"));
		jobs.click();
		
//		List<WebElement> checkboxes = driver.findElements(By.className("dspIB naukicon naukicon-ot-checkbox"));
//
//		for (WebElement checkbox : checkboxes) {
//		    if (!checkbox.isSelected()) {
//		        checkbox.click();
//		    }
//		}
//		
		
        // Locate all job checkboxes inside jobTuple cards
        List<WebElement> checkboxes = driver.findElements(
            By.xpath("//article[contains(@class,'jobTuple')]//div//i[@class=\"dspIB naukicon naukicon-ot-checkbox\"]")
        );

        int selectedCount = 0;

        for (WebElement checkbox : checkboxes) {
            if (selectedCount >= 5) {
                break; // stop after selecting 5
            }

            // Only click if not already selected
            if (!checkbox.isSelected()) {
                checkbox.click();
                selectedCount++;
            }
        }

     // Click on Apply Job button (adjust locator as per actual DOM)
        WebElement applyButton = driver.findElement(
            By.xpath("//button[contains(text(),'Apply')]")
        );
        applyButton.click();

      
        
     
  WebElement cancel = driver.findElement(By.xpath("//div[@class=\"crossIcon chatBot chatBot-ic-cross\"]"));
  cancel.click();
  

		//driver.close();
	}
	
}