package webDriver_Demo;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	 	driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		
		
		//This is the coding for older version (Not Working)
		
		/*
		//To get Shadow host
		WebElement shadowHost=driver.findElement(By.tagName("shop-app"));
		WebElement shadowDom1=getShadowDOM(shadowHost,driver);
		
		WebElement ironpages=shadowDom1.findElement(By.cssSelector("iron-pages[role='main']"));
		
		WebElement shophome=ironpages.findElement(By.name("home"));
		WebElement shadowDom2=getShadowDOM(shophome,driver);
		
		//Locator for Men's Outerwear "Shop Now" Button
		shadowDom2.findElement(By.cssSelector("div:nth-child(2)>shop-button>a")).click();
        */
	
		
		
		//This is the coding for newer version
		
		
		SearchContext shadowroot=driver.findElement(By.tagName("shop-app")).getShadowRoot();
		WebElement ironpages=shadowroot.findElement(By.cssSelector("iron-pages[role='main']"));
		
		SearchContext shadowroot1=ironpages.findElement(By.tagName("shop-home")).getShadowRoot();
		//Locator for Men's Outerwear "Shop Now" Button
		shadowroot1.findElement(By.cssSelector("div:nth-child(2)>shop-button>a")).click();
		
		//Locator for Ladies Outerwear "Shop Now" Button
		//shadowroot1.findElement(By.cssSelector("div:nth-child(3)>shop-button>a")).click();
	
	
	
	}
	
	
	/*
	static WebElement getShadowDOM(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement shadowDom1= (WebElement)js.executeScript("return arguments[0].shadowRoot",element);
		return shadowDom1;
	}
		
	*/	
	

}
