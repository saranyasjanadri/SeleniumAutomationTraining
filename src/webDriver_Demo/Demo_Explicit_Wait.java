package webDriver_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Explicit wait is basically element specific,so we can wait for the element.
//We have to add explicit wait multiple times for different elements.
//We need to specify certain condition along with the time.
//It will wait till certain condition is matched.
public class Demo_Explicit_Wait {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
	     driver.get("http://www.google.com");
	     driver.manage().window().maximize();
		
	     
	     
		 //To use explicit wait we have the special class WebDriverWait class.
	     //mywait-->WebDriver reference variable
	     //until-->is an method
	     //ExpectedConditions--> is an predefined class in selenium
	     //inside this class so many conditional methods are available like 
	     //visibilityOfElementLocated,elementToBeClickable,elementIsPresent etc
	     //pass the locator into the required method for our scenario.
	     WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	     
	     //Locator for search box
         driver.findElement(By.name("q")).sendKeys("Selenium");
        
         //To press ENTER key
         driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	     
         
         
         //How it works:
	     //If the element is located,then the condition will match,
	     //Once the condition is matched, it returns true and then the
	     //element will be stored in the variable element.
	     //After getting the element we can perform the actions.
         //If the element is not at all available, it should not wait
         //for long time.It should exit at certain cut off time we specified.
         //& it will throw some exception like ElementNotAvailable or NoSuchElementFound.
         //To handle the exception there is no internal specific mechanism.
         //We have to write additionally try catch block to handle it.
	     WebElement element= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
	     element.click();
	    
	}

}
