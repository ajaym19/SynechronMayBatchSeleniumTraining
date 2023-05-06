package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basics.ExcelReader;

public class DataProviderDemo {

	@Test(dataProvider = "getData")
	public void login(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		System.out.println();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[1][0] = "hr";
		data[1][1] = "hr123";
		data[2][0] = "finance";
		data[2][1] = "finance123";
		return data;
	}
	
	@Test(dataProvider = "GetUserData")
	public void validateLoginDataUsingExcel(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		System.out.println();	
	}
	
	
	@DataProvider(name = "GetUserData")
	public Object[][] getLoginDataFromExcel() {
		String filePath = "./TestData1.xlsx";
		String sheetName = "data";
		ExcelReader reader = new ExcelReader(filePath, sheetName);
		return reader.getData();
	}
	
	
}
