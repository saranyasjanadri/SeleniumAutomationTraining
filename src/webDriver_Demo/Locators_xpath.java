package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		
		
		
		//Absolute Xpath
//		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("T-shirts");
//	    driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
		
		
		
		
		
		
		//Relative Xpath
//		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
//		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		
		
		
		
		
	
		//xpath with 'or' & 'and' operators-->
		//Here or & and were case sensitive
//		driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("T-shirts");
//		driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
	    
		
		
		
		
		
		/*xpath with contains() & starts-with()
		   Syntax://tagname[contains(@attribute,'value')]
		   Syntax://tagname[starts-with(@attribute,'value')]
		   Ex: Assume if id="firstname"
		   //input[@id='firstname']-->Basic xpath
		   //input[contains[@id,'first')]-->using contains() 
		   //input[starts-with[@id,'first')]-->using contains() 
		    
		   The properties of the attribute will be dynamically changing in
		   run time,in those cases if u still want to locate the elements,
		   we should able to write the dynamic xpath.
		   
		   While writing dynamic xpath we use contains() or 
		   starts-with() methods
		   
		   Assume the value of the single button id changes like start & 
		   stop during run time then,
		   
		   //input[@id='start']
		   //input[@id='stop'] 
		   These doesn't able to match/locate the element in both the states
		   
		   
		   So we have to write the xpath/locator which will able to match 
		   this element in both the cases
		   
		   //input[contains(@id,'st')]-->Dynamic xpath
		   (contains) method will check the given value st in whole value 
		   start, it may be in middle or at the end also
		   
		   //input[starts-with(@id,'st')]-->Dynamic xpath
		    (starts-with) method checks the given value st only in the 
		    starting not in other places 
		  */
		  
		
		
		
		
		
		  //xpath with contains()-->
		 
		  //id=search_query_top---->we can use 'search_query' or 'query_top' or any partial value
		  
//		  driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("Blouses");
		 
		  //name=submit_search--->we can use any partial value 
		  
//		  driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();
		
	
		
		
		
		
		
		//xpath with {starts-with()} --->here we have to use only the starting values
		
//		driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("Blouses");
//		driver.findElement(By.xpath("//button[starts- with(@name,'submit_')]")).click(); 
	    
		
		
		
		
		
		
		//xpath with text()-->
		
		//Locator to click women tab
		
//		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		
		
		
		
		
		
		
		/*Chained xpath -->simply called as xpath followed by another xpath.
		 First locate the parent element of the desired
         element and locate the actual element.
        */
          
		
		//To locate the search box both are similar
		
		driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("T-shirts");
//		driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirts");;
	
		
		//To locate the button all these ways are same
		
//		driver.findElement(By.xpath("//form[@id='searchbox']//button")).click();
//		driver.findElement(By.xpath("//form[@id='searchbox']//button[1]")).click();
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
	    
	
	
	}
	

}
