package webDriver_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Using the below approach to handle the authenticated popup window,
//as we cannot inspect this window
public class Handle_Authenticated_Popup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    //driver.get("https://the-internet.herokuapp.com/basic_auth");
	    driver.manage().window().maximize();
	    
	    
	    
	    //To login by skipping the authenticated popup window
	    //Syntax:http://username:password@URL
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	    
	    
	
	}

}
