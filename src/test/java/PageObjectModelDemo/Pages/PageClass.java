package PageObjectModelDemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	  
	  driver.findElement(username_loc).sendKeys(username);
	 
   }

   public void setPassword(String password) {
	  
	   driver.findElement(password_loc).sendKeys(password);
   }
   
    public void clickLoginButton() {
	   
	   driver.findElement(loginBtn).click();
   }
}
