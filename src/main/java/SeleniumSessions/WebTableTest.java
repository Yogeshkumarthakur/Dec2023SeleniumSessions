package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

//		selectContact("Joe Root");
//		String compName = getComName("Joe Root");
//		System.out.println(compName);
		
		selectContact("Joe Root");
		String phoneNo = getPhoneNumber("Joe Root");
		System.out.println(phoneNo);
		

	}

	// Genric methods for this crmopro only
	public static void selectContact(String contactName) {
		String xpath = "//a[text()='" + contactName
				+ "']/parent::td//preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}

	public static String getComName(String contactName) {
		String xpath = "//a[text()='" + contactName + "']/parent::td//following-sibling::td//a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public static String getPhoneNumber(String contactName) {
		String xpath = "//span[@context='phone']";
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public static void getContactInfoList(String contactName) {

	}

}
