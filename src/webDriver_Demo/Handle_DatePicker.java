package webDriver_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//It is an customized web element
//Becoz date picker will not be the same for every application,
//so it will be having different type of designs.
public class Handle_DatePicker {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.redbus.in/");
	     driver.manage().window().maximize();
	     
	     String year="2022";
	     String month="September";
	     String date="10";
	     
	     
	     //To open the date picker
	     driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	     
	     //Not working(NoSuchWindowException & NoSuchElementException)
	     while(true)
	     {
	    	 String monthyear=driver.findElement(By.cssSelector(".monthTitle")).getText();
	    	 String arr[]=monthyear.split(" ");
	    	 String mon=arr[0];
	    	 String yr=arr[1];
	    	 if(mon.equalsIgnoreCase(month) && yr.equals(year))
	    	 break; 
	    	 else
	    	 driver.findElement(By.cssSelector("td[class='next'] button")).click();
	    	 
	     }
	     
	     //To select date
	     List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
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
