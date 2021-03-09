package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeWindowHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement e1 = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		WebElement e2 = driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
		WebElement e3 = driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));
		WebElement e4 = driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));

		// case 1 : click on one by one:
//		e1.click();
//		windowHandleOneByOne();
//		
//		e2.click();
//		windowHandleOneByOne();
//		
//		e3.click();
//		windowHandleOneByOne();
//		
//		e4.click();
//		windowHandleOneByOne();
		
		
		// case 2: click all elements at the same time:
		e1.click();
		e2.click();
		e3.click();
		e4.click();
		
		Set<String> h1 = driver.getWindowHandles();
		List<String> l1 = new ArrayList<String>(h1);
		System.out.println(l1.size());

		for(int i=1; i<l1.size(); i++) {
			driver.switchTo().window(l1.get(i));
			System.out.println("child window title is: " + driver.getTitle());
			driver.close();
		}
		driver.switchTo().window(l1.get(0));
		System.out.println("parent window title : " + driver.getTitle());
		
		driver.quit();

	}

	public static void windowHandleOneByOne() {
		Set<String> h1 = driver.getWindowHandles();
		List<String> l1 = new ArrayList<String>(h1);

		System.out.println(l1.size());

		driver.switchTo().window(l1.get(1));
		System.out.println("child window title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(l1.get(0));
		System.out.println("parent window title : " + driver.getTitle());
	}

}
