package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Web_Table {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
	     driver.get("https://www.selenium.dev/ecosystem/");
	     driver.manage().window().maximize();
	     
	     
	     //1)To find number of rows in a table
	     int rows=driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr")).size();
	     System.out.println("Total number of rows in a table:"+rows);
	     
	     
	     
	     
	     
	     //2)To find number of columns in a table
	     int columns=driver.findElements(By.xpath("(//table[@class='table'])[1]//thead/tr/th")).size();
	     System.out.println("Total number of columns in a table:"+columns);
	     
	     
	     
	     
	     //3)Retrieve the specific row/column data
	     //Locator for finding 'Selenium-Remote-Driver'
	     
	     //For relative xpath we can use double slash and directly jump to the tags
	     //Ex:(//table[@class='table'])[1]//tr[4]//a
		 //For Absolute xpath we have to use single slash and specify the tags step by step
	     //Ex:(//table[@class='table'])[1]/tbody/tr[4]/th/p/a
	     String value=driver.findElement(By.xpath("(//table[@class='table'])[1]//tr[4]//a")).getText();
	     System.out.println("The value is:"+value);
	     
	     
	     
	     
	     
	     //4)Retrieve all the rows & columns data from the table
	     System.out.println();
	     System.out.println("Data from the table:");
	     for(int r=1;r<=rows;r++)//for rows
	     {
	      //Here condition is given as c<=2 not c<=columns becoz
	      //the 1st column data is a link specified in a tag and not a
	      //normal data specified in td tag.
	      //So here we are printing only 2nd & 3rd column which is having td tag
	      //If we want to print the 1st column link data also means have to print it by using some if condition 
	      for(int c=1;c<=2;c++)//for columns
	      {
	    	 //We cannot directly substitute the values of r & c inside
	    	 //the xpath as tr[r] & td[c].
	    	 //If we want to parameterize the values of r & c in xpath
	    	 //we have to follow certain syntax here as tr["+r+"] & td["+c+"]
	    	 String data=driver.findElement(By.xpath("(//table[@class='table'])[1]//tbody/tr["+r+"]/td["+c+"]")).getText();
	    	 System.out.print(data+"      ");
	      }
	      System.out.println();//To jump to the next line
	     }
	     
	   
	     
	     
	     
	     //5)Retrieve data based on some condition
	     //Print Language & Author of Name (webdriver.dart)
	     System.out.println();
	     System.out.println("Data based on the condition specified:");
	     for (int r=1;r<=rows;r++)
	     {
	       String nameLink=driver.findElement(By.xpath("(//table[@class='table'])[1]//tbody/tr["+r+"]//a")).getText(); 
	       if(nameLink.equals("webdriver.dart"))
	       {
	    	   String language=driver.findElement(By.xpath("(//table[@class='table'])[1]//tbody/tr["+r+"]/td[1]")).getText();  
	    	   String author=driver.findElement(By.xpath("(//table[@class='table'])[1]//tbody/tr["+r+"]/td[2]")).getText();
	           System.out.println(nameLink+"   "+language+"   "+author);
	       }
	     }
	     
	     
	     
	
	 }

}
