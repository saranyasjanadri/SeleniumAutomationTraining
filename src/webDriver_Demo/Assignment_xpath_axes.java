package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_xpath_axes {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/r.php");
//		driver.get("https://www.google.com");
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		
		
		
		
		/*Ex:1 (Working)
		Find the sign-up button from the registration form present 
		in the facebook application(By using Child)
		*/

//		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]/button")).click();
//		Thread.sleep(2000);
//	    driver.close();
	    
	    
	   
		
		
		/* Ex:2 (Not working)
		 * Locate the first name field from the signup button in facebook
	     * (By using Parent)
	     */
	    
//	    WebElement Unm =driver.findElement(By.xpath("//button[@id='u_0_10_4N']/parent::*/parent::*/div[1]/div/div[1]/div/div/input"));
//	    Unm.click();
//		Unm.sendKeys("Test");
		
	    
	    
	    
	    /*Ex:3 (Not working)
	     * Identify the password from mobile field in facebook.
	     * (By using Following)
	     */
		
//		driver.findElement(By.xpath("//input[@id='u_0_o_ne']/following::input[2]")).sendKeys("Test1");
		
		
		
		
		
		
		/*Ex:4 (Working)
		 *Identify the mobile number from the password field in facebook. 
		 *(By using Preceding)
	     */
//		driver.findElement(By.xpath("//input[@id='password_step_input']/preceding::input[2]")).sendKeys("Test2");
//		Thread.sleep(2000);
//		driver.close();
		
		
		
		
		
		
		/*Ex:5 (Not Working)
		 * Locate surname from female radio button in facebook.
		 * (By using Ancestor)
		 */
		
		//Here both ways of xpath axes are correct
//		WebElement Unm =driver.findElement(By.xpath("//input[@id='u_0_6_mr']/ancestor::div[2]/div[1]/div/div[2]/div"));
//		WebElement Unm =driver.findElement(By.xpath("//input[@id='u_0_6_zm']/ancestor::div[2]//input[@id='u_0_l_o+']"));
//		Unm.click();
//		Unm.sendKeys("Test3");
		
		
		
		
		
		/*Ex:6 (ElementNotInteractableException)
		 * Identify the search text box from the google search button
		 * present in the google search home page.(By using Parent)
		 */
		
//		WebElement Unm =driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]/parent::*/parent::*/parent::*/div[1]/div/div[2]"));
//		Unm.click();
//		Unm.sendKeys("Test4");
		
		
		
		
		
		
	    /*Ex:7 (InvalidSelectorException)
	     * Identify the Today's Deals link from the amazon search text
	     * box present in the Amazon home page.(By using Following)
	     */
		
//		WebElement Unm =driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[2]/following::a[contains(text(),'Today's Deals')]"));
//		Unm.click();	
		
		
		
		
		
		/*Ex:8 (Working)
		 * Identify the Hello,signin from the amazon search text box
		 * present in the amazon home page.(By using Following)
		 */
		
//		WebElement Unm =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::span[@id='nav-link-accountList-nav-line-1']"));
//		Unm.click();
		
		
		
		/*Ex:9 (Working)
		 * Identify Mobiles link which is part of menu bar-Amazon.(By using Descendant)
		 */
		
		WebElement Unm =driver.findElement(By.xpath("//div[@id='nav-xshop']/descendant::a[contains(text(),'Mobiles')]"));
		Unm.click();
	
	
	}
	
	

}
