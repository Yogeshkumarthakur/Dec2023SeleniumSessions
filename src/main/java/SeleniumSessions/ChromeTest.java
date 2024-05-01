package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {

		
		//4.0.0 case study
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogeshth\\Documents\\My driver\\chromedriver.exe");// start server
//		WebDriver driver = new ChromeDriver();//open browser
		
		//4.0.0 --> manual download the .exe
		//chrome browser version (121) ---> chromedriver.exe (121.exe)--> vendor
				
		
		//Selenium Manager : SM 4.6.0 + No need to Systemsetproperty
		//chrome: 121 --> Machine 121 --> download 121 .exe file aut0matically -->under .cash folder
		//chrome: 122 --> Machine 122 --> download 122 .exe file automatically -->under .cash folder
		
		
		//4.6.0 case study
		WebDriver driver = new ChromeDriver();//open browser
		//SM --> checkin in local which browser version we are having then check the respective chrome driver exe file
		//if having it no need to download if not then no need to download
        driver.get("https://www.google.com");// enter url
        String url =  driver.getCurrentUrl();
        System.out.println(url);
        
        //Selenium Manager: it is the binary management component in selenium. it will take care of everything, no need to download anything
	}

}
