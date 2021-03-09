package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");//v1
		
		//v1
		List<WebElement> linksList = 
				driver.findElements(By.xpath("//div[@class='list-group']/a"));
		
		for(int i=1; i<linksList.size(); i++) {
			linksList.get(i).click();//v1
			//driver.navigate().back();//v2 v3
			driver.navigate().refresh();
			linksList = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		}
		
		
		
	}

}
