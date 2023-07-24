package webDriver_Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Broken_Links {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("http://www.deadlinkcity.com/");
	    driver.manage().window().maximize();
	    
	    //To capture all the links from the web page
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    //System.out.println("Number of links present:"+links.size());
	    
	    
	    
	    
	    int brokenLinks=0;
	   
	    
	    //To differentiate which is Valid and Broken links
	    for(WebElement element:links)
	    {
	    	//href is the actual value we need to send the request to the server
	    	String url=element.getAttribute("href");
	    	
	    	
	    	//First check whether the url contains any value or not.
	    	//link is not defined ie) href attribute is not available
	    	//It is not an broken link and also it is not an normal link
	        if(url==null||url.isEmpty())
	        {
	    	System.out.println("URL is Empty");
	    	continue;
	        }
	        
	        
	        //link is defined ie)href attribute is available But it will
	        //not navigate to next web page ie) called as broken link
	        //If the url is not empty then we have to send the URL request
	        
	        
	        //url is in String format, we have to convert it into URL(link) format
	        //For that we have to use the special class called URL class.
	        URL link =new URL(url); 
	        
	        
	        //If there is any Exception at the time of establishing the 
	        //connection the code will not be terminated by using try catch block
	        try {
	        //Storing the connection object returned by link.openConnection
	        //in httpconn
	        HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
	       
	        //By using connect method send the url to the server
	        //It returns some response code
	        httpconn.connect();
	        
	        if(httpconn.getResponseCode()>=400)
	        {
	        	System.out.println(httpconn.getResponseCode()+url+" is"+" Broken Link");
	        	brokenLinks++;
	        }
	        
	        else
	        {
	        	System.out.println(httpconn.getResponseCode()+url+" is"+" Valid Link");
	        }
	   
	           }catch (Exception e) {}
	    }
	
	
	      System.out.println("Number of broken links:" +brokenLinks);
	      driver.quit();
	}

}
