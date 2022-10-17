package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		WebElement scrolldown = driver.findElement(By.xpath("(//span[@class='red_text'])[4]"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
		Thread.sleep(3000);
		WebElement scrollup = driver.findElement(By.xpath("//div[@id='client-logo']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/login/");
		WebElement id = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('Value', 'Ajay')",id);
		Object username = js.executeScript("return arguments[0].getAttribute('value')", id);
		String id2 =(String)username;
		System.out.println(id2);
		id.sendKeys("Ajay");
		id.sendKeys(Keys.PAGE_DOWN);
		js.executeScript("arguments[0].setAttribute('Style','background:green')", id);
		driver.close();
	}

}
