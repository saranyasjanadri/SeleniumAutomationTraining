package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class Assignment_Locators {

	public static void main(String[] args) 
	{
        
		System.setProperty("webdriver.edge.driver", "C:\\Users\\CSC\\Downloads\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		
		
		WebElement Unm = driver.findElement(By.id("email"));
		Unm.sendKeys("saranyainfor@gmail.com");


		driver.findElement(By.name("pass")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		
			
		//Finding links 
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//Here space is must after Forgotten
		driver.findElement(By.partialLinkText("Forgotten ")).click();
		
		

	}

}
