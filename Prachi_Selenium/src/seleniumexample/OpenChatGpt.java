package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChatGpt {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe" );
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.chat.openai.com");
		driver.manage() .window() .maximize();
		
	WebElement username = driver.findElement(By.classname("relative"));
	username.sendKeys("prachii_mali_05");
	
    Thread.sleep(100);
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("GOTOWELL");
	
	Thread.sleep(100);
	
	driver.findElement(By.linkText("Log in")).click();
	
	}

}


}
