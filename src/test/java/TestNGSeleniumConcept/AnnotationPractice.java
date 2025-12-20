package TestNGSeleniumConcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class AnnotationPractice {

	//BeforeMethod
	//AfterMethod
	
	//BeforeClass
	//AfterClass
	
	//BeforeTest
	//AfterTest
	
	//beforeSuite 
	//aftersuite
	
	@BeforeMethod
	public void TestSetup() {
		System.out.println("Before Method ");
		
	}
	
	@AfterMethod
	public void TestClosure() {
		System.out.println("After Method ");
		
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class ");
		
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class ");
		
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test ");
		
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test ");
		
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite ");
		
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite.. ");	
	}
	
	@Test
	public void TestMethod() {
		
		System.out.println("Testing..");
		
	}
	
	
}


