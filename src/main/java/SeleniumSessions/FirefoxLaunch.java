package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com/");// enter the url

		String title = driver.getTitle();// get tht title
		System.out.println("page title is: " + title);

		// verification point/checkpoint/actual vs expected
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		driver.quit();// close the browser

	}

}
