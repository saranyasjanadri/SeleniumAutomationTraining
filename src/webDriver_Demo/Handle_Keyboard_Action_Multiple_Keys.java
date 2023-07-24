package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Keyboard_Action_Multiple_Keys {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://text-compare.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Locator for 1st input box
	    WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	    //Locator for 2nd input box
	    WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	    
	    //To send the text to 1st input box
	    input1.sendKeys("Welcome to Selenium");
	    
	    //To perform actions
	    Actions act=new Actions(driver);
	    
	    //To perform (CTRL+A)action which will select the text from the 1st box
	    act.keyDown(Keys.CONTROL);//To press
	    act.sendKeys("a");
	    act.keyUp(Keys.CONTROL);//To Release
	    act.perform();
	    
	    
	    //To perform (CTRL+C)action which will copy the text from the 1st box
	    act.keyDown(Keys.CONTROL);//To press
	    act.sendKeys("c");
	    act.keyUp(Keys.CONTROL);//To Release
	    act.perform();
	    
	    
	    //To press TAB key which will shift from 1st box to 2nd box
	    act.sendKeys(Keys.TAB);
	    act.perform();
	    
	    
	    //To perform (CTRL+V)action which will paste the text into 2nd box
	    act.keyDown(Keys.CONTROL);//To press
	    act.sendKeys("v");
	    act.keyUp(Keys.CONTROL);//To Release
	    act.perform();
	    
	    
	    //Compare text in both the boxes 
	    if(input1.getAttribute("value").equals(input2.getAttribute("value")))
	        System.out.println("Text copied");
	    else
	    	System.out.println("Text not copied");	
	    
	   
	
	}

}
