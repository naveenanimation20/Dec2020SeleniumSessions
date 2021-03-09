package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement username = driver.findElement(By.id("input-email"));
		username.sendKeys("naveen@gmail.com");
		//username.clear();
		driver.navigate().refresh();
		//v2
		username = driver.findElement(By.id("input-email"));		
		username.sendKeys("tom@gmail.com");
		//selenium.StaleElementReferenceException: stale element reference: 
		//element is not attached to the page document
		
		
		
		
		
	}

}
