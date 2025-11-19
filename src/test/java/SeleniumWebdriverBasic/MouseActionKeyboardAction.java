package SeleniumWebdriverBasic;

import java.awt.Desktop.Action;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;

public class MouseActionKeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//Actions  class will be used to perfom mouse actions
		//Action  interface is used to stored created actions
		
		
		//action class used to perform
		Actions act = new Actions(driver);
		
		//build() - create action
		//perform() - perform action
		
		WebElement  demos =driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement example =driver.findElement(By.xpath("//a[text()='Start here.']"));
		
		//demos.click();
		//mouse hover
		//act.moveToElement(demos).moveToElement(example).build().perform();
		
		//mouse hover & click
		act.moveToElement(demos).moveToElement(example).click().build().perform();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement element = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		//right click 
	//	act.contextClick(element).perform();
		
	     //double click 
         act.doubleClick(element).build().perform();
         
         //drag drop Element 
         WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
         WebElement dragged = driver.findElement(By.xpath("//div[@id='droppable']"));
         
         //drag & drop
         act.dragAndDrop(draggable, dragged).build().perform();
         
         //action
         
         //Handling Slider 
         driver.navigate().to("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
         
         WebElement minSlider = driver.findElement(By.xpath("//div[@class=\"price-range-block\"]//span[1]"));
         System.out.println("Default Location of min slider" +minSlider.getLocation());
         
         act.dragAndDropBy(minSlider, 100,249).perform();
         System.out.println("Default Location of min slider" +minSlider.getLocation());
         
         WebElement maxSlider = driver.findElement(By.xpath("//div[@class=\"price-range-block\"]//span[2]"));
         System.out.println("Default Location of max slider" +maxSlider.getLocation());
         act.dragAndDropBy(maxSlider,-100,249).perform();
         System.out.println("Default Location of max slider" +maxSlider.getLocation());
        
         //Handling Keyboard Actions
         
         //Actions act = new Actions(driver);
         driver.navigate().to("https://text-compare.com/");
         
         driver.findElement(By.xpath("//textarea[@name=\"text1\"]")).sendKeys("Welcome to Automation");
         
         //perform Control +A
         act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
         
         //perform Control +C
         act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
         
         //perform tab 
         act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
         
         //perform control +V
         act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
         
         
         //handle and switch to window handle
         List<Strings> ids = new ArrayList(driver.getWindowHandles());
         
         //driver.switchTo().newWindow(ids.get(0));
         
     
         
         
	}

}
