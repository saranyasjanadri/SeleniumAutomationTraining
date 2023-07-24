package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Mouse_Hover_Action {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Locator for 'apparel' then 'shoes' inside that menu
	    WebElement apparel=driver.findElement(By.xpath("(//a[normalize-space()='Apparel'])[1]"));
	    WebElement shoes=driver.findElement(By.xpath("(//a[normalize-space()='Shoes'])[1]"));
	
	    
	    //To perform Hover action
	    Actions act =new Actions(driver);
	    act.moveToElement(apparel).moveToElement(shoes).click().perform();
	
	}

}
