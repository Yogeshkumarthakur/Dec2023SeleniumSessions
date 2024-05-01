package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1. id -- unique attribute. cannot be duplicate -- 1st
//		   driver.findElement(By.id("input-email")).sendKeys("test@opencart.com");
//		   driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2.name: Can be duplicate -- 2nd
		//using simple strategy
//		driver.findElement(By.name("firstname")).sendKeys("test");
//		driver.findElement(By.name("lastname")).sendKeys("automation");
		
		//Using By Locator strategy:
//		By fn = By.name("firstname");
//		By ln = By.name("lastname");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "test");
//		eleUtil.doSendKeys(ln, "automation");
		
		//Using String Locator strategy:
//		String firstname = "firstname";
//		String lastname = "lastname";
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("name", firstname, "test");
//		eleUtil.doSendKeys("name", lastname, "automation");


		//3.class name: its not a unique attribute, they are webelement path canbe duplicate -- 3rd
		//driver.findElement(By.className("form-control")).sendKeys("testing");
		
		//4. xpath: its not an attribute. address of the webelement in the HTML DOM
		//XML PATH
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("test");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
		
//        By fn = By.xpath("//*[@id=\"input-firstname\"]");
//        By ln = By.xpath("//*[@id=\"input-lastname\"]");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "test");
//		eleUtil.doSendKeys(ln, "automation");
        
	
		//5. CSS: cascaded Stylling sheet-- its not an attribute
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("testing");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("automation");
		
		//6. linktext: only for links and only for text of the links
		//html dom: <a> -- link
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.linkText("Register")).click();
		//linktext using By locator below:
//		By loginLink = By.linkText("Login");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doClick(loginLink);
		
		
		//7. partial linktext: only partial part we need to supply. genrally we should avaoid this 
		//driver.findElement(By.partialLinkText("Forgotten ")).click();
		
		//8. tagName: h1-is a higher header till h6 we can use it lower font
//		String header = driver.findElement(By.tagName("h1")).getText();
//        System.out.println(header);
        
        By pageheader = By.tagName("h1");
		ElementUtil eleUtil = new ElementUtil(driver);
		String header = eleUtil.doGetElementText(pageheader);
        System.out.println(header);
	
	}
	

}
