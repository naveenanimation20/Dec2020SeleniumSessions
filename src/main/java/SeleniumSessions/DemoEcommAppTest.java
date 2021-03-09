package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoEcommAppTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title = br.getPageTitle();
		System.out.println("login page title: " + title);
		
		//By locators: OR
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By yourStoreLink = By.linkText("Your Store");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "naveenanimation20@gmail.com");
		eleUtil.doSendKeys(password, "Selenium12345");
		eleUtil.doClick(loginButton);
		
		String accPageTitle = br.getPageTitle();
		System.out.println("acc page title is : " + accPageTitle);
		
		if(eleUtil.doIsDisplayed(yourStoreLink)) {
			String header = eleUtil.doGetElementText(yourStoreLink);
			System.out.println(header);
		}
		
		br.closeBrowser();
		
		
	}

}
