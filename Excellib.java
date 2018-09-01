package Campus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellib 
{
	String path="G:\\Program\\Selenium new class\\Testdata\\Campus.xlsx";
	String sheet="Sheet1";
	Workbook wb ;
	public String getdata(int rownum, int cellnum) throws Throwable
	{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheet);
	Row row=sh.getRow(rownum);
	String data=row.getCell(cellnum).getStringCellValue();
	//String data=row.getCell(cellnum).getNumericCellValue();
	//int data=row.getCell(cellnum).CELL_TYPE_NUMERIC
	return data;
	
	}
	public int getlastrow()
	{
		int row =wb.getSheet(sheet).getLastRowNum();
		row=row+1;
		return row;
	}
}
