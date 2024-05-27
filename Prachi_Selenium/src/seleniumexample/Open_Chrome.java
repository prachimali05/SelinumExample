package seleniumexample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Selenium Example");
          System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe" );
          
          WebDriver driver=new ChromeDriver();//open the browser
         // driver.manage().window().maximize();//maximize the window
          driver.get("https://www.google.com");//open google automatically
          
         // WebElement element = driver.findElement(By.name("q"));
         // element.sendKeys("what is java ");
         // element.submit();
	}

}
