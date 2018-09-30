package Session16Sep.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Session16Sep.error.PageNotFound;

public class YahooSignupPage extends Basepage {

	@FindBy(xpath = "//input[@id='usernamereg-firstName']")

	WebElement firstname;
	@FindBy(xpath = "//input[@id='usernamereg-lastName']")
	WebElement surname;
	@FindBy(id = "reg-submit-button")
	WebElement contBtn;

	@FindBy(id = "reg-error-password")
	WebElement passwordError;
	
	@FindBy(xpath = "//div[@class='margin8 yid-field']")
	WebElement email;

	@FindBy(xpath = "password-field  error ")
	WebElement password;
	
	public YahooSignupPage enterfirstName(String fname) {
		firstname.sendKeys(fname);
		return this;
	}

	public YahooSignupPage enterSurname(String lname) {
		surname.sendKeys(lname);
		return this;

	}

	public String getPasswordError() {
		return passwordError.getText();
	}

	public IYahooPage clckCont() {
		contBtn.click();
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("account/create?")) {
			return PageFactory.initElements(driver, YahooSignupPage.class);
		} else if (currentUrl.contains("/challenge/phone-verify?")) {
			return PageFactory.initElements(driver, ConfirmationPage.class);
		} else {
			throw new PageNotFound();
		}

	}

}
