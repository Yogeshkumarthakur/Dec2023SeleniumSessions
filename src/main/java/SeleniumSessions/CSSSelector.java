package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//driver.findElement(By.cssSelector(cssSelector));
		
		//id
		//#id
		driver.findElement(By.cssSelector("#username")).click();
		//tagname#id
		driver.findElement(By.cssSelector("input#username")).click();

		//class
		//.class
		driver.findElement(By.cssSelector(".login-email")).click();
		//tagname.class
		driver.findElement(By.cssSelector("input.login-email")).click();
		
		
		//class + id  :  we can reverse it aswell like below
		// .classname#id
		// #id.class
		//input.login-email#username
		//input#username.login-email
		
		
		//if we have multiple classes then we can use below formula for CSS selector
		// c1.c2.c3.cn...
		// .form-control.private-form__control.login-email
		// tagname.c1.c2.c3.cn...
		// input.form-control.private-form__control.login-email
		// tagname.c1.c2.c3#tagname
		// input.form-control.private-form__control.login-email#username
		
		//css with other attribute:
		// tagname[attr='value']  - this is css selector (no need to write @attrname)
		// tagname[@attr='value']  - this is xpath
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
