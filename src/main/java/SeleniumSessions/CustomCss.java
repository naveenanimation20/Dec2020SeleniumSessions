package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCss {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//id --> #{id}
		//class --> .class
		// #username
		// .login-email
		
		//form-control private-form__control login-email
		//.c1.c2.c3...cn
		//tag.c1.c2.c3...cn
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		
		//tag#id : input#username
		//tag.class : input.login-email
		// input.login-email#username
		// input#username.login-email
		// #username.login-email
		
		By email = By.cssSelector("#username");
		
		By email1 = By.xpath("//input[@class='form-control private-form__control login-email']");
		By email2 = By.className("form-control private-form__control login-email");//--wrong
		By email3 = By.cssSelector("input.form-control.private-form__control.login-email");
		By email4 = By.className("login-email");

		// tag[atrr = 'value']
		// input[id='username'] -css
		// input[type='email']
		//input[@id='username'] -xpath
		
		// tag[atrr1 = 'value'][atr2 = 'value']
		// input[id='username'][type='email']
		
		// input[id*='user'] -- contains
		// input[id*='name'][type='email']
		// input[id^='user'] --starts-with
		// input[id$='name'] --ends with
		
		//parent to child in xpath:
		//div[@class='private-form__input-wrapper']//input -- direct + indirect child elements
		//div[@class='private-form__input-wrapper']/input - only direct child elements
		
		//div[@class='page']/div -- 2
		//div[@class='page']//div --24
		
		//parent to child in css:
		// div.private-form__input-wrapper input
		// div.private-form__input-wrapper > input
		
		// div.page div --24 (direct + Indirect)
		// div.page > div -2 (direct)
		// ul.footer-nav li a -- 24
		// ul.footer-nav > li > a -- 24
		// ul.footer-nav > a -- 0
		
		//child to parent in css: NO
		
		//following-sibling in css:
		// div.private-form__input-wrapper + div
		
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		
		// input.form-control.private-form__control:not(.login-email)
		// input.form-control.private-form__control:not(#password)
		
		//comma in css:
		// input#username, input#password, button#loginBtn
		By loginForm = By.cssSelector("input#username, input#password, "
				+ "button#loginBtn, footer.copyright");
		List<WebElement> impEleList = driver.findElements(loginForm);
		int impElements = impEleList.size();
		if(impElements == 4) {
			System.out.println("all imp elements are present on the page....");
			
			for(WebElement e : impEleList) {
				System.out.println(e.isDisplayed());
			}
				
			
		}
		
		//nth-of-type:
		// ul.footer-nav li:nth-of-type(4)
		// ul.nav.navbar-nav.navbar-right li:nth-of-type(3) > a
		
		
	}

}
