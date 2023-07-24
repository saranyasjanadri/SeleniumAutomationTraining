package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//To search phones in the amazon and apply any filter 
public class Assignment_CheckBox {

	public static void main(String[] args) throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.amazon.in");
	      
	      
	      //To enter 'phone' in the search box
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
	     
	     
	      //To click search button
	      driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	      Thread.sleep(5000);
	      
	     
	      //To click the filter option check box Ex:Processor speed less than 0.99Ghz
	      driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[6]/ul[7]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
	      Thread.sleep(5000);
	      
	      
	      driver.close();
	}

}
