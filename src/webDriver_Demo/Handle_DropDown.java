package webDriver_Demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.opencart.com/index.php?route=account/register");
	    driver.manage().window().maximize();
	    
	    
	    
	    
	    WebElement drpCountryEle=driver.findElement(By.id("input-country"));
	    
	    //Select is an class which contains the default constructor 
	    //which will accept the WebElement.
	    Select drpCountry = new Select(drpCountryEle);
	    
	    WebElement firstOption =drpCountry.getFirstSelectedOption();
	    System.out.println(firstOption.getTagName());
	    
	    
	    //These are the 3 methods available in the select class,
	    //by which we can select the options from the dropdown.
	   
	    
	    drpCountry.selectByVisibleText("Denmark");
	    Thread.sleep(2000);
	    drpCountry.selectByValue("10");//Argentina
	    Thread.sleep(2000);
	    drpCountry.selectByIndex(12);//Aruba
	    Thread.sleep(2000);
	    
	    
	    //To check it is multi select dropdown or not
	    //It returns boolean value
	    System.out.println(drpCountry.isMultiple());
	    
	    
	    
	    //Selecting option from dropdown without using select class methods	    
	    //To get all the options from the  dropdown using the getOptions()
	    
	   /* List<WebElement> AllOptions=drpCountry.getOptions();
	    for(WebElement option:AllOptions)
	    {
	    	if(option.getText().equals("Cuba"))
	    	{
	    	   option.click();
	    	   break;
	    	}
	    }*/
	
	    
	    
	    
	    
	}

}
