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

//If we want to use Fluent wait for multiple elements,
//then we have to create generic method.
public class Demo_Fluent_Wait_With_generic_Method {

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
         
         By elementLoc=By.xpath("//h3[text()='Selenium']");
         waitForElementWithFluentWait(driver,elementLoc).click();
         
	}
	
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator)
	{
		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
        		 .withTimeout(Duration.ofSeconds(30))
        		 .pollingEvery(Duration.ofSeconds(2))
        		 .ignoring(NoSuchElementException.class);
		 
		 WebElement element=wait.until
        		 (new Function<WebDriver, WebElement>()
                 {
        	     public WebElement apply(WebDriver driver)
        	     {
        		 return driver.findElement(locator);
        	     }
                 }
                 );
                 return element;
        
	}

	
	
	
}
