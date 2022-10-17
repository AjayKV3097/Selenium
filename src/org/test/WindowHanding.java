package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHanding {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://letcode.in/windows");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>l = new ArrayList<String>();
		l.addAll(windowHandles);
		driver.switchTo().window(l.get(1));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.switchTo().window(windowHandle);
		driver.close();
		Set<String> windowHandles2 = driver.getWindowHandles();
		l.clear();
		l.addAll(windowHandles2);
		driver.switchTo().window(l.get(0));
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		//driver.close();
		driver.navigate().to("https://www.facebook.com/login/");
		WebElement findElement = driver.findElement(By.id("pass"));
		findElement.click();
		Robot r  = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_J);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_Y);
		

	}

}
