package org.frame;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazeDemo {
	public static void main(String[] args) throws IOException {
		BaseClass b = new BaseClass();
		b.getDriver();
		b.loadurl("https://blazedemo.com/");
		b.maximize();
		WebElement findLocatorByxpat = b.findLocatorByxpat("//input[@type='submit']");
		b.click(findLocatorByxpat);
		WebElement flight = b.findLocatorByxpat("(//input[@value='Choose This Flight'])[3]");
		b.click(flight);
		WebElement name = b.findLocatorByID("inputName");
		String getdata = b.getdata("sheet1", 1, 2);
		b.type(name, getdata);
		WebElement address = b.findLocatorByID("address");
		String getdata2 = b.getdata("sheet1", 1, 4);
		b.type(address, getdata2);
		WebElement city = b.findLocatorByID("city");
		String getdata3 = b.getdata("sheet1", 1, 4);
		b.type(city, getdata3);
		WebElement state = b.findLocatorByID("state");
		String getdata4 = b.getdata("sheet1", 1, 8);
		b.type(state, getdata4);
		WebElement zipcode = b.findLocatorByID("zipCode");
		String getdata5 = b.getdata("sheet1", 1, 9);
		b.type(zipcode, getdata5);
		WebElement cc = b.findLocatorByID("creditCardNumber");
		String getdata6 = b.getdata("sheet1", 1, 5);
		b.type(cc, getdata6);
		WebElement year = b.findLocatorByID("creditCardYear");
		b.doubleClick(year);
		String getdata7 = b.getdata("sheet1", 1, 10);
		b.type(year, getdata7);
		WebElement nameonc = b.findLocatorByID("nameOnCard");
		String getdata8 = b.getdata("sheet1", 1, 11);
		b.type(nameonc, getdata8);
		WebElement sumbit = b.findLocatorByxpat("//input[@type='submit']");
		b.click(sumbit);
		WebElement tableData = b.findLocatorByClassName("table");
		List<WebElement> allRows = tableData.findElements(By.tagName("tr"));
		for (int i = 1; i < allRows.size()-6; i++) {
			WebElement webElement = allRows.get(i);
			String data = webElement.getText();
			System.out.println(data);
			b.WriteData("sheet1", 1, 12, data);
			
			
	}

}}
