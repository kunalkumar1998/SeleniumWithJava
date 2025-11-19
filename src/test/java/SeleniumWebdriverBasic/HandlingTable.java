package SeleniumWebdriverBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 int rows=
	 driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
	 
	 System.out.println("Numbers of rows :" +rows);
	 
	 int column = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
			 
	System.out.println("Numbers of column: " +column);
		
	
	   //read all data from 
	   for(int r =2 ; r<rows;r++) {
		for(int c=1 ; c<column; c++) {
			String value =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
			System.out.println(value);
		}
		System.out.println();
		
	}
	   
	   for(int r=2;r<=rows ;r++) {
		   String authorname =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
		   if(authorname.equals("Amit")) {
			   String bookName =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();
			   System.out.println(bookName + "\t"+authorname);
		   }
	   }
		
	}

}