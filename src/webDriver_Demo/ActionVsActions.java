package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionVsActions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    
	    WebElement features=driver.findElement(By.xpath("//a[@title='Women']"));
	    
	    
	    Actions act=new Actions(driver);
	    //Both are same, perform() internally calls build().perform()
	    act.moveToElement(features).perform();
	    //act.moveToElement(features).build().perform();
	    
	    //Actions -->is an class
	    //Action -->is an interface
	    //build()-->will create an action
	    //perform()--> will complete that action
	    
	    
	    //build()--> is a method which will returns an action interface.
	    //Return type of the build method is action  
	    //Before performing the action if u want to store the action 
	    //in an variable-->
	    //To create an action
	    Action action=act.moveToElement(features).build();
	    //To complete this action
	    action.perform();
	    
	    
	
	}

}
