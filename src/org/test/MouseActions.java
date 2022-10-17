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
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		//WebElement click = driver.findElement(By.name("email"));
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//source.sendKeys("Hello");
		Actions a = new Actions(driver);
		//a.moveToElement(hover).perform();
		a.dragAndDrop(source, dest).perform();
		Thread.sleep(3000);
		//driver.close();
		driver.navigate().to("https://www.amazon.in/");
		WebElement hover = driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
		a.moveToElement(hover).perform();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\dell\\Documents\\Selenium\\facebook.png");
		FileUtils.copyFile(screenshotAs, f);
		driver.navigate().to("https://www.facebook.com/login/");
		WebElement click = driver.findElement(By.name("email"));
		click.sendKeys("Hello");
		a.doubleClick(click).perform();
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.name("pass"));
		findElement.sendKeys("World");
		a.contextClick(findElement).perform();
		Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
