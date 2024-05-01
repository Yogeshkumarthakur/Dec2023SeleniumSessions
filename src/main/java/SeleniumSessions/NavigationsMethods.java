package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsMethods {

	public static void main(String[] args) throws MalformedURLException {

		//There are 4 types of navigation methods: 1.back 2.forward 3.to 4.refresh
		//back and forward   //get is not a type of navigation methods
		//get vs to
		//refresh
		
		WebDriver driver = new ChromeDriver();
		
		//to method is overloaded and get is not thats the only difference otherwise doing same thing
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to(new URL("https://www.google.com/"));//rarely used
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());

		
		//to refresh the page
		driver.navigate().refresh();
		


		
		
		
	}

}
