package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//open browser
        driver.get("https://www.google.com");//
        String url =  driver.getCurrentUrl();
        System.out.println(url);
        //driver.close();// browser is closed not the server
        driver.quit();//close the last single browser 
    
      //  System.out.println(driver.getTitle());
        //in case if close we will get the same sid with below exception
        //NoSuchSessionException:
        //invalid session id  
        
        //in case of quite we will get below exception
        //NoSuchSessionException:
        //Session ID is null.
        
        driver = new ChromeDriver();//open browser and we get new session id 456
        driver.get("https://www.google.com");//456
        System.out.println(driver.getTitle());//456
	}}


