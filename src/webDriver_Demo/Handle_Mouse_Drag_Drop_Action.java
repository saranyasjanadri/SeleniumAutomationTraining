package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Mouse_Drag_Drop_Action {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().window().maximize();
	    
	    //Locator for rome box(one of the source element)
	    WebElement rome=driver.findElement(By.id("box6"));
	   
	    //Locator for italy box(one of the target element)
	    WebElement italy=driver.findElement(By.id("box106"));
	    
	    //To perform drag & drop Action
	    Actions act=new Actions(driver);
	    act.dragAndDrop(rome, italy).perform();
	}

}
