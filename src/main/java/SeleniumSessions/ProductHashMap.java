package SeleniumSessions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductHashMap {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/Lava-2GBRAM-16GB-Storage-Denim/dp/B08TM93RZJ/?_encoding=UTF8&pd_rd_w=IVJlj&pf_rd_p=25041c4e-bc5b-4063-99b1-635043c8cad4&pf_rd_r=QM7TT4FXPSV9VBRAAEXQ&pd_rd_r=f5785989-5e7b-47e9-b5bc-46c7974ef3ed&pd_rd_wg=UQDS3&ref_=pd_gw_ci_mcx_mr_hp_d");

		List<WebElement> headerList = driver
				.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']//tr/th"));
		
		List<WebElement> valueList = driver
				.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']//tr/td"));
		
		Map<String, String> productMap = new HashMap<String, String>();
		
		if(headerList.size() == valueList.size()) {
			for(int i=0; i<headerList.size(); i++) {
				productMap.put(headerList.get(i).getText(), valueList.get(i).getText());
			}
		}
		
		for(Map.Entry<String, String> entry : productMap.entrySet()) {
			System.out.println(entry.getKey() + ":"+ entry.getValue());
		}
		
	}

}
