package newpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		
		WebElement elements= driver.findElement(By.name("cstartmonth"));
		
		Select dropdown = new Select(elements);
		
		dropdown.selectByIndex(4);
		
		System.out.println("clicked");
		driver.quit();
		
		
	}

}
