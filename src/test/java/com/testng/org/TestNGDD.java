package com.testng.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestNGDD {
	
	public static Object[][] getData() throws Throwable {
		File f=new File("C:\\Users\\Ansari\\Desktop\\td.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		String name=null;
		Object[][] obj=new Object[s.getPhysicalNumberOfRows()][r.getPhysicalNumberOfCells()];
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		     Cell c = row.getCell(j);
		     int k = c.getCellType();
		     if (k==1) {
		    	 name=c.getStringCellValue();
		    	 System.out.println(name);
		     }else if (k==0) {
		    	 double d = c.getNumericCellValue();
				long l=(long)d;
				name=String.valueOf(l);
				System.out.println(name);
			}
		     obj[i][j]=name;
				
			}
				
			
		}
		
		return obj;
		
	}

}
