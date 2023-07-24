package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Mouse_RightClick_Action {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	    driver.manage().window().maximize();
	    
	    
	    //Locator for 'right click' button 
	    //If we left click that button,it will not work
	    //If we right click that button it wont show inspect option
	    //hence press F12 from the keyboard to get the inspect screen
	    WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	    
	    //Any kind of mouse related operations can be achieved by
	    //using Actions class methods.
	    Actions act =new Actions(driver);
	    
	    //To perform the right click action(both are same)
	    //build method will create an action and then
	    //perform method will complete that action.
	    
	    //Perform method script internally calling build().perform()
	    //So instead of using both build & perform method, 
	    //we can directly use perform method which already includes build method.
	    act.contextClick(button).perform();
	    act.contextClick(button).build().perform();
	    
	    
	
	}

}
