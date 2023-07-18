package f3_DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class J02_DataProvider {

	@DataProvider(name = "loginData")
	public String[][] getDataFromExcel() throws BiffException, IOException {
		FileInputStream fileInputStream = new FileInputStream("./src/test/resources/TestDataLogin.xls");
		Workbook workbook = Workbook.getWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int cols = sheet.getColumns();

		String testData[][] = new String[rows-1][cols];	
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				testData[i-1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}
}
