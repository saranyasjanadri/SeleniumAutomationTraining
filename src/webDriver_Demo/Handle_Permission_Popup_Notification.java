package webDriver_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_Permission_Popup_Notification {

	public static void main(String[] args) 
	{
		//To disable all the notifications from the browser use the
		//special class ChromeOptions
		
		ChromeOptions options=new ChromeOptions();
	
		//For any browser we can use the same setup with Options class 
		//FirefoxOptions options=new FirefoxOptions();etc
		
		//Add this argument to the ChromeOptions object and pass
	    //the options variable at the time of chrome driver creation
		options.addArguments("--disable-notifications");
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		//Passing the options variable here will disable the notification 
		//coming from the browser
		WebDriver driver =new ChromeDriver(options);
	    driver.get("https://www.hdfcbank.com/");
	    driver.manage().window().maximize();

	}

}
