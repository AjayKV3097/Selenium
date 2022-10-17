package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	
	private void redBus() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[data-message=\'Please enter a source city\']")).sendKeys("Madurai"+Keys.ENTER);
		driver.findElement(By.cssSelector("input[data-message=\'Please enter a destination city\']")).sendKeys("Chennai"+Keys.ENTER);
	//	driver.findElement(By.xpath("//*[@id=\'onward_cal\']")).sendKeys("21Aug2022"+Keys.ENTER);
		driver.findElement(By.id("search_btn")).click();
	//	driver.quit();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedBus rb = new RedBus();
		rb.redBus();

	}

}
