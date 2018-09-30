package Session9Sept;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sendkeys {

	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");// to initiate chrome
		d = new ChromeDriver();

		d.get("https://login.yahoo.com/account/create?pd=c&specId=yidReg");
		d.manage().window().maximize();
	}
	
	@Test
	public void SignUp() {
		
		WebElement fname=d.findElement(By.xpath("//input[@id='usernamereg-firstName']"));
		
		
		String placeholder = fname.getAttribute("placeholder");
		char normalSpaceChar = " ".charAt(0);
		char htmlSpace = placeholder.charAt(5);	
		/*int spaceValue = placeholder.charAt(5);
		int normalSpace  = " ".charAt(0);*/
		placeholder = placeholder.replaceAll(String.valueOf(htmlSpace),String.valueOf(normalSpaceChar));	
		
		
		Assert.assertEquals(placeholder, "First name");
		fname.sendKeys("Divya");
		fname.sendKeys(Keys.ENTER);//to enter on screen
		
		WebElement lname=d.findElement(By.xpath("//input[@id='usernamereg-lastName']"));
		lname.sendKeys("Chopde");
		WebElement fname1=d.findElement(By.xpath("//input[@id='usernamereg-firstName']"));
		String actualValue=fname1.getAttribute("value");
		Assert.assertEquals(actualValue, "Divya");
		
		//d.findElement(By.xpath("//input[@id='usernamereg-firstName']")).clear();
		
		
		
		
		
		
		
		
		
	}
	
}
