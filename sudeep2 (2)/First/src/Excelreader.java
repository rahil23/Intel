import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("C:\\Users\\sudeepkumar\\workspace\\First\\src\\Sudeep.xlsx.xlsx");
XSSFWorkbook wb= new XSSFWorkbook(fis);
XSSFSheet sh= wb.getSheet("Sheet1");
for(int i=0;i<= sh.getLastRowNum(); i++){
	XSSFRow row= sh.getRow(i);
	
	for(int j=0; j<row.getLastCellNum(); j++){
		System.out.print(row.getCell(j).getStringCellValue());
	}
	System.out.println();
}

	}

}
