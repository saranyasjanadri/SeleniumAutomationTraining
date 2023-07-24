package jsDemo;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



//Basically these screenshots are used for reporting the bug
//Suppose if there is any failure happens in application UI,
//we can immediately capture the screenshots and can send them
//to the developer.
public class Capture_Screenshots {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		
		/*
		
		//Capture screenshot of full page-->
		// use the interface called TakesScreenshot
		
		//driver is an instance of WebDriver(Interface)
		//src is an instance of TakesScreenshot(Interface)
		//We cannot directly assign the driver variable to the src variable.
		//To capture the screenshot we need to assign our driver to the 
		//TakesScreenshot by type casting.
		//Convert web driver instance to TakeScreenshot
		
		TakesScreenshot src =(TakesScreenshot) driver;
		
		
		 //Call getScreenshotAs() method to create image file--> 
		 //It capture the screenshot & saves it somewhere in the memory,
		 //in the harddrive.But exactly we don't know the location of the file.
		 //We are referring that particular screenshot file with SrcFile variable.
		 
		
		 File SrcFile=src.getScreenshotAs(OutputType.FILE);
		
		 //Move image file to new destination-->
		 //Now we are copying that file into our own location
		
		 File DestFile=new File("C://screenshot/homepage.png");
	    
		//Storing the file in the screenshot folder in the project directory
        //File DestFile=new File(".\\screenshot\\homepage.png");
		
		
		//Copy file at destination
		//Note: FileUtils.copyFile() is updated to FileHandler.copy()
		//in newer versions.
		 
		FileHandler.copy(SrcFile,DestFile);
		*/
		
		
		
		
		
		/*
		//This particular feature is implemented from Selenium 4 onwards
		//To capture screenshot of the section or portion of the page
		
		
		//Locator for Featured Products(a section of a page)
		WebElement section=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
		
		
		File source=section.getScreenshotAs(OutputType.FILE);
		File target=new File("C://screenshot/FeaturedProducts.png");
		FileHandler.copy(source,target);
		*/
		
		
		
		
		
		//Capture the screenshot of the specific element on the page
		
		//Locator for logo
		WebElement element=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		File src1=element.getScreenshotAs(OutputType.FILE);
		File trg1=new File("C://screenshot/logo.png");
		FileHandler.copy(src1,trg1);
		
		driver.close();
		
		
	}

}
