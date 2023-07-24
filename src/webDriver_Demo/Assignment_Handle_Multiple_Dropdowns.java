package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Handle_Multiple_Dropdowns {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
	
		
		//Shadow DOM Locator for "Role" dropdown 
		SearchContext signupform=driver.findElement(By.cssSelector("#maincontent > div > section.right > div > dw-de-signup-form")).getShadowRoot();
		SearchContext dxselect=signupform.findElement(By.cssSelector("form:nth-child(1) > dx-select:nth-child(4)")).getShadowRoot();
		Select jobRoleDrp = new Select(dxselect.findElement(By.cssSelector("#select")));
		jobRoleDrp.selectByVisibleText("Administrator");
		
		
		//Shadow DOM Locator for "Country" dropdown
		SearchContext signupform1=driver.findElement(By.cssSelector("#maincontent > div > section.right > div > dw-de-signup-form")).getShadowRoot();
		SearchContext dxselect1=signupform1.findElement(By.cssSelector("form:nth-child(1) > dx-select:nth-child(6)")).getShadowRoot();  
		Select countryDrp = new Select(dxselect1.findElement(By.cssSelector("#select")));
		countryDrp.selectByVisibleText("British Indian Ocean Territory");
	}

}
