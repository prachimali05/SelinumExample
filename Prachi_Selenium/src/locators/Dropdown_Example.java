package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Example {
    public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver",
                    "Driver\\chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();// open the browser

            driver.manage().window().maximize();// maximize the windows
            driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
           
            WebElement Pet = driver.findElement(By.xpath("//select[@id='pet-select']"));
            Select selectPet=new Select(Pet);
           
            // selecting by visible text
            selectPet.selectByVisibleText("Cat");
            Thread.sleep(100);
            selectPet.selectByVisibleText("Parrot");
            Thread.sleep(2000);
       
            //or Selecting multiple values by index
            selectPet.selectByIndex(0);
            selectPet.selectByIndex(2);
           
            Thread.sleep(2000);
            //Or selecting by values
            selectPet.selectByValue("4");
            //selectColour.selectByValue("Yellow");
           
           
            List<WebElement> all_options  =selectPet.getOptions();
            int count=all_options.size() ;
            System.out.println("Total options count    " +count);
           
           
            for(int i=0;i<count;i++)
            {
            String s=all_options.get(i).getText();
            System.out.println(s);
            }
       
            System.out.println("Using for each  Loop ");
            for(WebElement x :all_options)
            {
            //String s=all_options.get(i).getText();
            System.out.println(x.getText());
            }
    }
}