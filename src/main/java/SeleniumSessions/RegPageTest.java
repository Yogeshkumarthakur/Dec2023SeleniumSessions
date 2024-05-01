package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String regtitle = brUtil.getPageTitle();
		System.out.println(regtitle);

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By passwordconfirm = By.id("input-confirm");

		By isSubscribeYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By isSubscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By policyChkBox = By.name("agree");
		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		By successMessage = By.tagName("h1");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "Balli");
		eleUtil.doSendKeys(lastName, "Thakur");
		eleUtil.doSendKeys(email, StringUtils.getRandomEmail());
		eleUtil.doSendKeys(telephone, "9898989898");
		eleUtil.doSendKeys(password, "test@123");
		eleUtil.doSendKeys(passwordconfirm, "test@123");
		eleUtil.doClick(isSubscribeYes);
		eleUtil.doClick(policyChkBox);
		eleUtil.doClick(continueBtn);
		String actSuccMessg = eleUtil.doGetElementText(successMessage);
		System.out.println(actSuccMessg);
		if (actSuccMessg.equals("Your Account Has Been Created!")) {
			System.out.println("User Reg -- PASSED");
		} else {
			System.out.println("User Reg -- FAILED");
		}

	}

}
