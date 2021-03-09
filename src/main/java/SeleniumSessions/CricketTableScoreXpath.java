package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketTableScoreXpath {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/pakistan-women-in-zimbabwe-2020-21-1249282/zimbabwe-women-vs-pakistan-women-1st-match-1249285/full-scorecard");
		
		System.out.println(getWicketTakerName("Omaima Sohail"));
		System.out.println(getPlayerScoreCard("Omaima Sohail"));
		
		System.out.println(getWicketTakerName("Nida Dar"));
		System.out.println(getPlayerScoreCard("Nida Dar"));

		
	}
	
	public static String getWicketTakerName(String playerName) {
		String xpathVal = "//a[text()='"+playerName+"']/parent::td/following-sibling::td[@class='text-left']";
		String wicketTakerName = driver.findElement(By.xpath(xpathVal)).getText();
		return wicketTakerName;
	}
	
	public static List<String> getPlayerScoreCard(String playerName) {
		List<String> scoreCardList = new ArrayList<String>();
		List<WebElement> scoreList = 
				driver.findElements(By.xpath("//a[text()='"+playerName+"']/parent::td/following-sibling::td"));
		
		for(int i=1; i<scoreList.size(); i++) {
			scoreCardList.add(scoreList.get(i).getText());
		}
		
		return scoreCardList;
	}
	
	//Joe Root : wckter name : 1 1 1 1 1
	
	

}
