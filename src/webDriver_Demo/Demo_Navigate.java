package webDriver_Demo;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo_Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		
		//Both are same to launch the application
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		
	
		
	
		/*May be as soon as u click it may not reach to the next page,
		 * it may take sometime, so to tell the webdriver wait for
		 * certain time period to load the second page 
		 * we will be passing the wait statement
		 */
		driver.findElement(By.linkText("Images")).click();
		
		
		/*its in milliseconds ie)2 seconds
		 * Thread-->class of java
		 * sleep -->is the method
		 */
		
		
		Thread.sleep(2000); 
		
		
		//An abstraction allowing the driver to access the browser's 
		//history and to navigate to a given URL.
		
		//This will take the driver's control to the first page
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("Back done");
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("Forward done");
		
		driver.navigate().refresh();
		System.out.println("Refresh done");
		

	}

}
