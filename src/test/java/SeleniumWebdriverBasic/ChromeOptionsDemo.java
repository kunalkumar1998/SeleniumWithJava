package SeleniumWebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		//headless 
		options.addArguments("--headless = new");
		
		
		// incognito tab
		options.addArguments("--incognito");
		
		// SSL Handling 
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
          
		
		// remove "Chrome is being controlled by automated test software 
		options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});
		

	}

}
