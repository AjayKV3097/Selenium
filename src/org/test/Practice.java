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

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get
		driver.get("https://www.facebook.com/login/");
		//navigate
		//driver.navigate().to("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("World");
		driver.findElement(By.linkText("Log In"));
		WebElement findElement = driver.findElement(By.xpath("(//*[starts-with(text(),'Log in')])[2]"));
		System.out.println(findElement.getText());
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File f = new File("C:\\Users\\dell\\Documents\\Selenium\\facebook.png");
		FileUtils.copyFile(screenshotAs, f);
		driver.close();
	}

}
