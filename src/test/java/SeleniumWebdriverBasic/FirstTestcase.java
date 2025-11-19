package SeleniumWebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("testing...");
		
		//launch Browser 
		//ChromeDriver driver = new ChromeDriver();
		
		//other approach 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
		// open Url 
		driver.get("https://www.google.com/");
		
		//validate title 
		String  act_title = driver.getTitle();
		
		if(act_title.equals("Google")) {
			System.out.println("Test Passed");
			
		}
		else {
			System.out.println("Test Failed");
		}
		
		
		//quit driver 
		driver.close();

	}

}