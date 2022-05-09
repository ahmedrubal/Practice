package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {
        int x = 40; 
	public static String[][]  getExcellData(String sheetName) throws FileNotFoundException {
		String[][] arrayExcellData = null;
		
		 FileInputStream fis = null;
		 XSSFWorkbook wb = null;
		 XSSFSheet sheet = null;
		 try {
		fis=new FileInputStream(System.getProperty("user.dir") +"/src/test/resources/Data/data.xlsx");
		
		wb= new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetName);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(cellCount);
		arrayExcellData = new String[rowCount][cellCount];
		for(int r =1; r<=rowCount;r++) {
			for(int c = 0;c<cellCount;c++) {
				arrayExcellData[r-1][c]=getCellData(sheet.getRow(r).getCell(c,MissingCellPolicy.CREATE_NULL_AS_BLANK));
			
			}
		}	
		return arrayExcellData;
	}
	
	public static String getCellData(XSSFCell cell) {
		
		String cellData = null;
		try {
		
		switch(cell.getCellType()){
		case NUMERIC:
			cellData=String.valueOf(cell.getNumericCellValue()).trim();
			break;
		case STRING:
			cellData =cell.getStringCellValue().trim();
			break;


		case BLANK:
			cellData = "";
		case BOOLEAN:
			cellData = String.valueOf(cell.getBooleanCellValue()).trim();
		default:
			cellData=cell.getStringCellValue().trim();
			break;
		}
		}catch(Exception e) {
			e.printStackTrace();
		
		}
		return cellData;
	
	}
	}
