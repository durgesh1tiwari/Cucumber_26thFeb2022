package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import readPropertiesfiled.ReadConfigProperty;

public class TestCase1_ReadFromConfig extends ReadConfigProperty {

	WebDriver driver;

	ReadConfigProperty readConfig = new ReadConfigProperty();

	@Test()
	public void testCase_1() throws IOException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		String appUrl = readConfig.getConfigProperty("AppURL");
		String username = readConfig.getConfigProperty("username");
		String passwd = readConfig.getConfigProperty("password");

		System.out.println(appUrl);
		System.out.println(username);
		System.out.println(passwd);

	//	driver = new ChromeDriver();
		driver.get(appUrl);

		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		System.out.println("User Name entered");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(passwd);
		System.out.println("Password entered");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login button clicked");

		driver.quit();
	}

}
