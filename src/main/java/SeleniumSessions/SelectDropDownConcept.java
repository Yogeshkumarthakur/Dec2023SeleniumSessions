package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

//		Select tag will be available for drop-down most of the time, Sometime its not there
//		with Select tag option is always present in Dom as a chile of Select tag

		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		//in select class what will u supply?
//		//we created on above line and pass WebElement as a country in Select class object
//		Select select = new Select(country); 
//		
//		// we have 3 methods in select class. 
//		//1. SelectByIndex 2.SelectByValue    3.SelectByVisibletext
		
//		select.selectByIndex(5);// we use when we have fix value like month drop down
//		select.selectByVisibleText("India"); // we should prefer this Visible Text
//		select.selectByValue("Australia");
		
//		//calling wrapper classed created for all 3 select methods
//		By country = By.id("Form_getForm_Country");
//		doSelectByIndex(country, 6);
//		doSelectByVisibleText(country, "India");
//		doSelectByValue(country, "Australia");
		
		
		
	
		
		
	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//utility for select class dropdown
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator)); 
		select.selectByIndex(index);
	}
	
	public static void doSelectByVisibleText(By locator, String visibleText) {
		
		//throwing own null pointer exception here
		if(visibleText == null || visibleText.length()==0) {
			throw new MyElementException("visible text can not be null");
		}
		
		Select select = new Select(getElement(locator)); 
		select.selectByVisibleText(visibleText);
	}
	
	public static void doSelectByValue(By locator, String value) {
		
		//throwing own null pointer exception here
				if(value == null || value.length()==0) {
					throw new MyElementException("visible value can not be null");
				}
				
		Select select = new Select(getElement(locator)); 
		select.selectByValue(value);
	}
	
}
