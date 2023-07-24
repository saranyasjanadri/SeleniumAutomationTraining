package webDriver_Demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	    driver.manage().window().maximize();
	    
	    
	    //1)To select specific checkbox
	    //driver.findElement(By.xpath("//input[@id='monday']")).click();
	  
	    
	    
	    
	    //2)To select all the check boxes
	    List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	    System.out.println("Total number of checkboxes:"+checkboxes.size());
	   
	    /*
	    //Using for loop
	    for(int i=0;i<checkboxes.size();i++)
	    {
	    	checkboxes.get(i).click();
	    }
	    */
	    
	    
	    
	    /*
	    //Using for each loop
	    for(WebElement chbox:checkboxes)
	    {
	    	chbox.click();
	    }
	    */
	    
	    
	    
	    
	    
	    //3)To select multiple checkboxes by choice
	    //Ex:To select Monday & Sunday
	    
	    /* 
	    for(WebElement chbox:checkboxes)
	    {
	    	String checkboxname=chbox.getAttribute("id");
	    	if(checkboxname.equals("monday")|| checkboxname.equals("sunday"))
	    	{
	    		chbox.click();
	    		
	    	}
	    }
	    */
	    
	    
	    
	    
	    //4)To select the last N checkboxes(Ex:select last 2 checkboxes)
	    //Formula:Total no of checkboxes - no of check boxes wanted to select=Starting index
	    //7-2=5
	    
	   /* 
	    int totalcheckboxes= checkboxes.size();
	    for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
	    {
		   checkboxes.get(i).click();
	    }
	    */
	    
	    
	    //5)To select the first N checkboxes(Ex:select first 3 checkboxes)
	   
	    
	    int totalcheckboxes= checkboxes.size();
	    for(int i=0;i<totalcheckboxes;i++)
	    {
	    	if(i<3)
	    	{
	          checkboxes.get(i).click();
	        }
	    }
	
	
	
	}

}
