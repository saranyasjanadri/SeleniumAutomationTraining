package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_classname_tagname {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		
		/*For classname & tagname locators we use findElements()
		  to find the list with all matching elements.
		  But in case of findElement() it returns only the first matching
		  element in the DOM
		*/
		
		
		  //ClassName
		 int sliders=driver.findElements(By.className("homeslider-container")).size();
		 System.out.println(sliders);
		
		
		 //TagName
		 int links=driver.findElements(By.tagName("a")).size();
		 System.out.println(links);
		
	}

}
