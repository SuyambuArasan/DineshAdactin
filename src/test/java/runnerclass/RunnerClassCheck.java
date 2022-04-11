package runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\dines\\eclipse-workspace\\DineshAdactin\\"
		+ "src\\test\\java\\runnerclass\\suyambu.feature",
	monochrome = true, tags = " @suyambuarasan",strict = true,
	plugin = {"pretty", "html:report/html.report",
			"junit:report/jsonreport.xml",
			"json:report/jsonreport.json",
			"com.cucumber.listener.ExtentCucumberFormatter:report/extentreport.html"}
	
		
		
		
		
		)
		
	
		

		
		

public  class RunnerClassCheck {
	
	
	public static  WebDriver driver ;
	
	@BeforeClass
	public static void setUp() throws Throwable{
		
		
		
		String browser =	ConfigurationHelper.getInstance().getInstanceCr().getBrowser();
	    driver =  BaseClass. browserLaunch(browser);
	     
		
	}
	@AfterClass
	
	public static void tearDown(){
		
		//driver.close();
		
	}

}
