package SeleniumWebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//xpath Axes concept 
		//ancenstor 
		//descenstor
		//following-sibling
		//precending-sibling
		//child
		//parent
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		//Xpath axes 
		//mix xpath it contains both absolute and relative Xpath
		// eg :-  //div[@class="column"]  Relative Xpathh\
	
		//Absoulte Xpath
		// Eg : /html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[5]/div[1]/div/div/button
		
		
		//child 
		driver.findElement(By.xpath("//div[@class=\"widget-content\"]/child::button[text() ='New Tab']")).click();
		
		
		//parent::
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]/parent::div")).click();
		
		//descendant 
		driver.findElement(By.xpath("//div[@class=\"column\"]//descendant::button")).click();
		
		// Ancestor::
		driver.findElement(By.xpath("//button[@id=\"PopUp\"]/ancestor::div[2]")).click();
		
		//following-sibling
		driver.findElement(By.xpath("//button[@id=\"alertBtn\"]/following-sibling::button[1]")).click();
		
		//precending-sibling
		driver.findElement(By.xpath("//button[@id=\"promptBtn\"]")).click();
	}

}
