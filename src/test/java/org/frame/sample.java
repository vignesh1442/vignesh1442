package org.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://adactinhotelapp.com/");
	WebElement txtuserName = driver.findElement(By.id("username"));
	txtuserName.sendKeys("naveen53");
	WebElement txtPassword = driver.findElement(By.id("password"));
	txtPassword.sendKeys("C1IZAU");
	WebElement btnLogin = driver.findElement(By.id("login"));
	btnLogin.click();

}
}
