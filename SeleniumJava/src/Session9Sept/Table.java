package Session9Sept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Table {
	
	ChromeDriver d;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");// to initiate chrome
		d = new ChromeDriver();

		d.get("http://toolsqa.com/automation-practice-table/");
		d.manage().window().maximize();
	}
	
	@Test
	public void checkTable() {

	List<WebElement> tablerows = d.findElements(By.xpath("//tbody/tr"));
	tablerows.forEach(abc -> {
	String header = abc.findElement(By.tagName("th")).getText();
	System.out.print(header);
	List<WebElement> cols = abc.findElements(By.tagName("td"));
	cols.forEach(col -> {
	System.out.print(col.getText());
	});
	System.out.println();

	});
	}

	@Test
	public void clickdetails() {

	String key = "Burj Khalifa";
	List<WebElement> tablerows = d.findElements(By.xpath("//tbody/tr"));
	tablerows.forEach(abc -> {
	String header = abc.findElement(By.tagName("th")).getText();
	System.out.print(header);
	if (header.equals(key)) {
	List<WebElement> cols = abc.findElements(By.tagName("td"));
	String rank = cols.get(4).getText();
	Assert.assertEquals(rank, "1");
	}
	});
	}
		
		
	@Test
	public void Details() {
		
		String key="Burj Khalifa";
		String rankxpath= "//th[text()='"+ key+ "']/following-sibling::td[5]";
		WebElement rankKey= d.findElement(By.xpath(rankxpath));
		String reqRank=rankKey.getText();
		Assert.assertEquals(reqRank, "1");
		
		
		
		
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


