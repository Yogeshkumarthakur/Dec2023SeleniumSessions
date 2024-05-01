package SeleniumSessions;

public class CustomXpath {

	public static void main(String[] args) {
		// Xpath: is the address of the webelement
		// XMLPath: is also called XML path thats why short form is Xpath
		//1. absolute xpath:  Not recommended it may break, very risky
		// /html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/h4/a
		
		//2. relative xpath/custom xpath:
		
		//1. Using single attr:
		//tagname[@attrname = 'value']
		//input[@id= 'input-email']
		//input[@name='email']
		
		//input[@name] -- 5
		//input[@value='Login'] -- 1

		//1. Using multiple attr:
		//we can use 'or' as well 'and' aswell but 'and' will give u unique values. so prefer usin 'and'
		//tagname[@attr1='value' and @attr2='value']  
		  //input[@type='submit' and @value='Login'] -- 1  //prefer this one because it is filter till we got 1/1
		 //input[@type='submit'] -- 3
		 		
		//input[@type='text' or @type='email']
		
		//below we are just using 1 attr without any value and other attr with value. this is also possible.
		//input[@typeand @value='Login']
		
		//without using any value
		//input[@type and @value]  // it gives 1/6 but this is also right xpath we cant say this is wrong xpath
		
		//give me total links available on the page which is having href properties. there could be some link which not having href
		//a[@href]  --- 81 links are available on this page  "https://naveenautomationlabs.com/opencart/index.php?route=account/login"
		//Note: attribute and properties both are same thing
		
		//3. text(): it is a funtion not the att so we cant use like @text  it should be like text()='value'
		//tagname[text()='value]
		//h2[text()='New Customer']
		//a[text()='Desktops']  -- 1
		
		//4. text() and attr we can use together
		//tagname[@attr='value' and text()='value']
		//a[@data-toggle='dropdown' and text()='Desktops'] -- 1
		
		//we can use multiple attr as well like below and in anysequnce text first or att first doen't matter
		//a[@data-toggle='dropdown' and text()='Desktops' and @class='dropdown-toggle']  -- 1
		
		//5. contains() with attr:    here with contain no need to supply full values just half will work like below:
		
		//tagname[contains(@attrName,'value')]
		//input[contains(@placeholder,'E-Mail')]  -- 1
		//input[contains(@placeholder,'Address')] -- 1
		
		
		
	}

}
