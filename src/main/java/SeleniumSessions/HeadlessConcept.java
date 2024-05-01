package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		// headless vs headed:

		// Pros
		// headless: no browser visibility
		// headless is slightly faster
		// quite helpful while runs testcases on CI/CD/Jenkins/Linux
		// local: no interruption, if write an email or perform other task it will not
		// impact the execution of our work

		// Cons:
		// its not actual user simulation
		// complex app/HTML DOM:
		// alert popup: some time it might not able to handle the popups and alerts on
		// the app
		// not recommended

		// chrome launch
		ChromeOptions co = new ChromeOptions();
		// co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);

		// Firefox launch
//    	FirefoxOptions fo = new FirefoxOptions();
////		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);

		// edge launch
//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless");
//		//eo.addArguments("--inprivate");
//		WebDriver driver = new EdgeDriver(eo);

		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		// driver.quit();
		
		//headless thirdparty options:
		//ghostdriver
		//phantomJS
		//htmlunitdriver

	}

}
