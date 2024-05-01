package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

	    //1	wd d = new CD();
	    //WebDriver driver = new ChromeDriver();
     	//valid -- recommended
		//run test in local machine
		
		//2. SC Driver = new CD();
		//valid -- not recommended   because only FE and FE's method i can access
		//SearchContext driver = new ChromeDriver();
	
		//3. RWD Driver = new CD();
		//valid -- recommended 
		//RemoteWebDriver driver = new ChromeDriver();
		
		//4. CD Driver = new CD();
		//valid -- not recommended coz not work with cross browser
		//ChromeDriver driver = new ChromeDriver();
	
		//5. WD Driver = new RWD();
		//valid -- recommended coz when u run test on remote /cloud/server machine or selenium grid we need this
		//WebDriver driver = new RemoteWebDriver(serverURL, capabilities);
		
		//6. CD driver= new ChromeDriver();
		//valid: not recommended but only work for chrome
		//ChromeDriver driver = new ChromeDriver();
	}

}
