package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	static WebDriver driver;
	
	public static void main(String[] args) {

		 driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart");
			
			//driver.findElement(By.name("search11")).sendKeys("mac");//NoSuchElementException
			//:Unable to locate element: {"method":"css selector",
			
			List<WebElement> eles = driver.findElements(By.tagName("naveen")); //it will give empty arraylist
			System.out.println(eles.size());//0
			System.out.println(eles);//[] empty arraylist
			
	}

}
