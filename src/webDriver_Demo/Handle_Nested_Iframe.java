package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Handling with one Iframe within another Iframe
public class Handle_Nested_Iframe {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    
	    
	    //Locator to click the button "Iframe within an iframe"
	    driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	    
	    //Locator to find the outer iframe
	    WebElement outerframe=driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
	    driver.switchTo().frame(outerframe);//Here we are passing frame as an web element
	   
	    //Locator to find the inner iframe
	    WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	    driver.switchTo().frame(innerframe);
	    
	    //Locator to find the input box inside inner iframe
	    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Welcome");
	}

}
