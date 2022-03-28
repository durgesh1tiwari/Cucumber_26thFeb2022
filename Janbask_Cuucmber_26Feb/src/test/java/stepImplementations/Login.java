package stepImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;
	String appURL = "https://www.saucedemo.com/";

	@Given("I launch browser with saucelab url")
	public void launch_browser_with_saucelab() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();

	}

	@When("I enter valid username")
	public void i_enter_valid_username() {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		System.out.println("User Name entered");

	}

	@Then("My user name should be entered in the text box")
	public void my_user_name_should_be_entered_in_the_text_box() {

		String username = driver.findElement(By.id("user-name")).getText();

		if (username.equalsIgnoreCase("standard_user")) {

			System.out.println("User name entered correctly");
		}

		else {
			System.out.println("User name is not entered correctly");
		}

	}

	@When("I enter the valid password")
	public void i_enter_the_valid_password() {

		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("secret_sauce");
		System.out.println("Password entered");
	}

	@When("I click on login")
	public void i_click_on_login() {
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login button clicked");
	}

	@Then("I should be able to login")
	public void i_should_be_able_to_login() {

		driver.findElement(By.xpath(".//button[@id='react-burger-menu-btn']")).click();
		boolean isLogoutDisplayed = driver.findElement(By.xpath(".//a[@id='logout_sidebar_link']")).isDisplayed();

		if (isLogoutDisplayed == true) {
			System.out.println("User is logged in");
		}

		else {
			System.out.println("User is logged in");
		}

	}

	@Then("I should see Products")
	public void i_should_see_products() throws InterruptedException {
		
		boolean isClosedispayed = driver.findElement(By.xpath(".//button[@id='react-burger-cross-btn']")).isDisplayed();
		
		if(isClosedispayed == true) {
			Thread.sleep(5000);
			System.out.println("Close icon dispalyed:" + isClosedispayed);
			driver.findElement(By.xpath(".//button[@id='react-burger-cross-btn']")).click();
			System.out.println("Clicked on close icon");
				
		}
		
		else {
			
			System.out.println("Close icon dispalyed:" + isClosedispayed);
		}
		
		boolean idProductTextdisplayed = driver.findElement(By.xpath(".//span[text()='Products']")).isDisplayed();
		
		System.out.println("Product is displayed: " + idProductTextdisplayed );

	}
	
	  @When("^I enter username as \"([^\"]*)\"$")
	    public void i_enter_username_as_something(String username) throws Throwable {
			driver.findElement(By.id("user-name")).sendKeys(username);
			System.out.println("User Name entered");
	    	
	    	
	    }

	    @When("^I enter password as \"([^\"]*)\"$")
	    public void i_enter_password_as_something(String password) throws Throwable {
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("secret_sauce");
			System.out.println("Password entered");
	    }

	    @When("I add item into cart")
	    public void i_add_item_into_cart() {

	    	driver.findElement(By.xpath(".//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	    	System.out.println("Item added to the cart");
	    }
	    
	    @Then("I sort the products")
	    public void i_sort_the_products() throws InterruptedException {
	    	Thread.sleep(5000);
			Select sel = new Select(driver.findElement(By.className("product_sort_container")));
			sel.selectByIndex(2);
			
	    }
}
