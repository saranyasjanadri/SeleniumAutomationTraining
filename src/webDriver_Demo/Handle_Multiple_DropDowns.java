package webDriver_Demo;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Multiple_DropDowns {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe"); 
	    driver = new ChromeDriver();
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    driver.manage().window().maximize();
	    
	    
	       
	    //Approach1-->By using select class
	    
	    /*
	    Select noOfEmpDrp = new Select(driver.findElement(By.name("NoOfEmployees")));
	    noOfEmpDrp.selectByVisibleText("16 - 20");
	    
	    Select industryDrp= new Select(driver.findElement(By.name("Industry")));
	    industryDrp.selectByVisibleText("Travel");
	    
	    Select countryDrp= new Select(driver.findElement(By.name("Country")));
	    countryDrp.selectByVisibleText("Aruba");
	    */
	    
	    
	    //Approach2-->By using generic method & select class
	    
	    WebElement noOfEmpEle =driver.findElement(By.name("NoOfEmployees"));
	    selectOptionFromDropdown(noOfEmpEle, "16 -20");
	    WebElement industryEle=driver.findElement(By.name("Industry"));
	    selectOptionFromDropdown(industryEle, "Healthcare");
	    WebElement CountryEle =driver.findElement(By.name("Country"));
	    selectOptionFromDropdown(CountryEle , "Ghana");
	
	
	}
	
	
	
	public static void selectOptionFromDropdown(WebElement ele, String value)
	{
		Select drp = new Select(ele);
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
