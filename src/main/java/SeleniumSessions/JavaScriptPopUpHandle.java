package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		//JavaScript PopUp Handle or Alert or modal dialog pop ups
		//alert method in JS
		//alert('hi this is my pop up')
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		//accept the alert:
		alert.accept();//click on OK/Submit/Yes buttons
		
		//alert.dismiss();//dismiss the alert
		
		driver.switchTo().defaultContent();
		
		
	}

}
