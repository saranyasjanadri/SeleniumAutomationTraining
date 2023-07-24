package webDriver_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//For multiple elements we have to repeat the code for multiple times.
//Instead of this,we are creating the generic method 
public class Demo_Explicit_Wait_With_Generic_Method {

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
        
        By eleLocator=By.xpath("//h3[text()='Selenium']");
        
        //waitforElementPresent(driver,eleLocator,10).click();
        //OR
        WebElement element=waitforElementPresent(driver,eleLocator,10);
        element.click();
        
	}
	
	
	public static WebElement waitforElementPresent(WebDriver driver, By locator, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		//presenceOfElementLocated-->This is applicable for all kinds of elements.
		//It verifies just the presence of element.
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}

}
