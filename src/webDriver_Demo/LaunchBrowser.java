package webDriver_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {

		 //Chrome Browser
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 
		 //Creating new object for Chrome driver
	     WebDriver driver =new ChromeDriver(); //ChromeDriver driver = new ChromeDriver();
	     driver.get("http://www.google.com");
	    

		
		
		
		 //Firefox Browser
//		 System.setProperty("webdriver.gecko.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\geckodriver.exe");
		 
		 //Creating new object for Firefox driver 
//		 WebDriver driver =new FirefoxDriver(); // FirefoxDriver driver =new FirefoxDriver();
//		 driver.get("http://www.google.com");
		 
		
		 
		 
		 
		
		//Edge Browser
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\CSC\\Downloads\\Browser Drivers\\msedgedriver.exe");

		// Creating new object for Edge driver
//		WebDriver driver =new EdgeDriver(); //EdgeDriver driver = new EdgeDriver();
//		driver.get("http://www.google.com");
		
		
		
		//To maximizing the window
		driver.manage().window().maximize();
		
		
		
		//driver.close(); //closes the active browser 
		//driver.quit(); //closes all the browsers opened by web driver 
		
		

	}

}
