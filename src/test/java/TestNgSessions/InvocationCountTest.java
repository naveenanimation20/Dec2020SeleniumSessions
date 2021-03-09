package TestNgSessions;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	@Test(invocationCount = 10)
	public void loginTest() {
		System.out.println("login to app");
	}
	

}
