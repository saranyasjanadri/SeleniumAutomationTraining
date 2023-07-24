package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

/*
Xpath Axes---> Xpath Axes are those axes that are used to search for the
multiple nodes/webelements in the XML document from the current node 
context.These methods are mainly used when the web element is not identified
with the help of ID, name,class name,link text, css selector

We can traverse/navigate throughout all the angles in  the DOM
by using this xpath axes
*/
public class Locators_xpath_axes {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();
		
		
		
		
		//Self-->Selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'Kaarya Facilities')]/self::a")).getText();
		System.out.println(text);
		
		
		
		
		//Parent-->Selects the parent of the current node(always one)
		text=driver.findElement(By.xpath("//a[contains(text(),'Kaarya Facilities')]/parent::td")).getText();
		System.out.println(text);
		
		
		
		
		//Child -->Selects all the children of the current node(One or many)
	    List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Kaarya Facilities')]/ancestor::tr/child::td"));
		System.out.println("Number of child Elements:"+childs.size());
		
		
		
		
		//Ancestor-->Selects all the ancestors(parent,grandparent etc)
		text=driver.findElement(By.xpath("//a[contains(text(),'Kaarya Facilities')]/ancestor::tr")).getText();
		System.out.println(text);
		
		
		
		
		//Descendant-->Selects all descendants(children,grand children etc)of the current node
		List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'Kaarya Facilities')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant nodes:"+descendants.size());
		
		
		
		//Following -->Selects everything in the document after the closing tag of the current node
		List<WebElement> followingnodes=driver.findElements(By.xpath("//a[contains(text(),'Kaarya Facilities')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes:"+followingnodes.size());
		
		
		
		
		//Following -sibling -->Selects all siblings after the current node
		List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Kaarya Facilities')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings:"+followingsiblings.size());
		
		
		
		
		
		//Preceding -->Selects all the nodes that appear before the current node in the document
		List<WebElement> precedingnodes=driver.findElements(By.xpath("//a[contains(text(),'Kaarya Facilities')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding nodes:"+precedingnodes.size());
		
		
		
		
		//Preceding -sibling -->Selects all siblings before the current node
		List<WebElement> precedingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Kaarya Facilities')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding siblings:"+precedingsiblings.size());
		
		
		
		driver.quit();
		

}
}
