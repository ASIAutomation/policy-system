package Automation.PS.excelReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {
	
	public FileOutputStream fileout = null;
	public String path;
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	public Excel_Reader(String path) {
		this.path=path;
		try	{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
		}
		catch(Exception e)	{
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public String[][] GetDataFromSheet(String SheetName, String ExcelName){
		String datasets[][] = null;
		try	{
			//Get sheet from excel workbook
			XSSFSheet sheet = workbook.getSheet(SheetName);			
			//Count number of active rows
			int totalrow = sheet.getLastRowNum() + 1;			
			//Count number of active columns in row
			int totalcolumns = sheet.getRow(0).getLastCellNum();			
			//Create array of rows and columns
			datasets = new String[totalrow-1][totalcolumns];			
			//Run for loop and store data in 2D array
			//This for loop will run on rows
			for(int i = 1; i < totalrow; i++) {
				XSSFRow rows = sheet.getRow(i);
				//This for loop will run on columns of that row
				for(int j = 0; j < totalcolumns; j++) {
					//Get cell method will get cell
					XSSFCell cell = rows.getCell(j);
					if(cell.getCellType() == Cell.CELL_TYPE_STRING) {
						datasets[i-1][j] = cell.getStringCellValue();						
					}
					else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						//String celltext = String.valueOf(cell.getNumericCellValue());
						String celltext = NumberToTextConverter.toText(cell.getNumericCellValue());
						datasets[i-1][j] = celltext;
					}
					else if(cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
						switch(cell.getCachedFormulaResultType()) {
							case Cell.CELL_TYPE_NUMERIC:	String celltext = NumberToTextConverter.toText(cell.getNumericCellValue());
															datasets[i-1][j] = celltext;
				                							break;
				                							
				            case Cell.CELL_TYPE_STRING:		datasets[i-1][j] = cell.getRichStringCellValue().toString();			                
				                							break;
						}
					}
					else {
						datasets[i-1][j] = String.valueOf(cell.getBooleanCellValue());
					}
				}
			}
			return datasets;
		}
		catch(Exception e)	{
			System.out.println("Exception in reading Excel file " + e.getMessage());
			e.printStackTrace();			
		}
		return datasets;
	}
	
	@SuppressWarnings("deprecation")
	public String GetCellData(String SheetName, String ColName, int RowNum)	{
		try {
			int col_num = 0;
			int index = workbook.getSheetIndex(SheetName);
			sheet = workbook.getSheetAt(index);
			XSSFRow row = sheet.getRow(0);
			for(int i = 0; i < row.getLastCellNum(); i++)	{
				if(row.getCell(i).getStringCellValue().equals(ColName))	{
					col_num = i;
					break;
				}
			}
			row = sheet.getRow(RowNum - 1);			
			XSSFCell cell = row.getCell(col_num);
			if(cell.getCellType() == Cell.CELL_TYPE_STRING)	{
				return cell.getStringCellValue();
			}
			else if(cell.getCellType() == Cell.CELL_TYPE_BLANK)	{
				return "";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
