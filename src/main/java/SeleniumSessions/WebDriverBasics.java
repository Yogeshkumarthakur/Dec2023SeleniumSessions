package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//Manual steps:
		//open the browser: chrome
		//enter the url
		//get the title
		//verify the title - act vs expected results
		
		
		//Explain below line
		//WebDriver driver = new ChromeDriver();
		//Webdriver: interface
		//driver: object reference variable
		//chrome driver: class
		//Top casting concept: child class object has been refferred by Parent Interface reference variable
		
		
		//automation steps
		WebDriver driver = new ChromeDriver();//launch browser chrome 
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
		
		// to close the browser we have 2 methods quite() and close()
		//driver.quit();
		driver.close();
		
	}

}
