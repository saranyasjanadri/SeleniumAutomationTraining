package webDriver_Demo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//As soon as we browse our application,immediately browser will save
//the cookies information in the temporary files.

//Cookies are the temporary files which are created by the browser
//while visiting the web pages.

//Cookies information will not standard always, it keeps varying

public class Handle_Cookies {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    
	    
	    
	    //How to capture Cookies from the browser
	    
	    //getCookies()-->Return the list of all the Cookies
	    Set<Cookie> cks=driver.manage().getCookies();
	    System.out.println("Size of the cookies:"+cks.size());
	    
	    
	    
	    
	    
	    //How to print Cookies from the browser
	    for(Cookie cookie:cks)
	    {
	    	System.out.println(cookie.getName()+" : "+cookie.getValue());
	    }
	    
	    
	    
	    
	    
	    
	    //How to add the Cookie to the browser
	    
	    //addCookie(arg0)-->Create and add the Cookie
	    //Creating the Cookie obj and passing the name of the Cookie &
	    //Value of the Cookie into the constructor
	    Cookie cookieobj=new Cookie("MyCookie123","123456");
	    driver.manage().addCookie(cookieobj);
	    
	    //To capture all the Cookies
	    cks=driver.manage().getCookies();
	    System.out.println("Size of the cookies after adding new Cookie:"+cks.size());
	    
	
	    
	    
	    
	    //How to delete specific Cookie from the browser
	    
	    //Method1:
	    //deleteCookie(arg0)-->Delete specific Cookie
	    //By passing the cookie object 
	    //driver.manage().deleteCookie(cookieobj);
	    //cks=driver.manage().getCookies();
	    //System.out.println("Size of the cookies after deletion:"+cks.size());
	    
	    
	    //Method2:
	    //deleteCookieNamed(arg0)-->Delete specific Cookie according to the name
	    //By passing the Cookie name
	    driver.manage().deleteCookieNamed("MyCookie123");
	    cks=driver.manage().getCookies();
	    System.out.println("Size of the cookies after deletion:"+cks.size());
	
	    
	    
	    
	    //How to delete all the Cookies from the browser
	    //deleteAllCookies()-->Deletes all the Cookies
	    driver.manage().deleteAllCookies();
	    cks=driver.manage().getCookies();
	    System.out.println("Size of the cookies after deletion:"+cks.size());
	
	
	}

}
