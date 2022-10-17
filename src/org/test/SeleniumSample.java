package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSample {
	
	public static void test() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]"));
		firstName.sendKeys("Ajay");
		WebElement lastName =driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]"));
		lastName.sendKeys("KV");
		driver.findElement(By.cssSelector("input[class=\"form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required\"]")).sendKeys("abc@cde.com");
		driver.findElement(By.cssSelector("input[class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern\"]")).sendKeys("9787657457");
		driver.findElement(By.cssSelector("input[class=\"ng-pristine ng-untouched ng-invalid ng-invalid-required\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"checkbox1\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"checkbox2\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"checkbox3\"]")).click();
		Select skills = new Select( driver.findElement(By.id("Skills")));
		skills.selectByVisibleText("Java");
		driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")).click();
		WebElement country = driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]"));
		country.sendKeys("India"+ Keys.ENTER);
		Select DOB = new Select( driver.findElement(By.id("yearbox")));
		DOB.selectByValue("1997");
		Select month = new Select(driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]")));
		month.selectByValue("July");
		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByValue("30");
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		test();

	}

}
