package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	public static void main(String[] args) {

		//amazon.com -- fetch all the links -- List<WebElement>
		//list --> stream --(sequence, parallel)
		//after jdk 1.8
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");//370
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println(linksList.size());
		
		//sequnence stream
		long stTime = System.currentTimeMillis();
		linksList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		//total time taken: 5490 -- seq time
		// total time taken: 4556 -- parallel

		linksList.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		long endTime = System.currentTimeMillis();
		System.out.println("total time taken: " + (endTime - stTime));
		
//		List<String> amazonList = linksList.stream()
//					.filter(ele -> !ele.getText().isEmpty())
//					.filter(ele -> ele.getText().contains("Amazon"))
//					.map(ele -> ele.getText())
//					.collect(Collectors.toList());
//					
//		amazonList.stream().forEach(ele -> System.out.println(ele));
	}

}
