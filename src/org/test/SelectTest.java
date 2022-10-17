package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Renukagowri");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Renugopal@30");
		driver.findElement(By.name("login")).click();;
		TakesScreenshot ts  = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f  = new File("C:\\Users\\dell\\Documents\\Selenium\\Test.png");
		FileUtils.copyFile(screenshotAs, f);
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("Melbourne");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByIndex(1);
		File screenshotas = ts.getScreenshotAs(OutputType.FILE);
		File f1  = new File("C:\\Users\\dell\\Documents\\Selenium\\Test1.png");
		FileUtils.copyFile(screenshotas, f1);
		

	}

}
