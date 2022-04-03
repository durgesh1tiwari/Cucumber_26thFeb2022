package debugginsTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageElements_Actions {

	
	WebDriver driver;
	
	public PageElements_Actions(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	WebElement userName = driver.findElement(By.id("user-name"));
	
	WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
	
	WebElement loginBtn = driver.findElement(By.id("login-button"));
	
	WebElement firstItemName = driver.findElement(By.xpath("(.//div[@class='inventory_item_name'])[1]"));

	WebElement firstItemPrice = driver.findElement(By.xpath("(.//div[@class='inventory_item_price'])[1]"));
	
	WebElement addToCart = driver.findElement(By.xpath("(.//button[text()='Add to cart'])[1]"));
	
	
	public void enterUserName(String username) {
		
		userName.sendKeys(username);
	}
	
	public void enterPassword(String passWord) {
		
		password.sendKeys(passWord);
	}
	
	public void clickLogin() {
		
		loginBtn.click();
	}
	
	public String getFirstItemName() {
		
		return firstItemName.getText().toString();
	}
	
	public String getFirstItemPrice() {
		
		return firstItemPrice.getText().toString();
	}
	
	public void clickAddtoCart() {
		addToCart.click();
	}
	
}
