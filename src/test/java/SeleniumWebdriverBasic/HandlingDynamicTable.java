package SeleniumWebdriverBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//navigate 
		//driver.navigate().to("");
		
		
		
	String talPage = driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li[4]")).getText();
	
	
	   int Page = Integer.parseInt(talPage);
	   
		
		System.out.println("TotalPag "+ Page);
		
		
		
		for(int p =1;p<=Page; p++)
			{
		
			if(p>1) {
				
				WebElement active = driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
				active.click();
			     
		}
			//reading Data table
		 int noOfRows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
		 for(int r=1 ;r< noOfRows ;r++) {
			 
			 
			String  deviceName=  driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
			 String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+p+"]//td[3]")).getText();
			 
//			 WebElement element = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+p+"]//td[4]"));
//			 element.click();
			 
			 
			 System.out.println(deviceName + "\t" + price );	 
			 
		 }
			
			
		}
		
		
	}

}
