package webDriver_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Handle_Links {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    //LinkText()
	    //driver.findElement(By.linkText("Today's Deals")).click();
	    
	    //PartialLinkText()
	    //driver.findElement(By.partialLinkText("Deals")).click();
	    
	    
	    //To capture all the links from the web page
	    
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println("Number of links present:"+links.size());
	    
		
	    
	    //Using normal for loop
	    /*
	    for(int i=0;i<links.size();i++)
	    {
	    	//To get the name of the link
	    	System.out.println(links.get(i).getText());
	    	//To get the target page of the link
	    	//href-Hyperlink reference
	        System.out.println(links.get(i).getAttribute("href"));
	    }
	    */
	   
	      
	    
	    //Using for each loop
	    for(WebElement link:links)
	    {
	    	System.out.println(link.getText());
	    	System.out.println(link.getAttribute("href"));
	    }
	    

	
	
	}
	
	

}
