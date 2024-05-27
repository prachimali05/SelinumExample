package mouse_keyboard;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
		    WebDriver driver = new EdgeDriver();

	        driver.manage().window().maximize();// maximize the windows
	        driver.get("https://demoqa.com/buttons");
	       
	        WebElement ele = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	        Thread.sleep(100);
	        Actions act=new Actions(driver);
	        act.doubleClick(ele).build().perform();

	        act.doubleClick(ele).perform();
	        Thread.sleep(2000);
	       
	        System.out.println("hi");
	       

	    }


}
