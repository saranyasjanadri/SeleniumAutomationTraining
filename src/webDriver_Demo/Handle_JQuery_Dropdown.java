package webDriver_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_JQuery_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		    driver.manage().window().maximize();
		    
		    
		    
		    
		    driver.findElement(By.id("justAnInputBox")).click();
		    //selectChoiceValues(driver,"choice 1");
		    //selectChoiceValues(driver, "choice 2","choice 2 3", "choice 6","choice 5","choice 6 2 1");
		    selectChoiceValues(driver, "all");
	        
		    
		    
	
	}
	
	
	
	
	
	public static void selectChoiceValues(WebDriver driver,String... value)
	{
		List<WebElement> choiceList =driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	   
		
		//This will select single or multiple options form the Dropdown
		//selectChoiceValues(driver,"choice 1"); or
		//selectChoiceValues(driver, "choice 1","choice 2", "choice 2 1");
		if(!value[0].equalsIgnoreCase("all"))
	    {
	    	for(WebElement item:choiceList)
	    	{
	    		String text=item.getText();
	    		for(String val:value)
	    		{
	    			if(text.equals(val))
	    			{
	    				item.click();
	    				break;
	    				
	    			}
	    		}
	    	}
	    }
	   
		
		
	    //This selects all the options from the Dropdown
	    //selectChoiceValues(driver, "all");
	    else
	    {
	    	for(WebElement item:choiceList)
	    	{
	    		item.click();
	    	}
	    }
	
	
	}

	
	
	
	
}
