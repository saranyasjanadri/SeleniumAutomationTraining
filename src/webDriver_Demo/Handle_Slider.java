package webDriver_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//Not working properly
public class Handle_Slider {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/search?q=sarees&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax");
	    driver.manage().window().maximize();
	    
	    
	     //Locator for min price slider element
	     WebElement min_slider=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
	     //Get the location of the element 
	     System.out.println("Location of the min slider:"+min_slider.getLocation());//(17,869)
	     //Get the width and height of the element
	     System.out.println("Height & Width of the element:"+min_slider.getSize());//(13,13)
	    
	     
	     Actions act=new Actions(driver);
	     act.dragAndDropBy(min_slider,50,0).perform();
	     System.out.println("Location of the min slider:"+min_slider.getLocation());
	     System.out.println("Height & Width of the element:"+min_slider.getSize());
	    
	     
	     
	     //Locator for max price slider element
	     WebElement max_slider=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
	     System.out.println("Location of the max slider:"+max_slider.getLocation());//254,869
	     System.out.println("Height & Width of the element:"+max_slider.getSize());//13,13
	
	    
	     
	     act.dragAndDropBy(max_slider,-50,0).perform();
	     System.out.println("Location of the max slider:"+max_slider.getLocation());
	     System.out.println("Height & Width of the element:"+max_slider.getSize());
	
	}

}
