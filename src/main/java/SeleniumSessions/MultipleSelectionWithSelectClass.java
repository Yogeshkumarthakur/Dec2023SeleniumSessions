package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionWithSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		// not allowed to use select class and select the value from the drop down

		WebElement dropdownEle = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(dropdownEle);
		
		System.out.println(select.isMultiple());//true means it is a multiselect dropdown
		
		if(select.isMultiple()) {
			System.out.println("multiselect is possible");
			
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
			
		}
		
	//	select.deselectByVisibleText("Lesser flamingo");
		select.deselectAll();
		
		
		
	}
}
