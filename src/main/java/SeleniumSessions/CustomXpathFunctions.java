package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathFunctions {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(4000);
		
//		Actions act = new Actions(driver);
//		act.click(getLinkElement("About Us")).perform();
		
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		
	}
	
	public static WebElement getLinkElement(String text) {
		String xpath = "//a[text()='"+text+"']";
		System.out.println(xpath);
		return driver.findElement(By.xpath(xpath));		
	}
	
	public static WebElement getLinkElement(String tag, String text) {
		return driver.findElement(By.xpath("//"+tag+"[text()='"+text+"']"));		
	}
	
	
	
	
	

}
