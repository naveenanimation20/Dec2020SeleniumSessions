package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldElements {
	

	public static void main(String[] args) {

		// input[@class='form-control']

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By loginLink = By.linkText("Login");
		By regForm = By.xpath("//input[@class='form-control']");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		if(eleUtil.doIsDisplayed(loginLink)) {
			System.out.println("login is present");
		}
		
		if(eleUtil.getElements(loginLink).size()==1) {
			System.out.println("login is present");
		}
		
		

		List<WebElement> formList = eleUtil.getElements(regForm);

		if (formList.size() == 6) {
			System.out.println("yes, all fields are present....");
		}

		for (WebElement e : formList) {
			e.sendKeys("testing");
		}

	}

}
