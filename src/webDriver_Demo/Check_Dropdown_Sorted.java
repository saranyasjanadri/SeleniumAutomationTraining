package webDriver_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_Dropdown_Sorted {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.twoplugs.com/");
	    driver.manage().window().maximize();
	    
	    
	    
	    
	    //Locator for Live Posting element
	    driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	    
	    
	    //Capturing the dropdown element into the variable drpElement
	    WebElement drpElement=driver.findElement(By.name("category_id"));

        //Passing the drpElement into the select class
	    Select drpselect = new Select(drpElement);
	    
	    //Capture all the options from the dropdown(drpselect)into the options variable
	    List<WebElement> options =drpselect.getOptions();
	    
	    
	    //Once we get all the options we have to create the 2 
	    //collection type called ArrayList  
	    ArrayList originallist = new ArrayList();
	    ArrayList templist = new ArrayList();
	    
	    
	    
	    
	    //To copy all the options into the 2 different lists
	    //Getting each individual option from the options variable and 
	    //storing that into the opt
	    for(WebElement opt : options)
	    {
	    	//Capturing only the text value(not the element)from the opt
	    	//and storing tat inb oth the list
	    	originallist.add(opt.getText());
	    	templist.add(opt.getText());
	    }
	    
	    
	    System.out.println("Original list before sorting:"+originallist);
	    System.out.println("Temp list before sorting:"+templist);
	    
	    //Sorting the list
	    Collections.sort(templist);
	    
	    System.out.println("Original list:"+originallist);
	    System.out.println("Temp list after sorting:"+templist);
	    
	    
	    if(originallist.equals(templist))
	    {
	    	System.out.println("Dropdown Sorted");
	    }
	    else
	    {
	    	System.out.println("Dropdown Unsorted");
	    }

	    
	}

}
