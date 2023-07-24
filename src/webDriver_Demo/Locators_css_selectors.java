package webDriver_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


//CSS-Cascading Style Sheets
//CSS is a style sheet language which describes the presentation of 
//HTML document
//CSS Selectors are used to target the HTML elements in the web page.
public class Locators_css_selectors {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		
		
		//1)TagName & ID--->TagName#id (or only) #id
		
		//Finding the email address box
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		
		
		
		
		
		
		//2)TagName & class--->TagName.classValue (or only) .classValue
		
		//Finding the email address box
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc@gmail.com");
		


		
		
		//3)TagName & attribute-->TagName[AttributeName='AttributValue'] (or only) [AttributeName='AttributValue']
		
		//Finding the email address box
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("[name='email']")).sendKeys("abc@gmail.com");
		
		
		
		
		
		
		//4)Combination of Tag, ID & ClassName-->
		
		//Type1:TagName,Class & Attribute(can use one or more) -->
		//TagName.classValue[AttributeName=AttributeValue]
		//Type2:TagName,ID & Attribute(can use one or more)-->
		//TagName#idValue[AttributeName='AttributeValue'][AttributeName='AttributeValue']
		
		
		//Finding the email address box
		//By using Type1:
		//driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_email']")).sendKeys("abc@gmail.com");
		
		//By using Type2:
		driver.findElement(By.cssSelector("input#email[autofocus='1'][name='email']")).sendKeys("xyz@gamil.com");		
		
		//Finding the password box
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("test");
		
		
		
		
		
		
		//5)CSS selector with sub string(To find dynamic web element)-->
		
		//Consider this example HTML code for demo
		//<input name="postal_code" id="input" placeholder="Your postal code"
		//type="text">
		
		/*
		//Prefix-->
		input[name^='postal_c']
		
		//suffix-->
		input[name$='_code']
		
		//sub-string-->
		input[name*='tal_co']	
		input[placeholder*='postal']
		*/	

		
		
		
		
		//6)Finding child or subChild elements-->
		
		//i)Direct child:Child combinator(>) is used to select direct child
		//TagName[AttributeName='AttributeValue']>TagName[AttributeName='AttributeValue']
		
		//select#Form_submitForm_Country>option (or)
		//select#Form_submitForm_Country>option[value='Afghanistan'] (or)
		//select[id='Form_submitForm_Country']>option[value='Afghanistan']
		//div:nth-child(2)>shop-button>a
		
		
		//ii)Child or SubChild:Descendant combinator(space)is used to select Child or SubChild
		//TagName[AttributeName='AttributeValue'] TagName[AttributeName='AttributeValue']	
		
		//form[id='Form_submitForm'] div (or)-->it returns multiple elements
		//form[id='Form_submitForm'] div[class='Actions'] (or)
		//select[id='Form_submitForm_Country'] option[value='Afghanistan']
		
		
		
		
		
		
		//7)Finding Next Sibling

        //Adjacent sibling combinator(+) seperates two CSS selectors and 
		//matches the second web element only if it immediately follows the 
		//first web element,& both are the child of same parent web element. 
        //TagName[AttributeName='AttributeValue']+TagName[AttributeName='AttributeValue']
		
		//option[value='Afghanistan']+option[value='Albania'] (or)
		//option[value='Afghanistan']+option
		
		
		
		
		
		
		
		//8)CSS Pseudo classes-->(To find dynamic web element)
		//A CSS pseudo-class is a keyword added to a selector that 
		//specifies a special state of the selected web element.
		//Ex Pseudo classes:First-child,Last-child etc
		
		
		//For example:Take any select class from dropdown element, 
		//Here consider the select class is the parent and it contains the
		//group of options are the childs. 
		
		//i)first-child -->Returns first element from the group of sibling elements.
		//select#Form_submitForm_Country>:first-child (or)(Using (>)child combinator)
		//select#Form_submitForm_Country :first-child (or)(Using (space)Descendant combinator)
		//select#Form_submitForm_Country option:first-child (or)
		//select#Form_submitForm_Country *:first-child 
		
		
		//ii)last-child-->Returns last element from the group of sibling elements.
		//select#Form_submitForm_Country :last-child 
		
		
		//iii)nth-child()-->Returns elements based oh their position in a group of siblings
		//select#Form_submitForm_Country :nth-child(4)
		
		
		//iv)nth-last-child()-->Returns elements based oh their position
		//among a group of siblings,counting from the end.
		//select#Form_submitForm_Country :nth-last-child(5)
		
		
		//v)first-of-type-->Returns the first element of its type among
		//a group of sibling elements.
		//div#Form_submitForm_subdomain_Holder>span:first-of-type
		
		
		
		//vi)last-of-type-->Returns the last element of its type among
		//a group of sibling elements.
		////div#Form_submitForm_subdomain_Holder>span:last-of-type
		
		
		//vii)nth-of-type()-->matches elements of a given type,
		//based on their position among a group of siblings.
		//div#Form_submitForm_subdomain_Holder>span:nth-of-type(2)
		
		
		Thread.sleep(2000);
        driver.close();
	}

}
