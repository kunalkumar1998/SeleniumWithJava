package TestNGSeleniumConcept;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

	
	@Test
	public void test () {
		
		System.out.println("Assertion Validation...");
		
		int a = 9;
		int b =0;
		
		// Hard Assertion 
		Assert.assertEquals(a, b);
		
		//Soft Assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		
		System.out.println("After Assertion ");
		//this will required for soft assertion
		sa.assertAll();
		
	}
}
