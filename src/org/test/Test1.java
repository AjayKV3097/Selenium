package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	try {	System.setProperty
		("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.facebook.com/login/");
		WebElement test=w.findElement(By.cssSelector("input[name=\"email\"]"));
		test.sendKeys("Ajith Kumar");
		WebElement test2 = w.findElement(By.xpath("//input[@name='pass']"));
		test2.sendKeys("Ajith Kumar");
		System.out.println("Success");
		WebElement test1=w.findElement(By.xpath("//button[@value='1']"));
		System.out.println(test.getTagName());
		test1.click();
		Thread.sleep(3000);
		System.out.println("Clicked");
		w.quit();

	}
	
	catch(Exception e) {
		System.out.println(e);
	}
}
}
