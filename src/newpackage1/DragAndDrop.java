package newpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    Actions action = new Actions(driver);
	  WebElement element =  driver.findElement(By.id("draggable"));
	  WebElement element1 =  driver.findElement(By.id("droppable"));
	  
	  action.dragAndDrop(element, element1).build().perform();
	  Thread.sleep(3000);
	  driver.quit();

	}

}
