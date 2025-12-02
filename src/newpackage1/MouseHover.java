package newpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		driver.get("https://www.ebay.com/");
		
		Actions action = new Actions(driver);
		
		  WebElement element  =  driver.findElement(By.linkText("Electronics"));
	       action.moveToElement(element).build().perform();
	       
	       Thread.sleep(2000);
	       WebElement element1= driver.findElement(By.linkText("Apple"));
	       
	       action.moveToElement(element1).build().perform();
	       driver.quit();
		
		

	}

}
