package webDriver_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_DatePicker_With_Dropdown {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	     driver.manage().window().maximize();
	     
	     
	     //Locator for DOB input box
	     driver.findElement(By.xpath("//input[@id='dob']")).click();
	     
	     //To select month
	     Select month_drp=new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
         month_drp.selectByVisibleText("May");
        
         //To select year
         Select year_drp=new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
	     year_drp.selectByVisibleText("2012");
	     
	     //To select date
	     String date="5";
	     List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	     for(WebElement ele:alldates)
	     {
		   String dt=ele.getText();
		   if(dt.equals(date))
		   {
			   ele.click();
			   break;
		   }
	     }
	
	}

}
