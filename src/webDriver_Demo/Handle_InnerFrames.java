package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_InnerFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		//Switch to outer iframe
		driver.switchTo().frame("iframeResult");
		
		//Switch to inner iframe by giving index value 
		//Here we are having only one frame inside the outer iframe,
		//so we can give the starting index directly 0
		driver.switchTo().frame(0);
		
		//To capture the text inside the inner iframe
		System.out.println("Text inside the inner iframe:"+driver.findElement(By.xpath("//h1")).getText());
	    
		//To go to parent frame/outer frame
		driver.switchTo().parentFrame();
		
		//To capture the text from the outer iframe
		System.out.println("Text from the outer iframe:"+driver.findElement(By.xpath("/html/body/p")).getText());
	
	}

}
