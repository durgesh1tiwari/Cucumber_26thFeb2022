package stepImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefiantions {

	WebDriver driver;
	String appURL = "https://www.google.com/";

	@Given("I am on Google homepage")
	public void i_am_on_google_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
	}

	@When("^i enter \"([^\"]*)\" on searchbox$")
	public void i_enter_on_searchbox(String SearchItems) throws InterruptedException {

		driver.findElement(By.xpath(".//input[@class='gLFyf gsfi']")).sendKeys(SearchItems);

		WebElement searchButton = driver.findElement(By.xpath("(.//input[@value='Google Search'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", searchButton);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", searchButton);

	}

	@Then("i should see the results")
	public void i_should_see_the_results() {

		boolean result = driver.findElement(By.xpath(".//div[@id='result-stats']")).isDisplayed();
		System.out.println("Result is: " + result);
	}

}
