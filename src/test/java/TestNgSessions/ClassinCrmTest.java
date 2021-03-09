package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassinCrmTest extends BaseTest {

	@Test(priority = 1)
	public void crmTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}

	@Test(priority = 2)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).isDisplayed());
	}

}
