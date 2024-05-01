package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		//for getting text we use --> getText()
		//for getting attribute we use --> getAttribute()    --> always in key-value format in DOM
		
		//requirements:
		//get all the links
		//capture href values
		
	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//ugly code
//        String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//        String fn_type = driver.findElement(By.id("input-firstname")).getAttribute("type");
//        String fn_name = driver.findElement(By.id("input-firstname")).getAttribute("name");
//
//		System.out.println(fn_placeholder);
//		System.out.println(fn_type);
//		System.out.println(fn_name);
		
		
		By firstName = By.id("input-firstname");
		By registerLink = By.linkText("Register");
		
		
		
		
		
		String fn_placeholder = doElementGetAttribute(firstName, "placeholder");
		System.out.println(fn_placeholder);
		
		String fn_class = doElementGetAttribute(firstName, "class");
		System.out.println(fn_class);
		
		String register_ref = doElementGetAttribute(registerLink, "href");
		System.out.println(register_ref);
		
		
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
