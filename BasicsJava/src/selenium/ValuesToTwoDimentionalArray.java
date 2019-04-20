package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ValuesToTwoDimentionalArray {
	public static void main(String[] args) throws IOException {
		String dt_path = "C:\\Users\\SankarA\\Desktop\\Book1.xls";
		String[][] recData = readExcelSheet(dt_path, "Sheet1");
		for (int i = 0; i < recData.length; i++) {
			for (int j = 0; j < recData[0].length; j++) {
				System.out.print(recData[i][j] +" ");
			}
			System.out.println();
		}
	}

	public static String[][] readExcelSheet(String dataTablepath, String sheetName) throws IOException {

		// Step 1:get the xl path
		File xlFile = new File(dataTablepath);
		// Step 2:Access the xl file
		FileInputStream xlDoc = new FileInputStream(xlFile);
		// Step 3:Access the workBook
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		// Step 4:Access the Sheet
		HSSFSheet sheet = wb.getSheet(sheetName);
		
		int iRowCount = sheet.getLastRowNum() + 1;
		int iColCount = sheet.getRow(0).getLastCellNum();
		String[][] xldata = new String[iRowCount][iColCount];
		for (int i = 0; i < iRowCount; i++) {
			for (int j = 0; j < iColCount; j++) {
				xldata[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();

			}

		}
		
		
	
		return xldata;

	}
}
