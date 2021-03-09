package SeleniumSessions;

public class AmazonPageTest {

	public static void main(String[] args) {

		String browserName = "naveen";
		
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(browserName);
		br.launchUrl("http://www.amazon.com");
		
		String title = br.getPageTitle();
		if(title.contains("Online Shopping")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		if(br.getPageUrl().contains("amazon")) {
			System.out.println("pointing to right url....");
		}
		
		br.closeBrowser();
		
	}

}
