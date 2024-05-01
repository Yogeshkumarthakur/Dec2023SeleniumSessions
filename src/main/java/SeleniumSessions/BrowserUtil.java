package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used to initialize the driver on the basis of given browser
	 * name
	 * @param browserName
	 * @return this returns driver
	 */

	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name: " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser..." + browserName);
			// throw new BrowserException("BROWSER NOT FOUND");
			break;

		}

		return driver;

	}

	//string type of url
	public void launchURL(String url) {
		if (url == null) {
			throw new BrowserException("URL IS NULL");
		}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new BrowserException("HTTP/s IS MISSING IN URL");
		}}
		
	//URL type of url
		public void launchURL(URL url) {
			if (url == null) {
				throw new BrowserException("URL IS NULL");
			}
			String appUrl = String.valueOf(url);
			if(appUrl.indexOf("http") == 0) {
				driver.navigate().to(url);
			} else {
				throw new BrowserException("HTTP/s IS MISSING IN URL");
			}

	}

	public String getPageTitle() {
		return driver.getTitle();

	}

	public String getPageURL() {
		return driver.getCurrentUrl();

	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
