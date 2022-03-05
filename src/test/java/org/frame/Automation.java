package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Automation {
	
	

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vigneshwaran v.k\\eclipse-workspace\\FrameWork1\\Excel Sheets\\TestData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = row.getCell(j);
				CellType type = c.getCellType();
			    switch (type) {
				case STRING:
					String data = c.getStringCellValue();
					System.out.println(data);
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
						String dateInfo = dateformat.format(date);
						System.out.println(dateInfo);
					}else {
						double d = c.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String s = b.toString();
						System.out.println(s);
					}

				default:
					break;
				}
				
			}
			
		}
	}

}
