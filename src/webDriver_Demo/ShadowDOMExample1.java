package webDriver_Demo;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//DOM(Document Object Model)is Tree representation of HTML nodes
//Shadow DOM -->is the subset of DOM.
//Shadow host is the regular node that the shadow DOM is attached.
public class ShadowDOMExample1 {

	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		
		
		//With the normal locators we cannot locate the shadow DOM elements.
		//So we are using js executor class,to get the Shadow host /root Element
		
		
		//This is the coding for older version of selenium(Not Working)			
		
		/*
		WebElement shadowhost =driver.findElement(By.tagName("book-app"));
		
		//This is the actual internal code of getShadowRoot()				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowDom1=(WebElement)js.executeScript("return arguments[0].shadowRoot",shadowhost);  
		
		WebElement appheader=shadowDom1.findElement(By.tagName("app-header"));
	    WebElement apptoolbar=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
	    WebElement bookinputdecorator=apptoolbar.findElement(By.tagName("book-input-decorator"));
        bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("testing");
	
		*/
		
		
		
		
		//This is the coding for newer version-->
		//SearchContext is the return type of the getShadowRoot()
		
        SearchContext last=driver.findElement(By.tagName("book-app")).getShadowRoot();
		last.findElement(By.cssSelector("input#input")).sendKeys("testing");
	    
	}

}
