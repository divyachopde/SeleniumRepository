package Session16Sep.pom;

import org.openqa.selenium.WebDriver;

public class Basepage implements IYahooPage {

	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
