package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		//Thread.sleep(3000);
		//waits: static : Thread.sleep 
		//and dynamic: selenium wait : 
		
		//Implicitly Wait:
		//1. global wait: dynamic wait -- globally applied for all the webelements
		//whenever you are creating the WE with FE/FEs method -- IMP wait will be applied
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		//loginPage: 20 secs
		//e1
		driver.findElement(By.name("q")).sendKeys("naveen automation");
		//e2
		//e3
		//e4 - click 
		
		//Home page: 10 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//e5
		//e6
		//e7
		//e8 - click
		
		//Product page: 30
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//e9
		//e10
		//e11
		
		//reg page: 0 imp wait -> nullification of imp wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//e12
		//e13
		//e14 -- click 
		
		//home page: 0 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}

}
