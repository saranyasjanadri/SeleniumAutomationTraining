package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofWebElement {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
	    
	    
	    
	    //isDisplayed() & isEnabled()
	    
		WebElement searchStore=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		
		//To check whether the web element is displayed on the screen or not
		System.out.println("Display status:"+searchStore.isDisplayed());
		
		//To check whether  the web element is enabled/active or not
		System.out.println("Enable status:"+searchStore.isEnabled());
		
		
		
		
		
		//isSelected()
		
		WebElement male=driver.findElement(By.xpath("//*[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		
		
		//To check whether the web element is selected or not
		System.out.println(male.isSelected()); //False
		System.out.println(female.isSelected()); //False
		
		
		male.click();//Selects male radio button
		System.out.println(male.isSelected()); //True
		System.out.println(female.isSelected()); //False
		
		
		female.click();//Selects female radio button
		System.out.println(male.isSelected()); //False
		System.out.println(female.isSelected()); //True
			
		
	}

}
