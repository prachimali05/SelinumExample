package seleniumexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {

	public static void main(String[] args) 
	{
		 System.out.println("hi");

		 System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
	       

		    WebDriver driver = new EdgeDriver();

		        driver.manage().window().maximize();
		        driver.get("http//www.google.com");
		    }

	}
