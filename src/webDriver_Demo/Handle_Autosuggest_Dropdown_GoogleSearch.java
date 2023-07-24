package webDriver_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Autosuggest_Dropdown_GoogleSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
		
		driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	    
	    
	    driver.findElement(By.name("q")).sendKeys("java tutorial");
	    Thread.sleep(3000);
	    List<WebElement>list=driver.findElements(By.xpath("//li[@class='sbct']//div[2][@role='option']//div[1]/span"));
	    System.out.println("Size of Autosuggestions:"+list.size());
	    
	    
	    
	    for(WebElement listitem:list)
	    {
	    	if(listitem.getText().contains("beginners"))
	    	{
	    		listitem.click();
	    		break;
	    	}
	    }
	    
	    
	}

}
