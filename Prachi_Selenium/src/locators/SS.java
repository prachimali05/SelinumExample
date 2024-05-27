package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class SS {
	
	public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			 System.setProperty("webdriver.chrome.driver",
	                 "Driver\\chromedriver.exe");
	         //System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();// open the browser

	         driver.manage().window().maximize();// maximize the windows
	         driver.get("https://www.facebook.com");
	         
	         
	    
	         
	         TakesScreenshot ts = (TakesScreenshot)driver ;
	         
	         File src = ts.getScreenshotAs(OutputType.FILE);
	         
	         File des = new File("C:\\abc//a.png");
	         
	         FileHandler.copy(src,des);

		}

	}


