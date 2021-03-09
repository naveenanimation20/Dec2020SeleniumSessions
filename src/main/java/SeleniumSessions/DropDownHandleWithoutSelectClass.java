package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By indusOptions = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");

		// dont use select class from selenium
		doSelectDropDownWithoutSelectClass(indusOptions, "Travel");
		doSelectDropDownWithoutSelectClass(countryOptions, "Cuba");

	}

	public static void doSelectDropDownWithoutSelectClass(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);

		for (WebElement e : optionsList) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

}
