package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");

		// isDisplayed -- present on the page
		// is Enabled -- element is obviously present on the page but its enabled or not

		boolean f1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(f1);// true
		boolean f2 = driver.findElement(By.name("agreeTerms")).isDisplayed();
		System.out.println(f2);// true

		// To see Submit button enabled or not
		boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag); // false

		// to see the check box selected or not
		boolean chk_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);// false

		driver.findElement(By.name("agreeTerms")).click(); // selected the checkbox

		chk_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);// true

		flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);// true
	}
}
