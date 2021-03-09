package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser = "chrome";

		if (browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		else {
			System.out.println("please pass the correct browser....");
		}

		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);

		driver.quit();

	}

}
