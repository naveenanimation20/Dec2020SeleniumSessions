package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
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
		
		
		
		
		
		
		
		
	}

}
