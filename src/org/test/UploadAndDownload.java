package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class UploadAndDownload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement upload = driver.findElement(By.xpath("//span[@class='ui-fileupload-simple ui-widget']"));
		upload.click();
		String f = "AJAY\\Test.txt";
		StringSelection s = new StringSelection(f);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Success");
		
		//download
		/*driver.navigate().to("https://www.leafground.com/file.xhtml");
		WebElement download = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		download.click();
		
		File f = new File("C:\\Users\\dell\\Downloads");
		
		File[] listFiles = f.listFiles();
		
		for (File file : listFiles) {
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("Success");
				break;
				
			}
			
		}*/
		
	}

}
