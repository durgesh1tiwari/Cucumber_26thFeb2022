package crossBrowserTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT_Tests {

	WebDriver driver;
	String appurl1 = "https://ui.cogmento.com/home";
	String appurl2 ="https://demo.nopcommerce.com/";
	String appurl3 ="http://demo.virtuemart.net/";
	
	
	String driverPath ;
	
	
	@Parameters("browser")
	@BeforeMethod
	public WebDriver initializeBrowser(String browser) {
		System.out.println("Into initializeBrowser method");
			if (browser.equalsIgnoreCase("chrome")) {
				System.out.println("Input browser is: " + browser );
				driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();

			}

			else if (browser.equalsIgnoreCase("ie")) {
				System.out.println("Input browser is: " + browser);
				 driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", driverPath);
		
				driver = new InternetExplorerDriver();
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				System.out.println("Input browser is: " + browser);
				 driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", driverPath);
		
				driver = new FirefoxDriver();
			}
				
			return driver;
		}
		
	
	@Test(groups = {"regressionTest","smokeTest"},priority = 1)
	public void test1() throws InterruptedException {
		
		
		driver.get(appurl1);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
	}
	
	
	
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		
		driver.get(appurl2);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	

	@Test(priority = 3)
	public void test3() throws InterruptedException {
		
		driver.get(appurl3);
		driver.manage().window().maximize();	
		Thread.sleep(5000);
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Into tear down method");
		driver.quit();
	}
		
}
