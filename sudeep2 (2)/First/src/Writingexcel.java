import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Writingexcel {
	
	public static void write(String result) throws InvalidFormatException, IOException{
		
			FileInputStream fis= new FileInputStream("C:\\Users\\sudeepkumar\\workspace\\First\\src\\Sudeep.xlsx.xlsx");
	
	org.apache.poi.ss.usermodel.Workbook wb= WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sh= wb.getSheet("Sheet2");
	System.out.println("yes");
	org.apache.poi.ss.usermodel.Row row= sh.getRow(1);
	System.out.println("no");
	Cell cel= row.createCell(0);
	System.out.println("kya");
	cel.setCellType(cel.CELL_TYPE_STRING);
	cel.setCellValue(result);
	FileOutputStream fos=new FileOutputStream("C:\\Users\\sudeepkumar\\workspace\\First\\src\\Sudeep.xlsx.xlsx");
wb.write(fos);
fos.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	}

}
