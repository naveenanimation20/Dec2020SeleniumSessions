package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinksWithXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
//		List<WebElement> freshList = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
//		
//		for(WebElement e : freshList) {
//			System.out.println(e.getText());
//		}
		
//		(//ul[@class='footer-nav'])[1]//a
//				(//ul[@class='footer-nav'])[2]//a
//						(//ul[@class='footer-nav'])[3]//a
//								(//ul[@class='footer-nav'])[4]//a
		
		int colCount = driver.findElements(By.xpath("//ul[@class='footer-nav']")).size();
		
		for(int i=1; i<=colCount; i++) {
			List<WebElement> footerList = 
					driver.findElements(By.xpath("(//ul[@class='footer-nav'])["+i+"]//a"));

				for(WebElement e : footerList) {
					System.out.println(e.getText());
				}
			
		}
		
	}

}
