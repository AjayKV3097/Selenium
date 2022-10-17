package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2).switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		String text1 = driver.findElement(By.id("Click")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println(size);
		driver.close();

	}

}
