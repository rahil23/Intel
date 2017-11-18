import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_Reader {
	
	public String Excel() throws InvalidFormatException, IOException{
		FileInputStream fis= new FileInputStream("C:\\Users\\sudeepkumar\\workspace\\First\\src\\Sudeep.xlsx.xlsx");
		org.apache.poi.ss.usermodel.Workbook wb= WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh= wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		//System.out.println(sh.getFirstRowNum());
		
		for(int ro=0;ro<=sh.getLastRowNum();ro++){
			for(int col=0;col<=sh.getRow(0).getPhysicalNumberOfCells(); col++){
				System.out.println(sh.getRow(ro));
			}
	//	}
		org.apache.poi.ss.usermodel.Row row= sh.getRow(2);
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		Cell cel= row.getCell(0);
		String celvalue= cel.getStringCellValue();
		//System.out.println(celvalue);
	//	Cell cel= row.getCell(1);
	return celvalue;
		
	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
Excel_Reader ex= new Excel_Reader();
String babu= ex.Excel();
System.out.println(babu);


	}

}
