package newpackage1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestNg {

	@Test
	public void m1(){
		System.out.println("inside m1");
	}
	@Test(priority=1)
	public void m2() {
		System.out.println("inside m2");
	}
	@Test(priority=2)
	public void m3() {
		System.out.println("inside m3");
	}
	@BeforeTest
	public void m4() {
		System.out.println("this is a before test annotation");
	}
	
	@AfterTest
	public void m5() {
		System.out.println("This is a after test annotation");
	}
	@BeforeMethod
	public void m6() {
		System.out.println("This is a before method");
	}
	@AfterMethod
	public void m7() {
		System.out.println("this is after method");
	}
	
	

}
