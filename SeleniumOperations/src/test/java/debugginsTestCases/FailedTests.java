package debugginsTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTests {
 WebDriver driver;
	
	@Test()
	public void failedTestCase() {
		String driverPath ;
		System.out.println("Into Intialze browser" );
		driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Validating fist item name
		String firstName = driver.findElement(By.xpath("(.//div[@class='inventory_item_name'])[1]")).getText().toString();
		
		//TestNg assertion
		Assert.assertEquals(firstName, "Sauce Labs Backpack", "Fist Item name did not matched");
		
		
		String firstPrice = driver.findElement(By.xpath("(.//div[@class='inventory_item_price'])[1]")).getText();
		
		Assert.assertEquals(firstPrice, "$29.99", "Fist price did not matched");

		driver.findElement(By.xpath("(.//button[text()='Add to cart'])[1]")).click();
		
		driver.quit();
			
		
	}
	
	
	
	
	
	
	
}
