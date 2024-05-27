package mouse_keyboard;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

   public static void main(String[] args) throws InterruptedException {
	   
	   System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
       WebDriver driver = new EdgeDriver();

       driver.manage().window().maximize();// maximize the windows
       driver.get("https://sellglobal.ebay.in/seller-center/");
       
       //WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[5]/a"));
       
       WebElement ele = driver.findElement(By.xpath("(//a[@class='ekit-menu-nav-link' and text()='Marketing & Promotion'])[3]"));
       Thread.sleep(100);
       Actions act=new Actions(driver);
       act.moveToElement(ele).build().perform();

       //act.doubleClick(ele).perform();
       Thread.sleep(2000);
       
       System.out.println("hi");
       

   }

}

