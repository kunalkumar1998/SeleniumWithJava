package SeleniumWebdriverBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize Webdriver
	    WebDriver driver =new ChromeDriver();
		
	    //maximize Windows
	    driver.manage().window().maximize();
	    
	    //access website
	    driver.get("https://testautomationpractice.blogspot.com/");

	    //Types of locators
	    //By Xpath
	   WebElement title = driver.findElement(By.xpath("//h1[@class=\"title\"]"));
	   System.out.println(title.getText());
	   
	
	   //By Css Selector 
	   WebElement tit = driver.findElement(By.cssSelector("h1[class=\"title\"]"));
	   System.out.println(tit.getText());
	   
	 
	    //By Class Name 
	    WebElement titleClass = driver.findElement(By.className("title"));
	    System.out.println(titleClass.getTagName());
	    
	  //partialLinkText
	    WebElement guitext = driver.findElement(By.partialLinkText("GUI Ele"));
	    guitext.isDisplayed();
	
	    //linkText
	    WebElement guiElements =driver.findElement(By.linkText("GUI Elements"));
	    guiElements.click();
	    
	    //TagName
	    //driver.findElement(By.tagName(""));
	    
	    // By Name 
		   WebElement name = driver.findElement(By.id("name"));
		    name.sendKeys("Mr. Kunal kumar");
		    
	    //Css selector by name 
	    WebElement  email = driver.findElement(By.cssSelector("#email"));
	    email.sendKeys("mr.hacker@gmail.com");
	    
	    //Css Selector by tagname[attribute ="value"]
	    WebElement  phone = driver.findElement(By.cssSelector("input[placeholder=\"Enter Phone\"]"));
	    phone.sendKeys("98^%^%^&&98");
	    
	    //By xpath 
	   WebElement address = driver.findElement(By.xpath("//*[@id=\"textarea\"]"));
	   address.sendKeys("faridabad");
	   
	   //Find elements()
	    List<WebElement> checkboxlist = driver.findElements(By.xpath("//input[@class='form-check-input' and @type=\"checkbox\" ]"));
	    
	   //using for loop
	    for(int i=0; i<checkboxlist.size();i++) {
	    	
	       checkboxlist.get(i).click();    	
	    }
	    
	    //using for enhanced loop
	    for(WebElement list:checkboxlist) {
	    	
	    	     list.click();
	    }
	    
	   
	}

}