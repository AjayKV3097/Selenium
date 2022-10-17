package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String count="";
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table1 = driver.findElement(By.xpath("//table[@id='simpletable']"));
		WebElement body = table1.findElement(By.xpath("//table[@id='simpletable']//tbody"));
		List<WebElement> allrows = body.findElements(By.tagName("tr"));
		for (WebElement row : allrows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			WebElement column = columns.get(1);
			String text = column.getText();
			
			System.out.println(text);
			if(text.equalsIgnoreCase("Man")) {
				columns.get(3).findElement(By.tagName("input")).click();
			}
			
		}
		
	}

}
