package org.frame;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassSample {
	private static final TimeUnit sec = null;

	public static void main(String[] args) throws IOException  {
		BaseClass baseclass = new BaseClass();
		baseclass.getDriver();
		baseclass.implicitWait(300);
		baseclass.loadurl("http://adactinhotelapp.com/");
		baseclass.maximize();
		WebElement txt1 = baseclass.findLocatorByID("username");
		String getdata = baseclass.getdata("Sheet1",1,0);
		baseclass.type(txt1, getdata);
		WebElement txtpass = baseclass.findLocatorByID("password");
		String getdata2 = baseclass.getdata("Sheet1", 1, 1);
		baseclass.type(txtpass, getdata2);
		WebElement btnlogin = baseclass.findLocatorByID("login");
		baseclass.click(btnlogin);
		WebElement location = baseclass.findLocatorByID("location");
		baseclass.selectOptionByIndex(location, 1);
		WebElement hotels = baseclass.findLocatorByID("hotels");
		baseclass.selectOptionByIndex(hotels, 1);
		WebElement roomtype = baseclass.findLocatorByID("room_type");
		baseclass.selectOptionByIndex(roomtype, 1);
		WebElement room_nos = baseclass.findLocatorByID("room_nos");
		baseclass.selectOptionByIndex(room_nos, 1);
		WebElement adult_room = baseclass.findLocatorByID("adult_room");
		baseclass.selectOptionByIndex(adult_room, 1);
		WebElement child_room = baseclass.findLocatorByID("child_room");
		baseclass.selectOptionByIndex(child_room, 0);
		WebElement Submit = baseclass.findLocatorByID("Submit");
		baseclass.click(Submit);
		WebElement radiobutton_0 = baseclass.findLocatorByID("radiobutton_0");
		baseclass.click(radiobutton_0);
		WebElement continue1 = baseclass.findLocatorByID("continue");
		baseclass.click(continue1);
		WebElement first_name = baseclass.findLocatorByID("first_name");
		String getdata3 = baseclass.getdata("Sheet1", 1, 2);
		baseclass.type(first_name, getdata3);
		WebElement last_name = baseclass.findLocatorByID("last_name");
		String getdata4 = baseclass.getdata("Sheet1", 1, 3);
		baseclass.type(last_name, getdata4);
		WebElement address = baseclass.findLocatorByID("address");
		String getdata5 = baseclass.getdata("Sheet1", 1, 4);
		baseclass.type(address, getdata5);
		WebElement cc_num = baseclass.findLocatorByID("cc_num");
		String getdata6 = baseclass.getdata("Sheet1",1, 5);
		baseclass.type(cc_num, getdata6);
		WebElement cc_type = baseclass.findLocatorByID("cc_type");
		baseclass.selectOptionByIndex(cc_type, 1);
		WebElement cc_exp_month = baseclass.findLocatorByID("cc_exp_month");
		baseclass.selectOptionByIndex(cc_exp_month, 5);
		WebElement cc_exp_year = baseclass.findLocatorByID("cc_exp_year");
		baseclass.selectOptionByIndex(cc_exp_year, 11);
		WebElement cc_cvv = baseclass.findLocatorByID("cc_cvv");
		String getdata7 = baseclass.getdata("Sheet1", 1, 6);
		baseclass.type(cc_cvv, getdata7);
		WebElement book_now = baseclass.findLocatorByID("book_now");
		baseclass.click(book_now);
		WebElement order_no = baseclass.findLocatorByID(""
				+ "");
		String attributeValue = baseclass.getAttributeValue(order_no);
		baseclass.WriteData("Sheet1",  1,7,attributeValue );
		
		
		
		
		
		
		
		
		
		
	}

}
