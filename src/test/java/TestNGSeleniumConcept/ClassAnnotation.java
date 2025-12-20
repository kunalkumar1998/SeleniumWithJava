package TestNGSeleniumConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotation {

	@BeforeClass
	public void  Method() {
		System.out.println("Before Class ...");
	}
	
	@AfterClass
   public void  Method1() {
		System.out.println("After Class ...");
	}
	
   @Test(groups= {"Regression"})
  public void  Method2() {
	   System.out.println("Testing ...");
  }

	
}
