package webDriver_Demo;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/* In two plugs.com click live posting, 
 * Here you can see a small dropdown and here by default the value is auto
 * complete here you can see Toranto on canada which is by default and if
 * you want to change this value you can just have another value as toranto
 * and you can see lot of searches is displayed this is basically a places
 * auto complete dropdown this values are coming through api. so when you
 * search for something the api will be triggered and the api will get the 
 * data from the server and presenting here. we cannot inspect these
 * elements or any of these options in the dropdown and these options are
 * dynamically coming from the server at the run time. so whenever you send
 * some search string here the api call will be sending to the server and 
 * the selected values will come here. so this is called as auto complete in
 * google places dropdown.Internally this is calling a places or auto 
 * complete places api.
 * 
 * Google maps platform-->this is one of the api which is used in the 
 * google maps.So in the google maps we have an api called places auto 
 * complete and when i use this api internally the dropdowns will 
 * appear.These are all auto complete dropdowns especially used for 
 * google paces when i search for something.
 */

public class Handle_Autocomplete_Google_Places_dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.twoplugs.com/");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	    WebElement searchBox=driver.findElement(By.id("autocomplete"));
	    searchBox.clear();
	    Thread.sleep(3000);
	    
	    searchBox.sendKeys("Toronto");
	    Thread.sleep(3000);
	    
	    String text;
	    do
	    {
	    	searchBox.sendKeys(Keys.ARROW_DOWN);
	    	Thread.sleep(3000);
	    	text=searchBox.getAttribute("value");
	    	if(text.equals("Toronto NSW, Australia"))
	    	{
	    	  searchBox.sendKeys(Keys.ENTER);
	    	  break;
	    	}
	    	Thread.sleep(3000);
	    }while(!text.isEmpty());
	    
	 
	    
	    
	}

}
