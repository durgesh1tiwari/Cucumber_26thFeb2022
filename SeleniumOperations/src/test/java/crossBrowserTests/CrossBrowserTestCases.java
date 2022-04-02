package crossBrowserTests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class CrossBrowserTestCases {

	WebDriver driver;

	public WebDriver openBrowser(String browser, @Optional("url") String url) throws MalformedURLException {

			if (browser.equalsIgnoreCase("chrome")) {
				System.out.println("Input browser is: " + browser );
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");
				driver = new ChromeDriver();

			}

			else if (browser.equalsIgnoreCase("ie")) {
				System.out.println("Input browser is: " + browser);
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");
				driver = new InternetExplorerDriver();
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				System.out.println("Input browser is: " + browser);
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");
				driver = new FirefoxDriver();
			}
			
			
			return driver;
		}
}
