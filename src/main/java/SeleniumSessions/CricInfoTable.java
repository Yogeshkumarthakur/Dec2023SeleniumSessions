package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/india-vs-england-4th-test-1389402/full-scorecard");

		System.out.println(getWicketTakerName("Shoaib Bashir"));
		System.out.println(getWicketTakerName("Ben Foakes"));

		System.out.println(getScoreCard("Shoaib Bashir"));
		System.out.println(getScoreCard("Ben Foakes"));
		
		
	}

	
	
	
	
	//Not common util methodso only for this cricifo app:
	
	public static String getWicketTakerName(String batsmanName) {
		return driver
				.findElement(
						By.xpath("//span[text()='" + batsmanName + "']/ancestor::td/following-sibling::td//span/span"))
				.getText();
	}

	public static List<String> getScoreCard(String batsmanName) {
		List<WebElement> scoreEles = driver.findElements(By.xpath("//span[text()='" + batsmanName
				+ "']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> scoreCardList = new ArrayList<String>();

		for (WebElement e : scoreEles) {
			String text = e.getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
	}

}
