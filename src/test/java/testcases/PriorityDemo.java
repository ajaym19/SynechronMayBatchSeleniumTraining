package testcases;

import org.testng.annotations.Test;

public class PriorityDemo {

	
	@Test(priority = -1)
	public void chickoo() {
		System.out.println("Chickoo");
	}
	
	@Test(priority = -2)
	public void blueberry() {
		System.out.println("Blue Berry");
	}
	@Test (priority = -3)
	public void Aple() {
		System.out.println("Aple");
	}

	@Test(priority = -3)
	public void apple() {
		System.out.println("Apple");
	}
	
	@Test
	public void zebra() {
		System.out.println("Zebra");
	}
}
