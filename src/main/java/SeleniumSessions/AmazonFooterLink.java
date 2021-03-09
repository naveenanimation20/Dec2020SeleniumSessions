package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterLink {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		List<WebElement> footerList = 
					driver.findElements
					(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//a"));
		
		for(WebElement e : footerList) {
			String text = e.getText();
			String url = e.getAttribute("href");
			
			System.out.println(text + " --- " + url);
		}
		
		
		
	}

}
