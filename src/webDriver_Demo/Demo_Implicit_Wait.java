package webDriver_Demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Synchronization problem:
//There will not be any balance between the automation script and the application.
//Most of the times the automation script will be faster than your 
//application response.So the script will fail sometimes, becoz the element 
//will not be available by the time or the particular page will not be
//available by the time.


public class Demo_Implicit_Wait {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
	     driver.get("http://www.google.com");
	     driver.manage().window().maximize();
	     
	     //Thread.sleep(MS);-->This belongs to java. 
	     //It will pass the code for sometime depends upon the time we mentioned in ms
	     
	     
	     //Advantage:
	     //Implicit wait automatically takes cares wherever the synchronization problem occurs.
	     //Add it only once after creation of the driver instance and 
	     //it will be applicable for all the elements in the script,
	     //becoz it is global wait.
	     
	     //Disadvantage:
	     //Here the max time is 10sec,so if the element loading takes more than 10secs,
	     //again there are chances to get the exception.
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	     //Locator for search box
         driver.findElement(By.name("q")).sendKeys("Selenium");
        
         //To press ENTER key
         driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
         
         //To click the link selenium in the next page
         driver.findElement(By.xpath("//h3[text()='Selenium']")).click();

	}

}
