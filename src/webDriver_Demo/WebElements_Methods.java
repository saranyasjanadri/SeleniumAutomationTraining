package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
	    driver.manage().window().maximize();
	    
	    
	    //Locator for the text entry input box-"Business email"
	    
	    //Use this method to stimulate typing into an element,which may set its value.
	    driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).sendKeys("Testing");
	    Thread.sleep(4000);
	    
	    //If this element is a text entry element,this will clear the value
	    driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).clear();
	   
	    //Get the value of the given Attribute
	    System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
	    
	    //Get the visible/inner text of the element
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/div")).getText());
	    
	    
	    
	    
	    
	    //Locator for the button -"Request a demo"
	    
	    //Get the value of the given CSS property
	    System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getCssValue("align-items"));
	    System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getCssValue("font-family"));
	    
	    //Get the width and height of the rendered element
	    System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getSize());
	   
	    //Get the location of the rendered element on the page
	    System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getLocation());
	   
	    //Get the TagName of this element
	    System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getTagName());
	    
	    
	    //Returns the status of the WebElement as Boolean value
	    System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isEnabled());
	    System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isSelected());
	
	    //Click the element
	    driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a/span[1]")).click();
	}

}
