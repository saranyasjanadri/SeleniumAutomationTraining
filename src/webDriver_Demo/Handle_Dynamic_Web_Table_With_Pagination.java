package webDriver_Demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Fetching data from dynamic web table.This is also called as Web Scraping.


//Web scraping, also termed as web data extraction, is an automatic
//method for scraping large data from web sites. 
//It processes the HTML of a web page to extract data for manipulation,
//such as collecting textual data and storing it into some data frames 
//or in a database.
public class Handle_Dynamic_Web_Table_With_Pagination {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	    driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
	    driver.manage().window().maximize();
	    
	    
	   
	    
	    //To login
	    WebElement username=driver.findElement(By.id("input-username"));
	    username.sendKeys("demo");
	    WebElement password=driver.findElement(By.id("input-password"));
	    password.sendKeys("demo");
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	    
	    
	    //To close the important security popup window
	    driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	   
	    
	    
	    //To click sales and from that click orders
	    driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
	    
	    
	    
	    //Table
	    //1)To find total number of pages in the dynamic web table
	    String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	    System.out.println(text);
	    //It gives 'Showing 1 to 10 of 60 (6 Pages)'
	    
	    //To retrieve only the number of pages from the text value 
	    //using java string methods
	    int total_pages=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	    System.out.println("Total number of pages:"+total_pages);
	    
	    
	    
	    
	    
	    //2)To find the total number of rows in all pages
	    
	    //Pagination:It's dynamic
	    //All pages are specified in the 'li' tag,
	    //In that class value becomes active whichever page is active
	    //Whichever page we are clicking that page becomes the active page.
	    //current active pages always contains 'span' tags & other pages
	    //contains link-a tags.
	    //When we inspect the pages, the active page's page number is
	    //present inside the 'span' tag & the other page's page no is 
	    //present inside the 'a' tag ie) link tag
	    
	   
	    
	    //Not working(ElementClickInterceptedException)
	    for(int page=1;page<=total_pages;page++)
	    {
	      //It returns whichever page is currently active
	      WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
	      //To print the page number
	      System.out.println("Active Page:"+active_page.getText());
	      active_page.click();
	     
	  
	      //To count number of rows
	      int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
	      System.out.println("Number of rows:"+rows);
	           
	      //3)To read all the rows from all the pages
	      for(int r=1;r<=rows;r++)
	      {
	    	String orderID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
	    	String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
	    	String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
	    	//System.out.println(orderID+"   "+customer+"   "+status);
	        
	    	
	    	//To read the data based on some condition
	    	if(status.equals("Pending"))
	        {
	    	  System.out.println(orderID+"   "+customer+"   "+status); 
	        }
	      
	      
	      }
	    
	      //To click next page
	      String pageno=Integer.toString(page+1);
	      driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
	    
	    }
	   
	}
}
