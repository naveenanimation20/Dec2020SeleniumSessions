package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//locators:
		//create the webelement --> perform the action(click, send keys, get the text)
		//first: id:
		//id is always unique attribute
		
		//1st:
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@1234");
//		
		//2nd
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		emailId.sendKeys("naveen@gmail.com");
//		
//		WebElement password = driver.findElement(By.id("input-password"));
//		password.sendKeys("naveen@123");
		
		//3rd: by locators: OR
//		By email = By.id("input-email");
//		By password = By.id("input-password");
		
//		WebElement emailid = driver.findElement(email);
//		WebElement pwd = driver.findElement(password);
//
//		emailid.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");
		
		//4th:
//		getElement(email).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		//5th:
//		doSendKeys(email, "naveen@gmail.com");
//		doSendKeys(password, "test@123");
		
		//second: name: is  not unique attribute
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		
		//third: className (not recommended if class name is not unique)
		//driver.findElement(By.className("abcs")).sendKeys("test@gmail.com");
		
		//fourth: xpath: is a locator, not an attribute. address of the element in HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("test123");
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		
		//fifth: css Selector: is a locator, not an attribute.
//		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("test");
//		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
		
		//sixth: linktext: only for links: htmltag = <a>
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.linkText("Order History")).click();
		
		//seventh: partialLinkText:only for links: htmltag = <a>
		//driver.findElement(By.partialLinkText("About")).click();
		
		//About Us
		//About Me
		
		//eigth: tagName:
//		String h2Header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(h2Header);
		
		
		//By locators:
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		doSendKeys(email, "naveenanimation20@gmail.com");
		doSendKeys(password, "Selenium12345");
		doClick(loginButton);
		
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	
	
}
