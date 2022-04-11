package cucumberConcept;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import runnerclass.ConfigurationHelper;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//cucumberConcept//DineshAdactin.feature")
		// glue = "StepDefinition")


public class RunnerClass {
 public static WebDriver driver;
	@BeforeClass
	public  static void setUp() throws Throwable{
		
		String browser =	ConfigurationHelper.getInstance().getInstanceCr().getBrowser();
	    driver =  BaseClass. browserLaunch(browser);
		
		
	}
	@AfterClass
	public static  void tearDown(){
		
	//	driver.close();
		
	}
}
