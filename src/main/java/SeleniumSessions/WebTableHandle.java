package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		////input[@name='contact_id'] - 21
		//a[text()='Chitra Automation']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//(//a[text()='Chitra Automation']/parent::td//following-sibling::td)[position()=5]/a
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation"); 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		selectContact("Chitra Automation");
		selectContact("Hi fish");
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout') and @class='topnavlink']")).click();

		
	}
	
	public static void selectContact(String name) {
		String xpathVal = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpathVal)).click();		
	}
	

}
