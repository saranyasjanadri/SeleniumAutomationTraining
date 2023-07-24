package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators_id_name {

	public static void main(String[] args) throws InterruptedException
	{
	    //Sets the system property
		System.setProperty("webdriver.edge.driver", "C:\\Users\\CSC\\Downloads\\Browser Drivers\\msedgedriver.exe");

		// Creating new object for Edge driver
		WebDriver driver = new EdgeDriver();
		
		//Launching the url
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
        Thread.sleep(2000);
	
		
		
		 /* The o/p of this findElement() is a WebElement,we can assign this to a
		 * variable Unm and that should be  of webElement data type.
		 * Variable Unm is pointing to the textbox from fb
		 */

	
		
		
		/* To find a text box
		 *  driver-->is an instance(object)
		 *  findElement--> is an method of WebDriver class
		 *  By --> is a class
		 *  id --> is an locator or attribute
		 *  email -->is the value
		 */
		WebElement Unm = driver.findElement(By.id("email"));

		
		
		/*To enter the data to it 
		 * sendKeys -- is a method used to pass some data to the WebElement
		 */
		Unm.sendKeys("saranyainfor@gmail.com");

		
		
		
		/*We can pass this to a variable and then use any action like
		  sendKeys() or directly use sendKeys() after findElement
		 */

		driver.findElement(By.name("pass")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		
	}

}
