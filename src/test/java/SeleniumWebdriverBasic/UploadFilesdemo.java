package SeleniumWebdriverBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//upload single file
	   driver.findElement(By.xpath("//input[@id=\"singleFileInput\"]")).sendKeys("C:\\Users\\kunal\\Downloads\\practice (12).txt");
	   
	   driver.findElement(By.xpath("//button[text() ='Upload Single File']")).click();
	   
	   if(driver.findElement(By.xpath("//p[@id=\"singleFileStatus\"]")).equals("practice (12).txt")) {
		   
		   System.out.println("file upload succesfully");
	   }
	   else 
	   {
		   System.out.println("file upload Failed ... ");
	   }

	}

}
