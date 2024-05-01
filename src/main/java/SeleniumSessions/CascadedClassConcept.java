package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CascadedClassConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//in case of classname: casecaded class will not work. you need to give any one class out of all
		// InvalidSelectorException: Compound class names not permitted
		// driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("yogesh@gmail.com");

		//incase of xpath cascaded class[where so many classes together just separated by space] will work
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test");

		//NSE
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("test");

		//driver.findElement(By.xpath("//input[contains(@class,'form-control')]")).sendKeys("test");

		//cascaded cases with single classname used: it will work to identify unique classname use .login-email on DOM
		// driver.findElement(By.className("login-email")).sendKeys("yogesh@gmail.com");

		//css selector in cascaded  class we can use like below:
		// driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("testy");
	
		//cascaded cases with single css selector used: 
		//driver.findElement(By.cssSelector("input.login-email")).sendKeys("testy-treet");

		//cascaded cases with two css selector used: 
	     driver.findElement(By.cssSelector("input.login-email.private-form__control")).sendKeys("testy-treet");
	
		
		//debrately if we write wrong xpath we get InvalidSelectorException: invalid selector:
		//driver.findElement(By.xpath("//input[@234#$@#$class='form-control']")).sendKeys("test");

	
	}

}
