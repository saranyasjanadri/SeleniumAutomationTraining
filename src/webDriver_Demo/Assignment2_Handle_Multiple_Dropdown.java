package webDriver_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_Handle_Multiple_Dropdown 
{
    static WebDriver driver;
	
    public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/au/form/signup/freetrial-sales/?d=mo1-btn-ft");
		driver.manage().window().maximize();
		
		
		
		//Approach1-->By using select class
		
		/*
		Select jobTitleDrp = new Select(driver.findElement(By.name("UserTitle")));
		jobTitleDrp.selectByVisibleText("IT Manager");
		
		Select employeesDrp = new Select(driver.findElement(By.name("CompanyEmployees")));
		employeesDrp.selectByVisibleText("16 - 100 employees");
		
		Select countryDrp = new Select(driver.findElement(By.name("CompanyCountry")));
		countryDrp.selectByVisibleText("American Samoa");
		*/
		
		
		
		
		//Approach2-->By using generic method & select class
		//Not working and not showing any error
		
		WebElement jobTitleDrp= driver.findElement(By.name("UserTitle"));
		selectOptionFromDropdowns(jobTitleDrp, "IT Manager");
		WebElement employeesDrp=driver.findElement(By.name("CompanyEmployees"));
		selectOptionFromDropdowns(employeesDrp, "16 - 100 employees");
		WebElement countryDrp=driver.findElement(By.name("CompanyCountry"));
		selectOptionFromDropdowns(countryDrp, "American Samoa");
		
	
	
	}

	public static void selectOptionFromDropdowns(WebElement ele, String value)
	{
		Select drp = new Select(ele);
		
		//This method gets all the options belonging to the Select tag.
		//It takes no parameter and returns List<WebElements>
		List<WebElement>alloptions=drp.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("value"))
			{
				option.click();
				break;
			}
		}
			
	}


}


