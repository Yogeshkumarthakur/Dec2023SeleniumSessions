package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkConcept {

	public static void main(String[] args) {

		// 1. Total links
		// 2. Print the text of each links
		// 3. avoid blank text
		// 4. broken links

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// find out all the elements --> FEs

		// 1. Total links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links: " + allLinks.size());

		// 2. Print the text of each links
		for (int i = 0; i < allLinks.size(); i++) {
			String text = allLinks.get(i).getText();
			if (text.length() != 0) { //// 3. avoid blank text
				System.out.println(text);
			}
		}

		System.out.println("---------------");

		for (WebElement e : allLinks) {
			String text1 = e.getText();
			if (text1.length() != 0) { //// 3. avoid blank text
				System.out.println(text1);
			}
		}

		// total text fields on the page--> for this find a common attribute for all the fields like below Classname is same
		List<WebElement> allTextFields = driver.findElements(By.className("form-control"));
		System.out.println(allTextFields.size());
		
		System.out.println("---------------");
		
		// total links and their text particular section of the page-->
		List<WebElement> allLinkText = driver.findElements(By.className("list-group-item"));
		System.out.println(allLinkText.size());
		
		//to get the text from the link we used for loop here
		for (int i = 0; i < allLinkText.size(); i++) {
			String text = allLinkText.get(i).getText();
			if (text.length() != 0) { //// 3. avoid blank text
				System.out.println(text);
			}
		
		

	}
}}
