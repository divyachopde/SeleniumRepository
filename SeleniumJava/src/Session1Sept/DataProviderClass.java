package Session1Sept;

import org.testng.annotations.DataProvider;

import Session1Sept_stages.Stage1;
import Session1Sept_stages.Stage2;
import Session1Sept_stages.Stage3;

public class DataProviderClass {

	@DataProvider

	// static method has to be used
	public static Object[][] data() {

		InvalidTest data11 = new InvalidTest("name", "@abc", "name is inavalid");
		InvalidTest data22 = new InvalidTest("Phone", "123fg", "phone is inavlid");
		InvalidTest data33 = new InvalidTest("email", "divya.chopde.com", "email id inavid");

		Object data1[][] = { { data11 }, { data22 }, { data33 } };
		return data1;

	}

	@DataProvider

	public static Object[][] dataset() {
		String[][] stage1ExcelData = { { "divya", "naphade" }, { "xyz", "qaz" } };
		Stage1[] stage1data = new Stage1[stage1ExcelData.length];
		for (int i = 0; i < stage1ExcelData.length; i++) {
			stage1data[i] = new Stage1(stage1ExcelData[i][0], stage1ExcelData[i][1]);
		}

		String[][] stage2ExcelData = { { "75858", "acbg2@gmail.com" }, { "6286218", "hhfh@gmail.com" } };
		Stage2[] stage2data = new Stage2[stage2ExcelData.length];
		for (int i = 0; i < stage2ExcelData.length; i++) {

			stage2data[i] = new Stage2(stage2ExcelData[i][0], stage2ExcelData[i][1]);

		}
		String[][] stage3ExcelData = { { "address1;", "pin" }, { "address2", "pin" } };

		Stage3[] stage3data = new Stage3[stage3ExcelData.length];
		for (int i = 0; i < stage3ExcelData.length; i++) {

			stage3data[i] = new Stage3(stage3ExcelData[i][0], stage3ExcelData[i][1]);

		}

		Object[][] returnData = new Object[stage1ExcelData.length][3];

		for (int i = 0; i <= stage3data.length; i++) {

			returnData[i][0] = stage1data[i];
			returnData[i][1] = stage1data[i];
			returnData[i][2] = stage1data[i];
		}
		return returnData;

	}

}
