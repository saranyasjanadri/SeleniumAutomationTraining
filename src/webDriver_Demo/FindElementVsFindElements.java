package webDriver_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
	     driver.get("http://demo.nopcommerce.com");
	    
	     
	     
	     
	     /*
	  
	     //findElement()--->Always returns single WebElement
	     
	     //Scenario 1-->If we give the locator which points to single
	     // web element it returns single web element
	      
	     
	     WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	     searchbox.sendKeys("XYZ");
	     
	     
	     
	     
	     //Scenario 2-->If we give the locator which points to multiple
	     //web element(in this case it matches 22 elements)eventhough
	     //it returns only the first web element among 22 elements
	      
	     
	     WebElement ele=driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
	     System.out.println(ele.getText());
	     
	     
	     
	     
	     //Scenario 3-->
	     //If we give an locator for the element which is not present in
	     //the web page,it throws NoSuchElementException
	     
	     WebElement searchButton=driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/login"));
	     
	     */
	     
	     
	     
	     
	     
	     
	     
	     
	     /*
	     //findElements()--->Returns Multiple WebElements
	    
	     
	     //Scenario 1-->Giving locator which points to multiple web elements
	     
	     List<WebElement> links=driver.findElements(By.xpath("//body/div[6]/div[4]/div[1]//a"));
	     System.out.println("Number of elements captured:"+links.size());
	     
	     
	     
	     
	     //Scenario 2-->Giving locator which points to single web element
	     
	     List<WebElement> logo=driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
         System.out.println(logo.size());
         
         
         
         
         //Scenario 3-->To perform any action on the multiple web elements
        
         List<WebElement> links1=driver.findElements(By.xpath("//body/div[6]/div[4]/div[1]//a"));
	     System.out.println("Number of elements captured:"+links1.size());
	    
	     //Using loop Statement to get all the web elements from the variable links1
	     for(WebElement ele:links1)
	     {
	    	 System.out.println(ele.getText());
	     }
	     
	     */
	     
	     
	     
	     
	     //Scenario 4-->
	     //If we give an locator for the element which is not present in
	     //the web page,it doesn't throws any Exception,
	     //Instead it will just return 0 elements.
	    
	     List<WebElement> elements= driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
	     System.out.println(elements.size());
	     
	}

}
