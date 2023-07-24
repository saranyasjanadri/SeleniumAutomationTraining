package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttributeValue {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver(); 
	     driver.get("http://admin-demo.nopcommerce.com/login");
	    
	     
	     Thread.sleep(3000);
	     WebElement emailInputBox= driver.findElement(By.id("Email"));
	    
	     //To clear the default text from the input box
	     //emailInputBox.clear();
	     
	     //To enter the new text after clearing the text from the input box
	     //emailInputBox.sendKeys("admin123@gmail.com");
	     
	     
	     //To capture text from input box
	     
	     System.out.println("Result from getAttribute():"+emailInputBox.getAttribute("value"));
	     System.out.println("Result from getText():"+emailInputBox.getText());
	   
	     
	     
	     
	     /*
	      Difference between getText() and getAttribute('value')
	      getText()--> returns the innerText of an element.
	      getAttribute()--> fetches the text contained by an attribute
	      in an html document.
	     */
	    
	     
	     //To capture text from login button
	     
	     WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	    
	     
	     /*
	     Consider this html code for example-->
	     <button type="submit" class="button-1 login-button" xpath="1">Log in</button>
         Here type,class & xpath are attributes and Log in is the inner text
	     To fetch the attributes value getAttribute() is used.
	     To fetch the inner text value getText() is used.
	     */
	    
	     System.out.println(button.getAttribute("type"));
	     System.out.println(button.getAttribute("class"));
	     System.out.println(button.getText());
	     
	     
	     // To capture the heading of the web page--> Admin area demo
	     String title=driver.findElement(By.xpath("//h1[contains(text(),'Admin area demo')]")).getText();
	     System.out.println(title);
	     
	     
	     
	}

}
