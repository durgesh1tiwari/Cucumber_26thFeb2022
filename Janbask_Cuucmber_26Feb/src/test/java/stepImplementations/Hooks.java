package stepImplementations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	
	@Before(order =1)
	public void beforeEverySceanrio1() {
		
		System.out.println("Before 1 ,I will be executed before every sceanrio");
		//Logic to connect to application.
		//Logic to connect to database
		//Create configuration files		
	}
	
	@Before(order =2)
	public void beforeEverySceanrio2() {
		
		System.out.println("Before 2 ,I will be executed before every sceanrio");
		//Logic to connect to application.
		//Logic to connect to database
		//Create configuration files		
	}
	
	
	
	@After
	public void afterEverySceanrio(Scenario scenario) {
		System.out.println("I will be executed after every sceanrio");
		//Takeup the screenshot for the failure
		
		if(scenario.isFailed()) {
			
			//Take up screenshot
		}
		
		else {
			//mark the test as pass
		}
		
		
	}
	
	
	@BeforeStep
	public void beforeEveryStep() {
		
		System.out.println("Before every step");
	}
	
	@AfterStep
	public void afterEveryStep() {
		
		System.out.println("After every step");
	}
	
	
	
	
	
	
	
}
