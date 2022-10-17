package org.test;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	private void iphone13(String s3) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String windowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys(s1 + Keys.ENTER);
		driver.findElement(By.partialLinkText("Apple iPhone 13 (128GB) - Green")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String windowHandle1 : windowHandles) {
			driver.switchTo().window(windowHandle1);			
			}
			driver.findElement(By.id("buy-now-button")).click();
			driver.findElement(By.name("email")).sendKeys("9787657458"+Keys.ENTER);
			driver.findElement(By.name("password")).sendKeys(s3 +Keys.ENTER);
			driver.close();
			driver.switchTo().window(windowHandle);
			driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("iphone 13" + Keys.ENTER);
			driver.findElement(By.partialLinkText("Apple iPhone 13 Pro (128GB) - Silver")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.quit();
			
			

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a = new Amazon();
		a.iphone13("Ajasou@1430");

	}

}
