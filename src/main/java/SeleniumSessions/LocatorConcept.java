package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	// Chrome Dev tools
	// Element Section: DOM - Document Object Model
	// attribute always present in Key and Value format but text will not be present
	// in the Key value format

	// Create web element + Perform action on it like (click,is displayed, get text

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1.
//	   driver.findElement(By.id("input-email")).sendKeys("test@opencart.com");
//	   driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2.
		// in this approach element is already with us now its up to us how many times
		// and how we gonna use it
//	  WebElement emailId = driver.findElement(By.id("input-email"));
//    WebElement password = driver.findElement(By.id("input-password"));
//    emailId.sendKeys("test@opencart.com");
//    password.sendKeys("test@123");
//    //emailId.sendKeys("victor@gmail.com");

		// 3. By locator Approach
//    By username = By.id("input-email");
//    By pwd = By.id("input-password");
//   
//    WebElement emailId =  driver.findElement(username);
//    WebElement password = driver.findElement(pwd);
//  
//    emailId.sendKeys("test@opencart.com");
//    password.sendKeys("test@123");

		// 4. By Locator with some utility:
//	   By username = By.id("input-email");
//     By pwd = By.id("input-password");
//	
//     WebElement emailId = getElement(username);
//     WebElement password = getElement(pwd);
//     
//     emailId.sendKeys("test@opencart.com");
//     password.sendKeys("test@123");

		// 5. By Locator with element utility and action utitlity:
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		doSendKeys(username, "test@opencart.com");
//		doSendKeys(pwd, "test@123");

		// 6. By Locator and create a common utility class {this By Locator sdtrategy
		// Prefferred in 99% companies
		// Page By Locator also called OR -- Object Repository
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(username, "test@opencart.com");
//		eleUtil.doSendKeys(pwd, "test@123");

		// 7. BrUtil + EleUtil

		// 8. ByUtil + String Locators

		String username_id = "input-email";
		String pwd_id = "input-password";
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", username_id, "test@opencart.com");
		eleUtil.doSendKeys("id", pwd_id, "test@123");
		
		//String --> by --> webelement --> action --2.
		//by --> webelement --> action -- 1. preference
		//webelement -->  action -- 3.

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}

}
