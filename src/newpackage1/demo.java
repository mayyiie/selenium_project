 package newpackage1;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
	
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Title: " + driver.getTitle());
	        driver.get("https://petstore.octoperf.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(1000);
	        driver.findElement(By.linkText("Enter the Store")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.partialLinkText("Sign")).click();
	        driver.findElement(By.name("username")).sendKeys("j2ee");
	        Thread.sleep(1000);
	        driver.findElement(By.name("password")).clear();
	        driver.findElement(By.name("password")).sendKeys("j2ee");
	        Thread.sleep(1000);
	        driver.findElement(By.name("signon")).click();
	        
	     driver.quit();
}}
