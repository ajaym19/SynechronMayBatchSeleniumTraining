package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy;

public class DependsOnDemo {

	@Test
	public void login() {
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods = "login")
	public void sendFriendRequest() {
		System.out.println("Sending Friend Request");
		Assert.fail("Failing Test");
	}
	
	@Test(dependsOnMethods = {"sendFriendRequest","login"})
	public void acceptFriendRequest() {
		System.out.println("Accepting Friend Request");
	}
	
	@Test(invocationCount = 3)
	public void validateHomePage() {
		System.out.println("Validing home page");
	}
	
	@Test(enabled = false)
	public void report() {
		System.out.println("Report");
	}
}
