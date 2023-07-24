package webDriver_Demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

//Fluent wait is similar to Explicit wait with more flexibility
//in polling time and ignoring exceptions.
//Here the exception is also a part of it.No need to write externally.
//Polling:
//If we give max 30s timeout & 5s polling time,Our wait will go and check
//for the presence of element every 5s.So totally 6 times it will poll for checking the element.
public class Demo_Fluent_Wait {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
	     driver.get("http://www.google.com");
	     driver.manage().window().maximize();
	     
	     //Locator for search box
         driver.findElement(By.name("q")).sendKeys("Selenium");
        
         //To press ENTER key
         driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
         
         
         //Declaration of Fluent wait:
         
         Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
        		 .withTimeout(Duration.ofSeconds(30))
        		 .pollingEvery(Duration.ofSeconds(5))
        		 .ignoring(NoSuchElementException.class);
        
         
         //implementation/Usage of Fluent wait:
         WebElement element=mywait.until
        		 (new Function<WebDriver, WebElement>()
                 {
        	     public WebElement apply(WebDriver driver)
        	     {
        		 return driver.findElement(By.xpath("//h3[text()='Selenium']"));
        	     }
                 }
                 );
         element.click();
         
	
	
	
	}

}
