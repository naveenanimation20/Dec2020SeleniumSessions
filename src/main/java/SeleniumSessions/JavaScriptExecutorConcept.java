package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());
//		
//		jsUtil.refreshBrowserByJS();
		
		//jsUtil.generateAlert("this is dec batch alert....");
		
		//System.out.println(jsUtil.getPageInnerText());
		
//		WebElement user = driver.findElement(By.name("username"));
//		WebElement pwd = driver.findElement(By.name("password"));
//
//		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
//		jsUtil.drawBorder(login);
		
//		jsUtil.flash(user);
//		user.sendKeys("naveen");
//		
//		jsUtil.flash(pwd);
//		pwd.sendKeys("naveen123");
//		
//		jsUtil.flash(login);
		
	
		//jsUtil.scrollPageDown();
//		
//		WebElement ele = driver.
//				findElement(By.xpath("//span[text()='Best Sellers in Home & Kitchen']"));
//		
//		jsUtil.scrollIntoView(ele);
		
		jsUtil.clickElementByJS(driver.findElement(By.linkText("Mobiles")));
		
		
//		Thread.sleep(5000);
//		driver.quit();
		
		
		
		
		
		
	}

}
