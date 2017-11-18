import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readexcel {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  FileInputStream fis= new FileInputStream("C:\\Users\\sudeepkumar\\workspace\\Kaya\\src\\Sudeep.xlsx.xlsx");
  
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  XSSFSheet sh= wb.getSheet("Sheet1");
	  Iterator<org.apache.poi.ss.usermodel.Row> it= sh.iterator();
	  it.next();
	  while(it.hasNext()){
		  System.out.println(it.next().getCell(1).getStringCellValue());
		  
	  }
  }
	}


