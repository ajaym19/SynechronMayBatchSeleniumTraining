package testcases;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups = "smoke")
	public void createUser() {
		System.out.println("Creating User");
	}

	@Test(groups = {"regression", "reports"})
	public void sendNotifications() {
		System.out.println("Sending Notifications");
	}

	@Test(groups = "smoke")
	public void login() {
		System.out.println("Login");
	}
}
