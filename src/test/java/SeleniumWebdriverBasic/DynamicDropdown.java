package SeleniumWebdriverBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	List<WebElement> list=driver.findElements(By.xpath("//ul[@role ='listbox']//li//div[@role='option']"));
	
	for(int i =0; i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("selenium")) {
			list.get(i).click();
			break;
			
	}
		
	}}}
