package jsDemo;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	
	    //1)Flash method
	 	public static void flash(WebElement element,WebDriver driver)
		{
			//Capture the background color of the element
			String bgcolor=element.getCssValue("backgroundColor");
			
			
			for(int i=0;i<100;i++)
			{
				//fg color-foreground color (black color)
				changeColor("#000000",element,driver);
				//bg color-background color is the default color of the element we captured
				changeColor(bgcolor,element,driver);
			}
			
		}
		
		
	 	
		
		//2)Change color method
		public static void changeColor(String color,WebElement element,WebDriver driver) 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//Syntax:js.executeScript(Script,args);
			js.executeScript("arguments[0].style.backgroundColor= ' " + color + "'", element);
			
			try {
				Thread.sleep(20);
		        }
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
		
		}
		
		
		
		
		//3)Draw border method
		public static void drawborder(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='3px solid red' ", element);
		}
	

		
		
		
		 //4)Capture Screenshot method
         public static void captureScreenshot(WebDriver driver) throws IOException
         {
    	    
    	    Date currentdate= new Date();
   		    String screenshotfilename=currentdate.toString().replace(" ","-").replace(":","-");		
   		    File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile,new File("C://screenshot//"+ screenshotfilename +".png"));
         
            
            //Another way of coding
            
            /*
            TakesScreenshot ts=(TakesScreenshot)driver;
            File src=ts.getScreenshotAs(OutputType.FILE);
            File trg=new File(".\\Screenshots\\logo.png");
            FileUtils.copyFile(src, trg);
            */
         
         
         
         }
       
         
         
         
         
        //5)Get title method
        public static String getTitleByJS(WebDriver driver)
        {
    	   JavascriptExecutor js = (JavascriptExecutor) driver;
    	   //This js statement will return the title of the page and
    	   //store that in the variable title
    	   String title = js.executeScript("return document.title;").toString();
    	   return title;
        }
        
        
        
        
        //6)Click method
        public static void clickElementByJS(WebElement element, WebDriver driver)
        {
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	js.executeScript("arguments[0].click();", element);
        }
        
        
        
        
        //7)Alert method
        public static void generateAlert(WebDriver driver, String message)
        {

        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	//This statement will pop up an alert which contains our message.
        	//It throws an alert window at the run time.
        	js.executeScript("alert('" + message +"')");
        
        }
        
        
        
        
        //8)Refresh method
        public static void refreshBrowserByJS(WebDriver driver)
        {
        	JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("history.go(0)");

        }
        
        
        
        //9)Scroll down the page till the element found
        public static void  scrollIntoView(WebElement element , WebDriver driver)
        {
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	//Scroll down the page till we find the element
        	js.executeScript("arguments[0].scrollIntoView(true);", element);
        }
        
        
        
        
        //10)Scroll down the page till the end of the page
		
        public static void  scrollPageDown(WebDriver driver)
        {
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	//Scroll down the page till the end
        	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        }
        

        //11)Scroll up the page method
		
        public static void  scrollPageUp(WebDriver driver)
        {
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	//Scroll up the page
        	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        }
        
        
        //12)Zoom page
        public static void zoomPageByJS(WebDriver driver)
        {
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	//By default the zoom size will be 100%, we can increase or decrease it
        	js.executeScript("document.body.style.zoom='50%'");
        }
        

}

