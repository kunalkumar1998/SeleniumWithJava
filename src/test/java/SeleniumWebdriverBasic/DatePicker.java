package SeleniumWebdriverBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	
	static void SelectForwardDate(WebDriver driver, String date,String month, String year){
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		  
		while(true) {
			  String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			  String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			  if(currentyear.equals(year) && currentmonth.equals(month)) {
				  
				  break;
			  }
			  
			  WebElement forwardIcon =driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")); 
			  forwardIcon.click();
		  }
		//Select date
		 List<WebElement> alldates= driver.findElements(By.xpath("//table[@class=\'ui-datepicker-calendar\']//tbody//tr//td/a"));
		  
		 for(WebElement dt: alldates) {
			 if(dt.getText().equals(date)) {
				 
				 dt.click(); 
			 }
			 
		 }
		
	}
	
static void SelectBackwardDate(WebDriver driver, String date,String month, String year){
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		  
		while(true) {
			  String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			  String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			  if(currentyear.equals(year) && currentmonth.equals(month)) {
				  
				  break;
			  }
			  
			  WebElement forwardIcon =driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")); 
			  forwardIcon.click();
		  }
		//Select date
		 List<WebElement> alldates= driver.findElements(By.xpath("//table[@class=\'ui-datepicker-calendar\']//tbody//tr//td/a"));
		  
		 for(WebElement dt: alldates) {
			 if(dt.getText().equals(date)) {
				 
				 dt.click(); 
			 }
			 
		 }
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
	  driver.manage().window().maximize();
	  
	  driver.get("https://jqueryui.com/datepicker/");
	  
	  driver.switchTo().frame(0);
	  
	  driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	  
	  SelectForwardDate(driver, "27","August", "2026");
	  //Method 1
	  //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/05/2025");
	  
     // Method 2
	  String month = "May";
	  String year ="2025";
	  String date ="26";
	  
	  while(true) {
		  String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		  String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		  if(currentyear.equals(year) && currentmonth.equals(month)) {
			  break;
		  }
		  
		  WebElement forwardIcon =driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")); 
		  forwardIcon.click();
		  WebElement backwardIcon = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
	    backwardIcon.click();
	      
	  
	  }
	  
	  //Select the dates 
	  List<WebElement> alldates= driver.findElements(By.xpath("//table[@class=\'ui-datepicker-calendar\']//tbody//tr//td/a"));
	  
	 for(WebElement dt: alldates) {
		 if(dt.getText().equals(date)) {
			 
			 dt.click(); 
		 }
	 } 
	 driver.close();
	}
}
