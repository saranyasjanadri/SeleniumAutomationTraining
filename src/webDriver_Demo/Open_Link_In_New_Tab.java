package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Link_In_New_Tab {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    
	    
	    String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
	    driver.findElement(By.linkText("Register")).sendKeys(tab);
	    
	    //We can specify like this also directly
	    //driver.findElement(By.linkText("Register")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	    
	}

}
