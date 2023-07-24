package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Mouse_DoubleClick_Action {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	    driver.manage().window().maximize();
	    
	    //To switch to the particular frame
	    driver.switchTo().frame("iframeResult");
	    
	    //Locator for 'Field1' input box
	    WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
	    field1.clear();
	    field1.sendKeys("Welcome to selenium");
	    
	    //Locator for 'Copy Text' button
	    WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	    
	    //To perform double click action on the 'Copy Text' button
	    Actions act=new Actions(driver);
	    act.doubleClick(button).perform();

	}

}
