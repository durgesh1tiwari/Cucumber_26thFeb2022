package testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import readPropertiesfiled.ReadConfigProperty;

public class ScrollUp_Down extends ReadConfigProperty {

	WebDriver driver;
	ReadConfigProperty readConfig = new ReadConfigProperty();

	@Test(priority = 1)
	public void testCase_1() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		String url = readConfig.getConfigProperty("salesForce").toString();
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-2000)");
		
		driver.quit();
		
}
	
	
	@Test(priority = 2)
	public void testCase_2() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dutiwari\\Downloads\\geckodriver-v0.30.0-win64 (3)\\geckodriver.exe");

		String url = readConfig.getConfigProperty("salesForce").toString();
		
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-2000)");
		
		driver.quit();
		
}
	
}
