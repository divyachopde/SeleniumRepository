package Session1Sept;

import org.testng.annotations.Test;

import Session1Sept_stages.Stage1;
import Session1Sept_stages.Stage2;
import Session1Sept_stages.Stage3;

public class DataProviderTest {

	@Test(dataProvider = "data", dataProviderClass = DataProviderClass.class)
	public void testValidaton(InvalidTest data) {

		System.out.println(data);

	}

	@Test
	public void formSubmit(Stage1 stage1Data, Stage2 stage2Data, Stage3 stage3Data) {

	}

}
