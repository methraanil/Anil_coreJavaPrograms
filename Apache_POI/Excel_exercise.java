package pkg.Apache_POI;

import java.io.File;

public class Excel_exercise {

	public static void main(String[] args) {
		
		File file=new File("C:\\\\\\\\Users\\\\\\\\sunil_Anil\\\\\\\\Desktop\\\\\\\\Attra-CoreJavaTraining");
		XSSFWorkBook wkbook;
		XSSFWorkSheet sheet;
		Row row;
		Cell cell;
		
		for(int i=0;i<=9;i++) {
			row=sheet.createRow(i);
			for(int j=0;j<=9;j++){
				cell=cell.row.createCell(j);
				cell.setCellValue((i+1)*(j+1));
			}

	}
		try {
			FileOutputStream excel = new FileOutputStream(file);
			wkbook.write(excel);
			excel.close();
			wkbook.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

}
}
