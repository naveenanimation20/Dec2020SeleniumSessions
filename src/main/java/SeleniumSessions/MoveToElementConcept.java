package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

//		Actions act = new Actions(driver);
//		
//		act.moveToElement(driver.findElement(By.className("menulink"))).perform();
		By mainMenu = By.className("menulink");
		doMoveToElement(mainMenu);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COURSES")).click();		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	//2 level manu and sub menu
	public static void doMoveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}
	
	//3 level
	public static void doMoveToElement(By locator1, By locator2) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		act.moveToElement(getElement(locator2)).perform();

	}
	
	//3 level with click
	public static void doMoveToElement(By locator1, By locator2, By locator3) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		act.moveToElement(getElement(locator2)).perform();
		getElement(locator3).click();
	}
	
	

}
