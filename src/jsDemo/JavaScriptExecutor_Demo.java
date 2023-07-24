package jsDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//JSExecutor is an Interface in Selenium WebDriver,
//it contains an method called executeScript(),by using that method
//we can execute JS statements through WebDriver code.
//Syntax:
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript(Script,args);

//Below are different usages/actions of JSExecutor 
//Create an utility class named JavaScriptUtil without main method,
//which contains reusable methods and call those methods here.

public class JavaScriptExecutor_Demo {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com");
		driver.manage().window().maximize();
		
		
		
		//1)Flashing of the element
		
	     WebElement joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		 JavaScriptUtil.flash(joinfree, driver);
	
		
		
		
		
		//2)Drawing the border around any element-->
		//Uses to highlight the error in the screenshot
		
		//To draw border around the 'joinfree' button
		//WebElement joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		//JavaScriptUtil.drawborder(joinfree, driver);
		
		//To draw border around the 'joinfree' text
		//WebElement joinfree1=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		//JavaScriptUtil.drawborder(joinfree1, driver);
		
		
		
		
		
		
		//3)Drawing border & Take screenshot
			
		//WebElement joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		//JavaScriptUtil.drawborder(joinfree, driver);
		//JavaScriptUtil.captureScreenshot(driver);
		
		
		
		
		
		
		/*
		 4)Capture title of the page using WebDriver method getTitle()-->
		 Internally each & every WebDriver method uses js.
		 Whenever we use WebDriver methods first it calls the js and 
		 then interacts with the browser.So it works slower than
		 directly using js.
		*/
		//System.out.println(driver.getTitle());
		
		
		//Capture title of the page using js-->
		//Instead of using WebDriver methods we can write our own js
		//so it will works very faster than using WebDriver methods 
		
		//String title=JavaScriptUtil.getTitleByJS(driver);
		//System.out.println(title);
		
		
		
		
		
		
		
		//5)Clicking on the element
		
		//WebElement loginBtn=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		
		//loginBtn.click();
		//Whenever direct click doesn't work on the element we use js.
		//JavaScriptUtil.clickElementByJS(loginBtn,driver);
		
		
		
		
		
		//6)Generating Alert
		
		//WebElement loginBtn=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		//JavaScriptUtil.clickElementByJS(loginBtn,driver);
		//JavaScriptUtil.generateAlert(driver,"You clicked on login button...");
		
		
		
		
		
		
		
		//7)Refreshing the page
		
		//driver.navigate().refresh();This is WebDriver method
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		
		
		
		
		
		//8)Scroll down the page till we find the element
		//WebElement image=driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		//JavaScriptUtil.scrollIntoView(image,driver);
		
		
		
		//9)Scroll down the page till the end of the page
		//JavaScriptUtil.scrollPageDown(driver);
		
		Thread.sleep(4000);
		
		//10)Scroll up the page
		//JavaScriptUtil.scrollPageUp(driver);
		
		
		//11)Zoom page
		
		JavaScriptUtil.zoomPageByJS(driver);//For 50% zoom
		JavaScriptUtil.zoomPageByJS(driver); 
		//To make 100% zoom call it twice or change the code as 100%
		//in the method description
		
		
		
	}

}
