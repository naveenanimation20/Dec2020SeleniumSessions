package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		//xpath -- is not an attribute
		//address of the element inside the html DOM
		
		//2 types of xpath:
		//a. absolute xpath: abs address of the element
		//html/body/div[2]/div[1]/div[3]/ul[1]/li[3]/input
		//html/body/div[2]/div/div[3]/form/div/input[1]
		
		//b. relative/custom xpath: 
		
		//htmltag[@attr='value']
		//input[@name='username']
		//input[@class='form-control']
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@id='username' and @type='email']
		//button[@data-test-id='password-login-button']
		
		//htmltag[@attr1='value' and @attr2='value' and @attr3='value']
		//button[@data-test-id='password-login-button' and @id='loginBtn' and @aria-disabled='false' ]
		
		By email = By.xpath("//input[@name='username']");
		By username = By.xpath("//input[@id='username' and @type='email']");
		By loginBtn = By.xpath("//button[@data-test-id='password-login-button']");
		
		//id='test_123'
		//id='test_234'
		//id='test_345'
		
		//contains() in xpath:
		//htmltag[contains(@id,'test_')]
		//input[contains(@id,'email')]
		
		//htmltag[contains(@id,'value') and @name='value']
		//input[contains(@id,'email') and @type='text']
		//input[contains(@id,'email') and contains(@type,'text')]
		
		//input[@id='input-email']
		//*[@id='input-email']
		
		By.className("form-control private-form__control login-email"); //--not correct
		By.xpath("//input[@class='form-control private-form__control login-email']");
		By.className("login-email");
		
		//By search = By.className("search_query form-control ac_input");
		//By search = By.xpath("//input[@class='search_query form-control ac_input']");
		By search = By.className("search_query");
		driver.findElement(search).sendKeys("Dress");
		
		//text() in xpath:
		//htmltag[text()='value']
		//h2[text()='Refreshing business software that your teams will love']
		//a[text()='Customers']
		
		//tag[text()='value' and @attr='value']
		//a[text()='Customers' and @href='/customers/']
		
		//text() with contains():
		//tag[contains(text(),'value')]
		//h2[contains(text(),'Refreshing')]
		//a[text()='Pricing']
		driver.findElement(By.xpath("//h3[text()='Marketing Campaigns']")).isDisplayed();
		
		//indexing:
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		// (//input[contains(@class,'form-control')])[1]
		// (//input[contains(@class,'form-control')])[position()=1]
		// (//ul[@class='list-unstyled']/li)[last()]
		
		//starts-with:
		//input[starts-with(@id,'user')]
		//h3[starts-with(text(),'Contact')]
		
		////input[@id='username']/ancestor::form
		//this is for child to grand parent
		
		//input[@id='username']/parent::div
		
		
		
	}

}
