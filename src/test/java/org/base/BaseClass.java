package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.management.AttributeValueExp;
import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;

	// get url

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	// loadurl

	public void loadurl(String url) {
		driver.get(url);

	}

	public void type(WebElement element, String text) {
		element.sendKeys(text);

	}

	public void click(WebElement element) {
		element.click();

	}

	public WebElement findLocatorByID(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;

	}

	public WebElement findLocatorByName(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}

	public WebElement findLocatorByClassName(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;

	}

	public WebElement findLocatorByxpat(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	public String getAttributeValue(WebElement element) {
		String string = element.getAttribute("value");
		return string;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectOptionByAttributevalue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void typeJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0],setAttribute('value','" + text + ")", element);

	}

	// Navigate

	public void navigate(String url) {
		driver.navigate().to(url);
	}

	// forward

	public void forward() {
		driver.navigate().forward();
	}

	// back

	public void back() {
		driver.navigate().back();
	}

	// refresh

	public void refresh() {
		driver.navigate().refresh();
	}

	// maximize

	public void maximize() {
		driver.manage().window().maximize();
	}

	// fullscreen

	public void fullscreen() {
		driver.manage().window().fullscreen();
	}

	// mouseOverAction

	public void mouseOverAction(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	// mouseOverAction-click

	public void mouseOverActionClick(WebElement element) {
		element.click();
	}
	// dragAndDrop

	public void dragAndDrop(WebElement element, WebElement element2) {

		Actions action = new Actions(driver);
		action.dragAndDrop(element, element2).perform();
	}

	// doubleClick
	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	// rightClick

	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	// keyup

	public void keyup(String string) {
		Actions action = new Actions(driver);
		action.keyUp(string);

	}

	// Clickok
	public void clickOk() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// Clickdismiss
	public void clickdismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	// promptAlert

	public void promptAlert(String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);
		al.accept();
	}
	// screenshot

	public void screenshot(String path) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File s = screenshot.getScreenshotAs(OutputType.FILE);

		File d = new File(path);

		FileUtils.copyFile(s, d);
	}

	// jsClick

	public void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	// scrollUP

	public void scrollUP(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].ScrollIntoView(false)", element);
	}

	// GetAlloptionDropDown

	public List getAllOption(WebElement element) {

		Select select = new Select(element);

		List<WebElement> options = select.getOptions();
		return options;

	}

	// getAllSelectedOption

	public List getAllSelectedOption(WebElement element) {

		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;

	}
	// GetfirstselectedoptionDropDown

	public WebElement getFirstSelectedOption(WebElement element) {

		Select select = new Select(element);

		WebElement option = select.getFirstSelectedOption();
		return option;

	}

	// isMultiple

	public void isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();

	}

	// deSelectByIndex
	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);

	}

	// deSelectByValue
	public void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);

	}

	// deSelectByVisibleText
	public void deSelectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByVisibleText(value);

	}

	// deSelectByAll
	public void deSelectByAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();

	}

	// FrameIndex

	public void frameIndex(int index) {
		driver.switchTo().frame(index);
	}

	// frameElement
	public void frameElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// frameId

	public void frameId(String value) {
		driver.switchTo().frame(value);

	}

	// returnFrame
	public void returnFrame() {
		driver.switchTo().defaultContent();
	}

	// parentFrame

	public void parentFrame() {
		driver.switchTo().parentFrame();

	}

	// getWindowHanlde
	public String WindowHanlde() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	// getWindowHanldes
	public Set<String> WindowHanldes() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}

	// implicitWait
	public void implicitWait(long num) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
	}

	// webDriverWait

	public void webDriverWait(int timeOutInSeconds) {
		WebDriverWait driverWait = new WebDriverWait(driver, timeOutInSeconds);
	}

	// excelSheet
	public String getdata(String SheetName, int rownum, int cellnum) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\vigneshwaran v.k\\eclipse-workspace\\FrameWork1\\Excel Sheets\\TestData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
				res = dateformat.format(dateformat);
			} else {
				double d = cell.getNumericCellValue();
				BigDecimal num = BigDecimal.valueOf(d);
				res = num.toString();
			}
		default:
			break;
		}
		return res;

	}

	public void UpdateData(String sheetname, int rownum, int cellnum, String olddata, String newdata)throws IOException {
		String res = null;
		File file = new File("C:\\Users\\vigneshwaran v.k\\eclipse-workspace\\FrameWork1\\Excel Sheets\\TestData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new HSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		res = cell.getStringCellValue();
		if (res.equals(olddata)) {
			cell.setCellValue(newdata);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

public void WriteData(String sheetname, int rownum, int cellnum, String value) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\vigneshwaran v.k\\eclipse-workspace\\FrameWork1\\Excel Sheets\\TestData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(value);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
}
}