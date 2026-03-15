
		import java.time.Duration;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

		public class DatePicker {

		    WebDriver driver;

		    public DatePicker(WebDriver driver) {
		        this.driver = driver;
		    }

		    
		    
		    public void selectDate(String datePickerIconXpath, String year, String month, String day) {
		        // 1. Click on the date picker icon
		        WebElement dateIcon = driver.findElement(By.xpath(datePickerIconXpath));
		        dateIcon.click();

		        // 2. Select Year (assuming dropdown exists)
		        WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		        Select selectYear = new Select(yearDropdown);
		        selectYear.selectByVisibleText(year);

		        // 3. Select Month (assuming dropdown exists)
		        WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		        Select selectMonth = new Select(monthDropdown);
		        selectMonth.selectByVisibleText(month);

		        // 4. Select Day
		        WebElement dayElement = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='" + day + "']"));
		        dayElement.click();
		    }
		    
		    public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://testautomationpractice.blogspot.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.manage().window().maximize();
			DatePicker d =new DatePicker(driver);
			d.selectDate("input[id='start-date']", "2025","April","26" );
			
		}
		}
		
		
