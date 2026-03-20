package SeleniumWebdriverBasic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1 full page Screenshot 
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile =new File(System.getProperty("user.dir")+ "\\screenshots\\fullpage.png");
		
		sourcefile.renameTo(targetfile);
		
		
		//Capture the screens
		WebElement  featureProduct = driver.findElement(By.xpath("//button[@class=\"submit-btn\"]"));
		File sourcefil = featureProduct.getScreenshotAs(OutputType.FILE);
		
		File targetfil = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		
		sourcefil.renameTo(targetfil);
		
		
		
 
	}

}
