package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles);
		
		int count = 1;
		while(count < handlesList.size()) {
			driver.switchTo().window(handlesList.get(count));
			System.out.println(driver.getTitle());
			driver.close();
			count++;
		}
		
		driver.switchTo().window(handlesList.get(0));
		System.out.println(driver.getTitle());
	}

}
