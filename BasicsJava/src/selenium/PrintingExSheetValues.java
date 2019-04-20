package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class PrintingExSheetValues {
	public static void main(String[] args) throws IOException {

		String dt_path = "C:\\Users\\SankarA\\Desktop\\Book1.xls";
		// Step 1:get the xl path
		File xlFile = new File(dt_path);
		// Step 2:Access the xl file
		FileInputStream xlDoc = new FileInputStream(xlFile);
		// Step 3:Access the workBook
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		// Step 4:Access the Sheet
		HSSFSheet sheet = wb.getSheet("Sheet1");
		String val;
		int iRowCount=sheet.getLastRowNum()+1;
		int iColCount=sheet.getRow(0).getLastCellNum();
for(int i=0;i<iRowCount;i++){
	for(int j=0;j<iColCount;j++){
		 val = sheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(val+" ");	
	}
	System.out.println();
}
		
		
}
}
