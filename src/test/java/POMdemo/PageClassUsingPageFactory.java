package POMdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClassUsingPageFactory {

	
	WebDriver driver;
	
	 //Constructor
	  PageClassUsingPageFactory(WebDriver driver)
	  {
		  driver = this.driver;
		  PageFactory.initElements( driver,this);
	  }
	  
	  //Locators
	  
	  @FindBy(xpath="\"//input[@name=\\\"username\\\"]")
	  WebElement username;
	  
	  @FindBy(xpath="//input[@name=\\\"password\\\"]")
	  WebElement password;
	  
	  @FindBy(xpath="//button[@type=\\\"submit\\\"]")
	  WebElement loginBtn;
	  
	  //another way
	  @FindBy(how=How.XPATH , using=" \"//input[@name='username']")
      WebElement user;
	  
	  //actions method
	  
	  public void setUsername(String usernameval){
		  
		  username.sendKeys(usernameval);
	  }

     public void setPassword(String pass){
		  
		  password.sendKeys(pass);
	  }
  
    public void login() {
	  
    	loginBtn.click();
    	
  }
}
