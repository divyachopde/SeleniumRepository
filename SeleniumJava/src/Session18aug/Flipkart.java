package Session18aug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart {
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		d = new ChromeDriver();

		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		String actual_title = d.getTitle();
		System.out.println(actual_title);
		String expected_title = "Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
		Assert.assertEquals(actual_title, expected_title);

		// close login
		WebElement login = d.findElement(By.xpath("// *[@class='_2AkmmA _29YdH8']"));
		login.click();

		WebElement mobile = d.findElement(By.xpath("// span[text()='Electronics']"));
		mobile.click();

		WebDriverWait wait = new WebDriverWait(d, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Motorola']")));

		WebElement moto = d.findElement(By.xpath("//*[@title='Motorola']"));
		moto.click();

		// WebDriverWait wait1 = new WebDriverWait(d, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("// *[@class='_2cLu-l']")));

	}

	@Test
	void toTestAllAreMotoMobiles() {
		// check if Moto appears
		List<WebElement> links = d.findElements(By.xpath("// *[@class='_2cLu-l']"));
		for (WebElement link : links) {
			String actual = link.getText().split(" ")[0];
			Assert.assertEquals(actual, "Moto");
			// if (!link.getText().contains("Moto")) {
			// throw (new AssertionError(""));
			// }
		}
	}

	@Test
	void toTestUnder10KMobiles() {
		List<WebElement> links = d.findElements(By.xpath(
				"//h2[contains(text(),'under ₹10K')]/ancestor::div[@class='_1GRhLX _3NTa49 required-tracking']//div[@class='_1uv9Cb']"));
		for (WebElement link : links) {
			String actual = link.getText().split("")[1];
			// System.out.println("actual is " +actual);
			String firstSplit = actual.split(",")[0];
			// System.out.println("first split "+firstSplit);
			String secondSplit = actual.split(",")[1];
			// System.out.println("second split "+secondSplit);

			String actualPrice = firstSplit + secondSplit;
			System.out.println("Actual price " + actualPrice);

			int actualPrice1 = parseInt(actualPrice);

			if (actualPrice1 > 10000) {
				throw new AssertionError("actualPrice is greater than 10000 " + actualPrice1);
			}
		}

	}

	@Test
	public void testDropdown() {

		WebElement viewAll = d.findElement(By.xpath("//h2[contains(text(),'under ₹10K')]/following-sibling::div/a"));
		viewAll.click();
		Select ddlist = new Select(d.findElement(By.xpath("//select[@class='fPjUPw']")));
		ddlist.selectByValue("20000");
		List<WebElement> links = d.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		for (WebElement link : links) {
			String price = link.getText().substring(1);
			String priceFinal = price.replace(',', ' ');

			int priceFinal1 = parseInt(priceFinal);
			if (priceFinal1 > 20000) {

				throw new AssertionError("Price not under 20000" + priceFinal1);
			}

		}
	}

	private int parseInt(String actualPrice) {

		return Integer.parseInt(actualPrice);
	}
}
