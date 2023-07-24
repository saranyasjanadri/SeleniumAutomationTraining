package webDriver_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Methods_WebDriver_Interface {
	
	public static void main(String[] args) 
	{
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get(url)-->Loads a new web page in the current browser window
		driver.get("http://www.facebook.com");
		
		//manage()-->Gets the option Interface
		driver.manage().window().maximize();
		
		
		//To capture the title of the current web page	
		String title = driver.getTitle();
		System.out.println("Title is :" +title);
		
		
		
		//To capture URL of the current web page
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current URL is:"+currentUrl);
		
		
		
		//To capture page source/HTML code of the loaded webpage
		String pageSource=driver.getPageSource();
		System.out.println("Page Source:");
		System.out.println(pageSource);
		
		
		//close()-->Close the current window,quitting the browser if
		//it's the last window currently open.
		driver.close();
		
		
		//quit()-->Quits this driver,closing every associated window
		driver.quit();
		
		
		
		
	}

}
