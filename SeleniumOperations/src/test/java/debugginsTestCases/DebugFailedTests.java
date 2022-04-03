package debugginsTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crossBrowserTests.CrossBrowserTestCases;

public class DebugFailedTests extends PageElements_Actions {
	WebDriver driver;
	public DebugFailedTests(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	PageElements_Actions pageEl = new PageElements_Actions(driver);
	String driverPath ;

	
	
	@BeforeMethod
	public void initializeBrowser() {
		
		System.out.println("Into Intialze browser" );
		driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();	
	}
	
	
	
	@Test
	public void testcase1() {
		
		pageEl.enterUserName("standard_user");
		pageEl.enterPassword("secret_sauce");
		pageEl.clickLogin();

	}
	
	
	@Test
	public void testcase2() {
		
		String firstItemName = pageEl.getFirstItemName();
		
		Assert.assertEquals(firstItemName, "ABBBSDDD", "First Item name did not matched");

	}
	
	
	@Test
	public void testcase3() {
		
		String firstItemPrice = pageEl.getFirstItemPrice();
		
		Assert.assertEquals(firstItemPrice, "afafafas", "First Item price did not matched");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
