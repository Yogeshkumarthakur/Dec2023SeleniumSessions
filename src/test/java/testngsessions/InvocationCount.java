package testngsessions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCount {

	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create User");
	}
		
	@Test(invocationCount = 5)
	public void UserLogin() {
		System.out.println("UserLogin test");
	}
	
	
	@Test(priority=1)
	public void paymentTest() {
		System.out.println("payment test");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}
	
	
	
	
	
}
