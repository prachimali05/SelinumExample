package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_SearchJava {
	
	
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();// open the browser

			driver.manage().window().maximize();// maximize the windows

			driver.get("https://www.google.com"); // open google automatically
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("what is java ");
			element.submit();

		}

	}