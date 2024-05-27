package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Confirm_Alert {
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
		    WebDriver driver = new EdgeDriver();

	        driver.manage().window().maximize();// maximize the windows
	        String url="https://demoqa.com/alerts";
	        driver.get(url);
	       
	        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
	        Alert a = driver.switchTo().alert();
	        System.out.println(a.getText());
	        Thread.sleep(500);
	        a.dismiss();
	        Thread.sleep(500);

	        //driver.quit();
	    }

}
