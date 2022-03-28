package testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/scenarios"},
		glue = {"stepImplementations"},
		stepNotifications = true,
		dryRun = false,
		monochrome = false,	
		plugin ={"pretty","summary", "html:target/reports/html", "json:target/reports/json/report.json", "junit:target/reports/junit/report.xml"},
		tags = "@goolge"
		)


public class Runner {
	/*
	 * @BeforeClass public static void setUp(){
	 * System.out.println("Before Class-Setup"); }
	 * 
	 * @AfterClass public static void tearDown(){
	 * System.out.println("After Class-Tear Down"); }
	 */
}
