package webDriver_Demo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Keyboard_Action {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/key_presses");
	    driver.manage().window().maximize();
	    
	    
	    
	    Actions act=new Actions(driver);
	    //Keys-->is an class
	    //act.sendKeys(Keys.ENTER);-->This will basically build the action
	   
	    //To perform the action
	    act.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(3000);
	    act.sendKeys(Keys.BACK_SPACE).perform();
	    Thread.sleep(3000);
	    act.sendKeys(Keys.ESCAPE).perform();
	    Thread.sleep(3000);
	    act.sendKeys(Keys.SPACE).perform();
	    
	    

	}

}
