package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		By calendar = By.cssSelector(".ui-datepicker-calendar tr a");
		selectDate(calendar, "25");
		
		
		//driver.findElement(By.xpath("//a[text()='15']")).click();
		
		//selectDate("20");
		
//		List<WebElement> daysList = 
//				driver.findElements(By.cssSelector(".ui-datepicker-calendar tr a"));
//		
//		for(WebElement e : daysList) {
//			if(e.getText().equals("20")) {
//				e.click();
//				break;
//			}
//		}
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
	
	public static void selectDate(String day, String tagName) {
		driver.findElement(By.xpath("//"+tagName+"[text()='"+day+"']")).click();
	}
	
	public static void selectDate(By locator, String day) {
		boolean flag = false;
		List<WebElement> daysList = driver.findElements(locator);
		for(WebElement e : daysList) {
			if(e.getText().equals(day)) {
				System.out.println("right date...."+ day);
				e.click();
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("wrong date..." + day);
		}
	}
	
	
	

}
