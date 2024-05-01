package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		By country = By.id("Form_getForm_Country");
		doSelectDropDownValue(country, "India");

	}

// *******************************Utility************************************************

	// when u want to get the list of actual text not the webelement then call this
	// method
	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> OptionsTextList = new ArrayList<String>();

		for (WebElement e : optionsList) {
			String optionText = e.getText();
			OptionsTextList.add(optionText);
		}
		return OptionsTextList;
	}

	// when u want to get the list call this method
	public static List<WebElement> getDropDownOptionsList(By locator) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		return select.getOptions();
	}

	// when u want to get the count call this method
	public static int getDropDownValueCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}

	// //when u want to get the value call this method
	// although this below method have performance issue it willbe used just in case
	// orginal select method we dont wanna use
	public static void doSelectDropDownValue(By locator, String value) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);

		// to select all the options without using select method
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		// System.out.println(optionsList.size()-1); //if u wanna print size also
		// to print all the value one by one we use for each loop
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	// to just print all the text vivible on the page on console
	public static void printSelectDropDownValue(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		// System.out.println(optionsList.size()-1); //if u wanna print size also
		// to print all the value one by one we use for each loop
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}