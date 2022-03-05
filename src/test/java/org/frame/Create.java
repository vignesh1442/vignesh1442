package org.frame;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create {
	public static void main(String[] args) throws IOException {
		File File = new File("C:\\Users\\vigneshwaran v.k\\eclipse-workspace\\FrameWork1\\Excel Sheets\\Automation.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("test1");
		//Row row = sheet.createRow(0);
		//Cell cell = row.createCell(1);
		//cell.setCellValue("hi");
		FileOutputStream out = new FileOutputStream(File);
		workbook.write(out);
		}
	}


