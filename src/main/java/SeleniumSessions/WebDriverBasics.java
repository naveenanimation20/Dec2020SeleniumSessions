package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\users\\documents\\chromdriver-87\\chromedriver.exe");
		
		//mac
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.get("https://google.com/");//enter the url
		
		String title = driver.getTitle();//get tht title
		System.out.println("page title is: " +title);
		
		//verification point/checkpoint/actual vs expected
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit();//close the browser
		
	}

}
