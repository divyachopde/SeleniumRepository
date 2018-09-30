package Session16Sep.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Session16Sep.pom.Basepage;
import Session16Sep.pom.YahooSignupPage;

public class SignUpTests {

	WebDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");// to initiate chrome
		d = new ChromeDriver();

		d.get("https://login.yahoo.com/account/create?pd=c&specId=yidReg");
		d.manage().window().maximize();
	}

	@Test
	public void testPasswordError() {
		YahooSignupPage yahooSignupPage = PageFactory.initElements(d, YahooSignupPage.class);
		yahooSignupPage.setDriver(d);
		// yahooSignupPage.enterfirstName("Divya");
		// yahooSignupPage.enterSurname("Chopde");
		// yahooSignupPage.clckCont();
		
		yahooSignupPage = (YahooSignupPage) yahooSignupPage.enterfirstName("Divya").enterSurname("Chopde").clckCont();
		Assert.assertEquals(yahooSignupPage.getPasswordError(), "This is required.rt");

	}

}
