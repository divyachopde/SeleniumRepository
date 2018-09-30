package Session23Sept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
	public void testPasswordError() throws IOException {
		YahooSignupPage yahooSignupPage = PageFactory.initElements(d, YahooSignupPage.class);
		yahooSignupPage.setDriver(d);
		// yahooSignupPage.enterfirstName("Divya");
		// yahooSignupPage.enterSurname("Chopde");
		// yahooSignupPage.clckCont();
		/*
		 * File file = new File("Resources/testdata.csv");//relative path BufferedReader
		 * br = new BufferedReader(new FileReader(file.getAbsolutePath())); String
		 * firstline = br.readLine(); String[] parts = firstline.split(",");
		 */
		yahooSignupPage = (YahooSignupPage) yahooSignupPage.enterfirstName(DataFromFile.readFile("testdata.csv", 1, 1))
				.enterSurname(DataFromFile.readFile("testdata.csv", 1, 2)).clckCont();
		Assert.assertEquals(yahooSignupPage.getPasswordError(), "This is required");

	}

}
