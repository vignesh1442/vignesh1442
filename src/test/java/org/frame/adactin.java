package org.frame;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Before; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class adactin {
	static WebDriver driver;
	@BeforeClass
	public static void BeforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();


	}
	@AfterClass
	public  static void AfterClass() {
		driver.quit();

	}
	@Before
	public void Before() {
		long start = System.currentTimeMillis();
		System.out.println(start);

	}
	@After
	public void After() {
		long end = System.currentTimeMillis();
		System.out.println(end);


	}
	@Test
	public void Login() {
		WebElement txtuserName = driver.findElement(By.id("username"));
		txtuserName.sendKeys("naveen53");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("C1IZAU");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

}
