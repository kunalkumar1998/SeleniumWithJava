package TestNGSeleniumConcept;

import org.testng.annotations.Test;

public class DataProvider {

	@Test
	@DataProvider()
	Object[][] loginData()= {
		
		Object data[][] = {

				{"xyz@gmail.com|","test"},
				{"xtysusi@gmail.com" ,"test122"
		}
	}
	
}
