package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		//child window
		
		//use window handler api in selenium
		//can you handle with list instead of set?
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWidnowId = it.next();
		System.out.println("parent window id is : " + parentWidnowId);
		
		String childWindowId = it.next();
		System.out.println("child window id is : " + childWindowId);
		
		//switching:
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is : " + driver.getTitle());
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWidnowId);
		System.out.println("parent window title is : " + driver.getTitle());
		
		driver.quit();
		
	}

}
