package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodsDemo {

	@Test
	public void tc1() {
		System.out.println("TC1");
	}
	
	@Test
	public void tc2() {
		System.out.println("TC2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BM");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AM");
	}
}
