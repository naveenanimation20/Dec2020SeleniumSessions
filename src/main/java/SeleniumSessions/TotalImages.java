package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		System.out.println("total images : " + imageList.size());
		
		for(WebElement e : imageList) {
			System.out.println(e.getAttribute("alt") + " ---> "+ e.getAttribute("src"));
		}
		

	}

}
