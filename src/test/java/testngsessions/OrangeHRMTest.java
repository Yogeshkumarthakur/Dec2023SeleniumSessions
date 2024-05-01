package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	// @BeforeTest will just open browser once and execute all ur test cases then
	// close browser: consume less time, good for sanity
	// @BeforeMethod will open and close browser with every TC: it is more time
	// consuming but give better execution percentage good for regression

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM", "title is not matched");

	}

	@Test(priority=2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("30-day-free-trial/"));
	}

}
