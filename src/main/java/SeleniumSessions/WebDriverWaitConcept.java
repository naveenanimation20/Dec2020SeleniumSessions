package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		// ExplicitWait: dynamic wait
		// WebDriverWait extends FluentWait
		// FluentWait -- implements Wait Interface

		// can be applied for any web elements whenever its needed
		// can be applied for all non web elements also: alert, title, url

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eleUtil = new ElementUtil(driver);
		By email = By.id("input-email");
		By password = By.id("input-password");

		// An expectation for checking that an element is present on the DOM of a page.
		// This does not necessarily mean that the element is visible.

//		WebDriverWait wait = new WebDriverWait(driver, 10, 2000);
//		WebElement emailEle = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		emailEle.sendKeys("test@gmail.com");

		// TimeoutException: Expected condition failed:
		// waiting for presence of element located by: By.id: input-email11
		// (tried for 10 second(s) with 500 milliseconds interval)
//		waitForPresenceOfElement(email, 10).sendKeys("admin@gmail.com");
//		eleUtil.getElement(password).sendKeys("admin123");
//		
//		By rightPanelLinks = By.cssSelector(".list-group a");
//		waitForVisiblilityOfElements(rightPanelLinks, 10)
//			.stream().forEach(ele -> System.out.println(ele.getText()));

		By forgotPwd = By.xpath("//div[@class='list-group']/a[3]");
		clickWhenReady(forgotPwd, 5);
		if(waitForUrlToBe(3, "forgotten")) {
			System.out.println("right url....");
		}
		

	}

	public static WebElement waitForPresenceOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element, known to be present on the DOM
	 * of a page, is visible. Visibility means that the element is not only
	 * displayed but also has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitVisibleOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement ele = driver.findElement(locator);
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static List<WebElement> waitForVisiblilityOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	/**
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static void clickWhenReady(By locator, int timeOut) {
		waitForElementToBeClickable(locator, timeOut).click();
	}

	public static String getElementAttribute(By locator, int timeOut, String name) {
		return waitForElementToBeClickable(locator, timeOut).getAttribute(name);
	}

	public static boolean waitForElementTextToBe(By locator, int timeOut, String value) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.textToBe(locator, value));
	}
	
	public static boolean waitForUrlToBe(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlValue));
	}
	
	/**
	 * An expectation for checking if the given element is selected.
	 * @param timeOut
	 * @param urlValue
	 * @return
	 */
	public static boolean waitForElementToBeSelected(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeSelected(locator));
	}
	
	public static void waitForFrameToBeAvailable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public static void waitForFrameToBeAvailable(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	

}
