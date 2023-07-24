package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Tooltip {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://jqueryui.com/tooltip/");
	    driver.manage().window().maximize();
	    
	    
	    //The element is inside the iframe so have to switch to the frame by using index
	    driver.switchTo().frame(0);
	   
	    
	    //To capture the tooltip of the element:
	    
	    //The tooltip is the value which is assigned to the title attribute.
	    //Locator for input box
	    WebElement inputbox=driver.findElement(By.xpath("//input[@id='age']"));
        String tooltiptext=inputbox.getAttribute("title");
        System.out.println(tooltiptext);
        
        
        
	}

}
