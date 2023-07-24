package webDriver_Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Alert windows are not an web element.
//Alert windows are given by browser so we cannot inspect anything 
//in the alert window.To handle it we are using different approach.
public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    
	    
	    
	    //Alert window with OK button
	    /*
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	    Thread.sleep(2000);
	    //This will automatically closes the alert window
	    driver.switchTo().alert().accept();
	    */
	    
	    
	    
	    //Alert window with Ok and Cancel buttons(confirmation alert window)
	    /*
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	    Thread.sleep(2000);
	    //driver.switchTo().alert().accept();//Close alert by using OK button
	    driver.switchTo().alert().dismiss();//Close alert by using Cancel button
	    */
	    
	    
	    
	    
	    
	    //Alert window with input box & OK & cancel buttons
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	    Thread.sleep(2000);
	        	    
	    //To capture the alert window
	    
	    //Getting the alert window in a variable called alertwindow. 
	    //The return type of this is Alert instance
	    Alert alertwindow=driver.switchTo().alert();
	    //Now the alertwindow variable is reffering to the alertwindow,
	    //so we can perform multiple actions.
	    
	    
	    //To capture the text from the window
	    
	    //This gets the text which is displayed on the alert window
	    System.out.println("The message displayed on alert:"+alertwindow.getText());
	    
	    
	    //To pass the value into the input box
	    
	    //Alert Window is not an Web element,just we can call it as alert
	    alertwindow.sendKeys("Welcome");
	    
	    
	    //To close the alert window
	    alertwindow.accept();
	    
	    
	
	}

}
