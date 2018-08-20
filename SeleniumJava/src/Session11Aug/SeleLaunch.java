package Session11Aug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");//
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//d.quit();
		d.get("https://www.seleniumhq.org");
		String title = d.getTitle();
		if(!title.equals("Selenium - Web Browser Automation")) {
			throw (new Error());
		}
		
		WebElement download = d.findElement(By.cssSelector("#menu_download>a"));
		download.click();
		//WebElement previous_releases = d.findElement(By.linkText("previous releases"));
		//previous_releases.click();		
		
		
		
	WebElement Search =d.findElement(By.xpath("//*[@id='q']"));
	
	Search.sendKeys("Selenium");
	WebElement GoButton=d.findElement(By.xpath("//*[@id=\'submit\']"));
	
	GoButton.click();
	
	List<WebElement> links = d.findElements(By.xpath("//div[@class=\"gs-title\"]"));
	
	/*for(int i=0; i<links.size(); i++) {
		links.get(i).getText();
	}
	*/
	for (WebElement link: links) {
		if(!link.getText().contains("Selenium")) {
			throw (new Error());
		}
	}
	System.out.println("All contains selenium");
	
	/*links.forEach(link->{
		if(!link.getText().contains("Selenium")) {
			throw (new Error());
		}
	});*/
	
	
		//d.quit();
	}
}	