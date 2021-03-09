package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.get("https://google.com/");//enter the url
		
		String title = driver.getTitle();//get the title
		System.out.println("page title is: " +title);
		
		driver.close(); //close the browser
		//driver.quit();
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println("ending....");
		driver.close();
		
		
		
		
	}

}
