package webDriver_Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handle_Browser_Windows {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");//(Parent Window)
	    driver.manage().window().maximize();
	    
	    
	  
	    
	    //To use getWindowHandle()-->It returns ID(String format) of the single browser window
	    
	    /*
	    String windowID=driver.getWindowHandle();
	   
	    //WindowID will be dynamically created.This will randomly generate
	    //only at the run time.
	    //Every time it returns the different window IDs as shown
	    //CDwindow-68B19FFFABF83DC8A413B1F59263C439(String format)
	    //CDwindow-D060458D918AFDA3CF58F6F89DD9A391
	    System.out.println(windowID);
	    */
	    
	    
	    
	    
	    
	    
	    
	    //To use getWindowHandles()-->It returns IDs(Set<String> format) of the multiple browser windows
	    
	    //It opens the another browser window(Child Window)
	    driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	    
	    
	    //We cannot directly retrieve the  value from the windowIDs 
	    //so we have to convert it into list collections and have to get the values.
	    //Set is one of the 'Collections'-->Here duplicate is not allowed
	    Set<String> windowIDs=driver.getWindowHandles();
	    
	    
	    //Printing the windowIDs will gives the set of IDs as[ID1,ID2]
	    System.out.println(windowIDs);
	    
	    
	    
	    //Type1:To capture/retrieve the IDs from the windowIDs variable
	    //By using iterator() method-->Iterator will iterates through
	    //the set of window handles[window1,window2,window3]by using next().
	    
	    /*
	    Iterator<String> it =windowIDs.iterator();
	    
	    String parentWindowID=it.next();//Gives first window ID
	    String childWindowID=it.next();//Gives the next ID
	    
	    System.out.println("Parent WindowID:"+parentWindowID);
	    System.out.println("Child WindowID:"+childWindowID);
	    */
	    
	    
	    
	    /*
	    //Type2:By Using List/ArrayList concept-->
	    
	    //List is one of the 'Collections'-->Here duplicates are allowed
	    //List is an interface & ArrayList is an class which is implemented
	    //List interface.
	    
	    //We can use any of these 2 types-->Both are same
	    //1)ArrayList<String> windowIDsList=new ArrayList();
	     
	    //We cannot instantiate(creating object) the interface, so we 
	    //are instantiating the class ArrayList which is implemented the
	    //List interface.
	    //2)List<String> windowIDsList=new ArrayList();
	    
	    
	    //Converting the collection Set into collection List-->
	    //By passing the Set variable(windowIDs) into Arraylist
	    List<String> windowIDsList=new ArrayList(windowIDs);//Returns the List
	    
	    
		//To extract the values from the list(windowIDsList)
	    String parentWindowID= windowIDsList.get(0);//Returns parent windowID
	    String childWindowID= windowIDsList.get(1);//Returns child windowID
	    
	    System.out.println("Parent WindowID:"+parentWindowID);
	    System.out.println("Child WindowID:"+childWindowID);
	    
	    */
	    
	    
	    
	    
	    
	    
	    
	    //Basically these windowIDs are required to switch between 
	    //one browser window to another browser window
	    
	    //How to use WindowIDs for switching between multiple browser
	    //windows
	     
	    /*
	     Type1-->
	     driver.switchTo().window(parentWindowID);
	     System.out.println("Parent window title:"+driver.getTitle());
	     driver.switchTo().window(childWindowID);
	     System.out.println("Child window title:"+driver.getTitle());
	    */
	     	     
	    
	    //Type2-->To get windowIDs of multiple browser windows
	    //and to switch and capture the titles at one shot
	    
	   List<String> windowIDsList=new ArrayList(windowIDs);
	   
	    //To capture the windowIDs using for each loop
	    for(String winid:windowIDsList)
	    {
	    	//System.out.println(winid);
	    	String title =driver.switchTo().window(winid).getTitle();
	    	System.out.println(title);
	    }
	    
	    
	   
	    
	    
	    
	    
	    
	    //For closing windows-->
	    
	    //To close the single browser window where our driver is pointing to
	    // driver.close();
	   
	    //To close all the browser windows
	    // driver.quit();
	    
	    //To close the specific bowser window
	    
	   for(String winid:windowIDsList)
	   {
	    	String title=driver.switchTo().window(winid).getTitle();
	    	
	    	//To close child window
	    	/*if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS"))
	    	{
	    		driver.close();
	    	}*/
	    	
	    	
	    	//To close parent window
	    	/*if(title.equals("OrangeHRM"))
	    	{
	    		driver.close();
	    	}*/
	    
	        //To close specific multiple windows
	    	if(title.equals("OrangeHRM")||title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS"))
	    	{
	    		driver.close();
	    	}
	   }
	
	    
	     
	     

	}

}
