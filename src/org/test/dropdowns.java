package org.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		/*WebElement continents = driver.findElement(By.name("continents"));
		Select s =new Select(continents);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", continents);
		s.selectByVisibleText("Europe");
		TakesScreenshot t  = (TakesScreenshot)driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\dell\\Documents\\Selenium\\dummy.png");
		FileUtils.copyFile(screenshotAs, f);*/
		
		WebElement name = driver.findElement(By.name("selenium_commands"));
		Select s1 =new Select(name);
	List<WebElement> allSelectedOptions = s1.getOptions();
		
		for(int i=0;i<allSelectedOptions.size();i++) {
			s1.selectByIndex(i);
		}
		
		List<WebElement> allSelectedOptions2 = s1.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions2) {
			String text = webElement.getText();
			System.out.println("After Selecting " +text);
		}
		
		for(int i=0;i<allSelectedOptions.size();i++) {
			s1.deselectByIndex(i);
		}
		
			
		driver.close();
	}

}
