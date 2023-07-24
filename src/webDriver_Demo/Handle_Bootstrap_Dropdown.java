package webDriver_Demo;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Bootstrap_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.hdfcbank.com/");
	    driver.manage().window().maximize();
		 
	    
	    
	    //For Product Type element
	    driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
	    List<WebElement> productTypes=driver.findElements(By.xpath(" //ul[@class='dropdown1 dropdown-menu']/li"));
	    System.out.println("Number of options:"+productTypes.size());
	    
	    for(WebElement ptype:productTypes)
	    {
	    	if(ptype.getText().equals("Accounts"))
	    	{
	    		ptype.click();
	    		break;
	    		
	    	}
	    }
	  
	    
	    
	    
	    
	    
	    
	    //For Product element
	    driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
	    List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
	    System.out.println("Number of options:"+products.size());
	  
	    for(WebElement prod:products)
	    {
	    	if(prod.getText().equals("Rural Accounts"))
	    	{
	    		prod.click();
	    		break;
	    	}
	    }
	   
	    Thread.sleep(2000);
	    driver.quit();
	
	
	}

}
