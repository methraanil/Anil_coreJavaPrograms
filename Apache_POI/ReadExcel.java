package pkg.Apache_POI;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel {

	public static void main(String[] args) {
		File file=new File("C:\\\\Users\\\\sunil_Anil\\\\Desktop\\\\Attra-CoreJavaTraining");
		XSSFWorkbook workbook;
		XSSFWorksheet sheet;
		Object[][] arr=new Object[0][0];
		
		
		try {
			FileInputStream excel=new FileInputStream(file);
			workbook=new XSSFWorkbook(excel);
			sheet=workbook.getSheet("Sheet1");
			int start=sheet.getFirstRowNum();
			int end=sheet.getLastRowNum();
			for(int i=start;i<=end;i++) {
				System.out.print(sheet.getRow(i).getCell(0).getStringCellValue()+"\t");
				System.out.println(sheet.getRow(i).getCell(1).getCellValue()+"\t");
				System.out.println(sheet.getRow(i).getCell(2).getCellValue()+"\t");
				System.out.println(sheet.getRow(i).getCell(3).getCellValue());
				arr[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
				arr[i][1] = sheet.getRow(i).getCell(1).getNumericCellValue();
				arr[i][2] = sheet.getRow(i).getCell(2).getBooleanCellValue();
				arr[i][3] = sheet.getRow(i).getCell(3).getStringCellValue();
			}
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(arr);
		
		
			}

}
