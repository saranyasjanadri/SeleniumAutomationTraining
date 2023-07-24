package webDriver_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Autosuggest_Dropdown_BingSearch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.bing.com/");
	    driver.manage().window().maximize();
	    
	    //To find the search button element
	    driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
	    
	    //To capture the no of auto suggestions
	    List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg' or @class='sa_sg sa_hv']//span"));
	    System.out.println("Size of AutoSuggestion:"+list.size());
	    
	    
	    
	    for(WebElement listitem:list) 
	    {
	    	if(listitem.getText().contains("download"))
	    	{
	    		listitem.click();
	    		break;
	    	}
	    
	    }
	    
	    
	    
	    
		 
	}

}
