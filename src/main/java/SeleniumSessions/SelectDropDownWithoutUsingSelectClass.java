package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectDropDownWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		// not allowed to use select class and select the value from the drop down

		By options = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		doSelectValueFromDropDown(options, "India");	
		doSelectValueFromDropDown(options, "Australia");

		
		
		
		
	}
	
	//Utitlity
	//without using the select class -- this utility will select the drop down value

	public static void doSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		System.out.println(optionsList.size());
		
		for(WebElement e: optionsList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
}

