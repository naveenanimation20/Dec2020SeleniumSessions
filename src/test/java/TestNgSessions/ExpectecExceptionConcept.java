package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectecExceptionConcept {
	
	String name = "Tom";
	
	

	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void loginTest() {
		System.out.println("login to app");
		//int i = 9/0;
		ExpectecExceptionConcept obj = null;
		System.out.println(obj.name);
	}

}
