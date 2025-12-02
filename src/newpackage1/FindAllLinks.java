package newpackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		//Finds all<a> (anchor) tags on the webpage.Returns a list of WebElements representing each link.
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No. of links are: "+links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println("Name of Link is: "+links.get(i).getText()+i);
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
