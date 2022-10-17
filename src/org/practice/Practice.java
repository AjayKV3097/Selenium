package org.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//ScreenShot
		TakesScreenshot s = (TakesScreenshot)driver;
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		File f  = new File("C:\\Users\\dell\\Desktop\\Selenium-Study\\Screenshots\\Practice.png");
		FileUtils.copyFile(screenshotAs, f);
		//Alerts
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.switchTo().alert().accept();
		WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		String textname = text.getText();
		System.out.println(textname);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		WebElement text1 = driver.findElement(By.id("demo"));
		String text2 = text1.getText();
		System.out.println(text2);
		//Actions
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
	    Actions a = new	Actions(driver);
	    WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	    WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    a.dragAndDrop(source, dest).perform();
	    driver.navigate().to("https://www.facebook.com/login/");
	    WebElement username = driver.findElement(By.id("email"));
	    a.contextClick(username).perform();
	    a.doubleClick(username).perform();
	    WebElement login = driver.findElement(By.id("loginbutton"));
	    a.click(login).perform();
	    driver.navigate().to("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement orders = driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
	    a.moveToElement(orders).perform();
	    String text3 = orders.getText();
	    System.out.println(text3);
	    Thread.sleep(3000);
	    driver.navigate().to("https://adactinhotelapp.com/");
	    driver.findElement(By.id("username")).sendKeys("Renukagowri");
	    driver.findElement(By.id("password")).sendKeys("Renugopal@30");
	    driver.findElement(By.id("login")).click();
	    WebElement roomnos = driver.findElement(By.xpath("//select[@id='room_nos']"));
	    Select s0 = new Select(roomnos);
	    s0.selectByValue("3");
	    String text4 = roomnos.getText();
	    System.out.println(text4);
		//SELECT
	    driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	    WebElement findElement = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
	    Select s1 = new Select(findElement);
	    List<WebElement> options = s1.getOptions();
	    for (int i = 0; i < options.size(); i++) {
			s1.selectByIndex(i);
					
		}
	    List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
	    for (WebElement webElement : allSelectedOptions) {
	    	String text0 = webElement.getText();
			System.out.println(text0);
		}
		//Scrolling
	    driver.navigate().to("http://www.greenstechnologys.com/");
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,500)", "");
	    Thread.sleep(3000);		
	    jse.executeScript("window.scrollBy(0,-500)", "");
	    Thread.sleep(3000);
	    WebElement scrolldown = driver.findElement(By.xpath("(//span[@class='red_text'])[4]"));
	    jse.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
	    Thread.sleep(3000);
	    WebElement scrollUp = driver.findElement(By.xpath("//*[@title='Greens Technologys - Leaders in IT training and Placement']"));
	    jse.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	    Thread.sleep(3000);
	    driver.navigate().to("https://www.facebook.com/login/");
	    WebElement usernames = driver.findElement(By.id("email"));
	    jse.executeScript("arguments[0].setAttribute('Value','Ajay')", usernames);
	    Object executeScript = jse.executeScript("return arguments[0].getAttribute('Value')", usernames);
	    String string = executeScript.toString();
	    System.out.println(string);
	    usernames.sendKeys("Vijay"+Keys.PAGE_DOWN);
	    //iFrames
	    driver.navigate().to("https://leafground.com/frame.xhtml");
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("(//button[@id='Click'])[1]")).click();
	    WebElement click = driver.findElement(By.xpath("(//button[@id='Click'])[1]"));
	    String clicktext = click.getText();
	    System.out.println(clicktext);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(2).switchTo().frame("frame2");
	    WebElement click2 = driver.findElement(By.id("Click"));
	    click2.click();
	    String clicktext2 = click2.getText();
	    System.out.println(clicktext2);
	    driver.switchTo().defaultContent();
	    List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
	    int size = findElements.size();
	    System.out.println(size);
	    //WindowHandling
	    driver.navigate().to("https://letcode.in/windows");
	    String windowHandle = driver.getWindowHandle();
	    String url1 = driver.getCurrentUrl();
	    System.out.println(url1);
	    driver.findElement(By.id("home")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> li = new ArrayList();
	    li.addAll(windowHandles);
	    driver.switchTo().window(li.get(1));
	    String url2 = driver.getCurrentUrl();
	    System.out.println(url2);
	    driver.switchTo().window(li.get(0));
	    driver.close();
	    Set<String> windowHandles2 = driver.getWindowHandles();
	    li.clear();
	    li.addAll(windowHandles2);
	    driver.switchTo().window(li.get(0));
	    String currentUrl3 = driver.getCurrentUrl();
	    System.out.println(currentUrl3);
	    
	    

	    
	    driver.close();
		

	}

}
