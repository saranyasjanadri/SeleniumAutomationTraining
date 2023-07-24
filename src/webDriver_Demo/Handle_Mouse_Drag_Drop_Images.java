package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Mouse_Drag_Drop_Images {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    driver.manage().window().maximize();
	    
	    //To switch to the particular frame
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

	    //Locator for images(source element)
	    WebElement image1=driver.findElement(By.xpath("//li[1]"));
	    WebElement image2=driver.findElement(By.xpath("//li[2]"));
	    
	    //Locator for trash box(target element)
	    WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
	    
	    //To perform drag and drop for images into trash
	    Actions act=new Actions(driver);
	    act.dragAndDrop(image1, trash).perform();
	    act.dragAndDrop(image2, trash).perform();
	    
	    
	}

}
