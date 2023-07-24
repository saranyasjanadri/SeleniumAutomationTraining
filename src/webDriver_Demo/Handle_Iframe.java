package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Normally frames are used for horizontally and vertically splitting
//of the screen.Frames split the entire page into multiple sections.
//These frames are the part of the page.

//Iframes are used to insert the content from other sources.
//Iframe,which is having some content like text/image/video/element/form etc coming
//from different sources.We are just presenting that data in the web
//page inside the iframe.


//Usually iframes are described in the HTML code with the tag 'iframe',
//sometimes it also comes with the tags 'frame' or 'form'

//We cannot directly interact with the elements inside the iframe.
//For that first we have to switch to that frame and then we can find
//the element and then we can perform the action.

//Different methods we can use while working with the iframe
//driver.switchTo().frame("Name of the iframe"/"id of the iframe");
//driver.switchTo().frame(WebElement);
//driver.switchTo().frame(index value of the frame);
//driver.switchTo().defaultContent();//To go back to the main page
//driver.switchTo().parentFrame();//To go to parent frame/outer frame

public class Handle_Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	    driver.manage().window().maximize();
	    
	    
	    
	    //To switch to the particular frame
	    //Syntax:driver.switchTo().frame("Name of the iframe"/"id of the iframe");
	    driver.switchTo().frame("packageListFrame");
	    //Locator for org.openqa.selenium in 1st iframe
	    driver.findElement(By.cssSelector("a[href='org/openqa/selenium/package-frame.html']")).click();	    
	    driver.switchTo().defaultContent();//Go back to the main page
	    
	    Thread.sleep(3000);
	    
	    
	    driver.switchTo().frame("packageFrame");
	    //Locator for By Remotable in the 2nd iframe
	    driver.findElement(By.xpath("//span[normalize-space()='By.Remotable']")).click();
	    driver.switchTo().defaultContent();
	   
	    Thread.sleep(2000);
	    
	    
	    driver.switchTo().frame("classFrame");
	    //Locator for Help in the 3rd iframe
	    driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
	   
	    
	
	}

}
