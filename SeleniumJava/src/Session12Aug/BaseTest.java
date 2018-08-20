package Session12Aug;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("befor suite");
		
	}
	@BeforeMethod
	void beforeMethod() {
		System.out.println("befor mthod");
		
	}
	@AfterSuite
	void afterSuite() {
		System.out.println("after suite");
	}
	@AfterMethod
	void afterMethod() {
		System.out.println("after method");
	}
	@BeforeTest
	void beforetest() {
		System.out.println("before test");
	}

}
