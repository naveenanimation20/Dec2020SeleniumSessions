package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProductTechDetails {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/Samsung-Galaxy-Storage-Additional-Exchange/dp/B07X8V5YKR/ref=br_msw_pdt-3?_encoding=UTF8&smid=A14CZOWI0VEHLG&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=&pf_rd_r=09F1VSXY7BYMH29BPAN9&pf_rd_t=36701&pf_rd_p=5c669f94-aee5-4b22-81f8-1d301ca2c6a3&pf_rd_i=desktop");

		int rowCount = driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']//tr")).size();
		System.out.println(rowCount);

		String headerXpath = "//table[@id='productDetails_techSpec_section_1']//tr/th";// -- 20
		// table[@id='productDetails_techSpec_section_1']//tr/td
		String tableDataXpath = "//table[@id='productDetails_techSpec_section_1']//tr/th/following-sibling::td";// -- 20

		List<WebElement> headerList = driver.findElements(By.xpath(headerXpath));
		List<WebElement> tableDataList = driver.findElements(By.xpath(tableDataXpath));

//		for(WebElement e : headerList) {
//			System.out.println(e.getText());
//		}
//		
//		for(WebElement e : tableDataList) {
//			System.out.println(e.getText());
//		}

		if (headerList.size() == tableDataList.size()) {
			for (WebElement e : headerList) {
				System.out.println(e.getText());// key
			}

			for (WebElement e1 : tableDataList) {
				System.out.println(e1.getText());// value
			}

		} else {
			System.out.println("data is mismatched.....");
		}

	}

}
