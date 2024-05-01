package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class StringUtils {
	
	private StringUtils() {}
	
	public static String getRandomEmail() {
		return "automation"+System.currentTimeMillis()+"@"+"opencart.com";
		//return "automation" + UUID.randomUUID()+"openkart.com";
		
		//999-9888-89898-
		
		//automation12121212@opencart.com
		//automation12121e3212@opencart.com
		//automation12121cc212@opencart.com
		//automation121244r1212@opencart.com
		//automation1212211111212@opencart.com
		//testautomat
	
		//delete from user where email like '%automation%';
				
	}
	
}
