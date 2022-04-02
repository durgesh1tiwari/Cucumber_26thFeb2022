package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import readPropertiesfiled.ReadConfigProperty;

public class MouserHover extends ReadConfigProperty {

	WebDriver driver;

	ReadConfigProperty readConfig = new ReadConfigProperty();

	@Test()
	public void testCase_1() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		String url = readConfig.getConfigProperty("salesForce").toString();
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//Actions is class which is used for mouse related operations
		Actions mouseHoverAction = new Actions(driver);
		
		WebElement ele =driver.findElement(By.xpath(".//div[@class='global-login-img']"));
		mouseHoverAction.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		driver.quit();
		
		
		//To click
	//	mouseHoverAction.click();
		//Right click
	//	mouseHoverAction.contextClick();
		//double click
	//	mouseHoverAction.doubleClick();
		//Drag and drop
	//	mouseHoverAction.dragAndDrop(ele, ele);
		
		
		
		
	
	}

}
