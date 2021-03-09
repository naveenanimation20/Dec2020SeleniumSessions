package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {

		// find out all the links on the page
		// link count - total links on the page
		// print the text value of each link
		// but ignore the blank text

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("total links: " + linksList.size());

		for (int i = 0; i < linksList.size(); i++) {
			String text = linksList.get(i).getText();

			if (!text.isEmpty()) {
				System.out.println(i + "-->" + text);

			}

		}

	}

}
