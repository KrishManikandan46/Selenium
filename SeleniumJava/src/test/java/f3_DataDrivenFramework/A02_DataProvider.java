package f3_DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class A02_DataProvider {

	@DataProvider(name = "loginData")
	public String[][] getDataFromExcel() throws IOException {
		File file = new File("./src/test/resources/TestLoginData.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();

		String testData[][] = new String[rows-1][cols];
		for (int i = 0; i < rows-1; i++) {
			for (int j = 0; j < cols; j++) {
				DataFormatter formatter = new DataFormatter();
				testData[i][j] = formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		workbook.close();
		fileInputStream.close();
		return testData;
	}
}
