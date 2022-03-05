package org.frame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2 {
	public static void main(String[] args) throws IOException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		WebElement dDnskills = d.findElement(By.id("Skills"));
		Select select = new Select(dDnskills);
		List<WebElement> options = select.getOptions();
		File File = new File("C:\\Users\\vigneshwaran v.k\\eclipse-workspace\\FrameWork1\\Excel Sheets\\Automation.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("test1");
		for (int i = 0; i < options.size(); i++) {
		String text = options.get(i).getText();
		Row row = sheet.createRow(i);
		Cell r = row.createCell(0);
		r.setCellValue(text);
		FileOutputStream out = new FileOutputStream(File);
		workbook.write(out);
		}
			
		
		}
		
				
		
	}


