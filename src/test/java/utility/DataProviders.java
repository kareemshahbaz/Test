package utility;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="getDataSuite1")
	public static Object[][] getDataSuite1(Method m)
	{
		System.out.println(m.getName());
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		String testcase = m.getName();
		
		return CommonUtils.getData(testcase, excel);
				
	}
	
	@DataProvider(name="getDataSuite2")
	public static Object[][] getDataSuite2(Method m)
	{
		System.out.println(m.getName());
		ExcelReader excel = new ExcelReader(Constants.SUITE2_XL_PATH);
		String testcase = m.getName();		
		return CommonUtils.getData(testcase, excel);
				
	}
	

}
