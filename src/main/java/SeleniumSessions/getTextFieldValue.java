package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.id("input-email")).sendKeys("victor@gmail.com");
			
//		String text = driver.findElement(By.id("input-email")).getText();
//		System.out.println(text); //getting nothing bcoz we can not apply get text method on text fields
		
		
		//get text method can be applied where actual text is available like: header, links, label, span
		
		//I want to fetch the value from email fiel whatever I have entered
//		String emailid = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(emailid);
		
		//Fill the value in the registration page
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("Yogesh");
     	driver.findElement(By.id("input-lastname")).sendKeys("Thakur");
		driver.findElement(By.id("input-email")).sendKeys("yogesh@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9898398723");
		driver.findElement(By.id("input-password")).sendKeys("test1234");
		driver.findElement(By.id("input-confirm")).sendKeys("test1234");		
		
		//Fetch the value filled from the registration page
		
		String f_name = driver.findElement(By.id("input-firstname")).getAttribute("value");
		System.out.println(f_name);
		String l_name = driver.findElement(By.id("input-lastname")).getAttribute("value");
		System.out.println(l_name);
		String emailid = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(emailid);
		String telephone = driver.findElement(By.id("input-telephone")).getAttribute("value");
		System.out.println(telephone);
		String password = driver.findElement(By.id("input-password")).getAttribute("value");
		System.out.println(password);
		String confirm = driver.findElement(By.id("input-confirm")).getAttribute("value");
		System.out.println(confirm);
		
		

	}

}
