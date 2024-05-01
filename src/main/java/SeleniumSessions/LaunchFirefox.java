package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();//launch browser chrome 
		driver.get("https://www.google.com");// enter url
		String title = driver.getTitle(); // get title
		System.out.println("page title: " + title );// print title
		
		//checkpoints:
		if(title.equals("Google")) {
			System.out.println("correct title -- Pass");
		} else {
			System.out.println("Incorrect Title -- Fail");
		}
		
		//automation steps+ verification point - Automation Testing
		//test steps + verification point -- test cases
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("google.com")) {
			System.out.println("url--  Passed");
		} else {
			System.out.println("url-- failed");
		}
		
	}

}
