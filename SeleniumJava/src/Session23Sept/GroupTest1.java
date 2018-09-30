package Session23Sept;

import org.testng.annotations.Test;

public class GroupTest1 {

		
	@Test(groups = {"Sanity"})
	public void testCase1() {
		System.out.println("case1");
		
	}
	
	@Test(groups = {"Sanity", "Regresssion"})
	public void testCase2() {
		System.out.println("case2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("case3");
	}
	
	
}
