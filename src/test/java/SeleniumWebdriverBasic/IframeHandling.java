package SeleniumWebdriverBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Webdriver
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//frame 
		WebElement frame =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame);
		driver.findElement(By.cssSelector("input[name=\"mytext3\"]")).sendKeys("Kunal Kumar");
//        driver.switchTo().frame(0);    
//		
//		driver.findElement(By.xpath("//*[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		driver.switchTo().defaultContent();
		
		//frame  
		WebElement frame1 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.cssSelector("input[name=\"mytext2\"]")).sendKeys("Kunal Kumar");
		
		driver.switchTo().defaultContent();
		
		driver.close();		
	}

}
