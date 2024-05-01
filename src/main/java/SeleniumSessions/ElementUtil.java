package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//SRP: Single responsibility Principal
public class ElementUtil {

	private WebDriver driver;

	// need to create a constructor below so driver will not be null, here we are
	// using Encapsulation concept.
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	//1 common method for null check
	private void nullBlankCheck(String value) {
		//throwing own null pointer exception here
		if(value == null || value.length()==0) {
			throw new MyElementException(value + " --- value text can not be null or blank");
		}
		}

	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "css":
			locator = By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator = By.tagName(locatorValue);
			break;

		default:
			break;
		}

		return locator;
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
			
		try {
			element = driver.findElement(locator);
		}
		catch(NoSuchElementException e) {
			System.out.println("element is not present on page");
			e.printStackTrace();
			return null;
		}
		return element;
	}

	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public void doSendKeys(By Locator, String value) {
		nullBlankCheck(value);// this method is checking if there is any null value
		getElement(Locator).sendKeys(value);
	}

	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}

	public String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public boolean isElementExist(By locator) {
		if(getElements(locator).size()==1) {
			return true;
		}
            return false;
		
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}

		return eleTextList;
	}

	public ArrayList<String> getElementAttributeList(By locator, String attrname) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttrList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrname);
			if (attrValue.length() != 0) {
				eleAttrList.add(attrValue);
			}
		}
		return eleAttrList;
	}
	
	//***************************Select based DropDown utilities*********************************
	
	//utility for select class dropdown
	public  void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator)); 
		select.selectByIndex(index);
	}
	
	public  void doSelectByVisibleText(By locator, String visibleText) {
		//calling own null pointer exception method here
		nullBlankCheck(visibleText);
		
		Select select = new Select(getElement(locator)); 
		select.selectByVisibleText(visibleText);
	}
	
	public  void doSelectByValue(By locator, String value) {
		//calling own null pointer exception method here
		nullBlankCheck(value);
			
		Select select = new Select(getElement(locator)); 
		select.selectByValue(value);
	}
	
	// when u want to get the list of actual text not the webelement then call this method
	public  List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> OptionsTextList = new ArrayList<String>();

		for (WebElement e : optionsList) {
			String optionText = e.getText();
			OptionsTextList.add(optionText);
		}
		return OptionsTextList;
	}

	// when u want to get the list call this method
	public List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}

	// when u want to just get the count call this method
	public int getDropDownValueCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}

	// //when u want to get the value call this method
	// although this below method have performance issue it willbe used just in case
	// orginal select method we dont wanna use
	public void doSelectDropDownValue(By locator, String value) {
		nullBlankCheck(value);
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

	// to just print all the text visible on the page on console
	public  void printSelectDropDownValue(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		// System.out.println(optionsList.size()-1); //if u wanna print size also
		// to print all the value one by one we use for each loop
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	//without using select class -- it will select the drop down value
	
	public void doSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());
		
		for(WebElement e: optionsList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	
	
	//Utility for Search method on google
	
	public  void doSearch(By searchlocator, By searchSuggestions, String searchKey, String value) throws InterruptedException {
		doSendKeys(searchlocator, searchKey);
		Thread.sleep(3000);

		List<WebElement> suggList = getElements(searchSuggestions);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(value)) {
				e.click();
				break;
			}

		}
	}

}

		
	
	


