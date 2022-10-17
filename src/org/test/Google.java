package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	private void search() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement  Test1 = driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]"));
		Test1.sendKeys("Ajith Kumar" + Keys.ENTER);
		driver.findElement(By.linkText("Images")).click();
		driver.quit();
		
				
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Google g = new Google();
		g.search();

	}

}
