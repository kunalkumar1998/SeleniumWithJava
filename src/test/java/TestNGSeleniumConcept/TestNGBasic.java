package TestNGSeleniumConcept;

import org.testng.annotations.Test;

public class TestNGBasic {

	//open browser
	//login 
	//close browser
	@Test(priority=1 )
	public void openBrowser() {
		System.out.println("Openning Browser ...");
	}
	@Test(priority =2)
	public void loginApplication() {
		System.out.println("Login Application ...");
	}
	@Test(priority = 3)
	public void closeBrowser() {
		System.out.println("Closing Browser ...");
	}
}
