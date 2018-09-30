package Session2Sept_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertPrac {
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");// to initiate chrome
		d = new ChromeDriver();

		d.get("https://www.tutorialspoint.com/javascript/javascript_dialog_boxes.htm");
		d.manage().window().maximize();
	}

//	@Test
//	void testAlert1() {
//
//		WebElement iframe = d.findElement(By.xpath("//h2[text()='Confirmation Dialog Box']/preceding-sibling::iframe"));
//		d.switchTo().frame(iframe);
//		WebElement clickbutton = d.findElement(By.xpath("//input[contains(@onclick,'Warn')]"));
//		clickbutton.click();
//		String text1=d.switchTo().alert().getText();
//		Assert.assertEquals(text1, "This is a warning message!");
//		d.switchTo().alert().accept();
//
//	}

/*	@Test
	void testAlert2() {
		WebElement iframe1 = d.findElement(By.xpath("//h2[text()='Prompt Dialog Box']/preceding-sibling::iframe[1]"));
		d.switchTo().frame(iframe1);
		WebElement clickbtt = d.findElement(By.xpath("//input[@value='Click Me' and @onclick='getConfirmation();']"));
		clickbtt.click();
		String text2=d.switchTo().alert().getText();
		Assert.assertEquals(text2, "Do you want to continue ?");
		d.switchTo().alert().dismiss();
		clickbtt.click();
		d.switchTo().alert().accept();
		WebDriverWait wait = new WebDriverWait(d,5);
		wait.until(ExpectedConditions.invisibilityOf(clickbtt));
		

	}*/

	@Test
	void testAlert3() {
		WebElement iframe2 = d.findElement(By.xpath("//h2[text()='Prompt Dialog Box']/following-sibling::iframe"));
		d.switchTo().frame(iframe2);
		WebElement clickbttn = d.findElement(By.xpath("//input[@value='Click Me' and @onclick='getValue();']"));
		clickbttn.click();
		WebDriverWait wait = new WebDriverWait(d,5);
		wait.until(ExpectedConditions.alertIsPresent());
		//d.switchTo().alert().sendKeys("htfjy");
		d.switchTo().alert().accept();
		
	}
	
	@AfterClass
	
	public void quit1() {
		
		  d.quit();
	}
	
	
}
