package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class File_Upload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// open the browser

		driver.manage().window().maximize();// maximize the windows
		driver.get("https://demoqa.com/upload-download");
		//WebElement upload = driver.findElement(By.xpath("//input[@id=\"uploadFile\"]"));
		//upload.sendKeys("C:\\Users\\prachi mali\\OneDrive\\Documents\\PRACHI MALI.docx");
		System.out.println("hdj");
		WebElement upload = driver.findElement(By.xpath("//input[@id='userName']"));
		
		

		
	}

}
