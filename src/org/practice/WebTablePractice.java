package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	private static void demoGuru() {
		// TODO Auto-generated method stub

		// Printing all values
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> table = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		for (WebElement webElement : table) {

			String text = webElement.getText();
			System.out.println(text);

		}
	}

	private static void demoGuru1() {
		// TODO Auto-generated method stub

		// Printing 1st row values
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> table = driver.findElements(By.xpath("(//table)[2]/tbody/tr[1]/td"));
		for (WebElement webElement : table) {
			String text1 = webElement.getText();
			System.out.println(text1);

		}
	}

	private static void demoGuru2() {
		// TODO Auto-generated method stub
		int count = 0;
		// counting no of rows
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> table = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		for (WebElement webElement : table) {
			count++;

		}
		System.out.println(count);

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe"); WebDriver driver =
		 * new ChromeDriver(); driver.get("https://letcode.in/table"); List<WebElement>
		 * findElements =
		 * driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td")); for
		 * (WebElement webElement : findElements) {
		 * 
		 * String text = webElement.getText(); System.out.println(text);
		 * 
		 * } WebElement checkBox =
		 * driver.findElement(By.xpath("//table[@id='simpletable']/tbody/tr[0]/td[3]"));
		 * checkBox.click(); Thread.sleep(3000); driver.close();
		 */
		WebTablePractice.demoGuru();

	}
}
