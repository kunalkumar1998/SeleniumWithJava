package POMdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {
	
  WebDriver driver;
	
  PageClass(WebDriver driver)
  {
	  driver = this.driver;
	  
  }
  
  //locators
  By username_loc=By.xpath("//input[@name=\"username\"]");
  By password_loc =By.xpath("//input[@name=\"password\"]");
  By loginBtn = By.xpath("//button[@type=\"submit\"]");
  
    //action Methods
   public void setusername(String username) {
	  
	   WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
//	   WebElement setusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(username_loc));
//	   setusername.sendKeys(username);
	  driver.findElement(username_loc).sendKeys(username);
	 
   }

   public void setPassword(String password) {
	  
	   driver.findElement(password_loc).sendKeys(password);
   }
   
    public void clickLoginButton() {
	   
	   driver.findElement(loginBtn).click();
   }
}
