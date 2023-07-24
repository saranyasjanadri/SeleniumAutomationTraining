package webDriver_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_URLs_In_Multiple_Tabs_Windows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    
	    
	   
	    //To open new tab
	    //This is the new command available from Selenium 4
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.opencart.com/");
	    
	    
	    //To open new window
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.amazon.com/");
	   
	    

	}

}
