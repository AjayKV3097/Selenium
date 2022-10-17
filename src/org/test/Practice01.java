package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	    File f = new File("C:\\Users\\dell\\Documents\\Selenium\\facebook.png");
	    FileUtils.copyFile(screenshotAs, f);
	}

}
