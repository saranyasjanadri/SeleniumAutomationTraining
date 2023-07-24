package jsDemo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screenshot_Timestamp {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\Browser Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au");
		driver.manage().window().maximize();
		
		
		//Since we want every time a new file should be generated.
		//So for that we will be implementing time stamp as bellow.
		
		Date currentdate= new Date();
		System.out.println(currentdate);
		String screenshotfilename=currentdate.toString().replace(" ","-").replace(":","-");		
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File("C://screenshot//"+ screenshotfilename +".png"));
	}

}
