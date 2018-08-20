package Session18aug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart {

	@Test
	void TestMoto() {

		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://www.flipkart.com");

		WebElement xbutton = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));

		xbutton.click();

		WebElement Electroncs = d.findElement(By.xpath("//span[text()='Electronics']"));

		Electroncs.click();

		WebDriverWait wait = new WebDriverWait(d, 5);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@title='Motorola']")));

		WebElement Moto = d.findElement(By.xpath("//a[@title='Motorola']"));

		Moto.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='_2cLu-l']")));

		List<WebElement> links = d.findElements(By.xpath("//a[@class='_2cLu-l']"));

		for (WebElement link : links) {

			String actual = link.getText().split("")[0];

			Assert.assertEquals(actual, "Moto");
		}
		
		
		WebElement price = d.findElement()

	}

}
