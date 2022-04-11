package cucumberConcept;

import org.openqa.selenium.WebDriver;

import com.pom.HomePagePOM;
import com.pom.PageObjectManager;

import baseclass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberAdactinConcept.RunnerClass;
import runnerclass.ConfigurationHelper;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = RunnerClass.driver;
	public static PageObjectManager p = new PageObjectManager(driver);
	
	
	@Given("^user enters the url$")
	public void user_enters_the_url() throws Throwable {
		 String Url=  ConfigurationHelper.getInstance().getInstanceCr().getUrl();
			getTheWebPage(Url);	
	}

	@When("^User enters the username$")
	public void user_enters_the_username() throws Throwable {
		userInput(p.getHomePage().getUsername(), "Dineshkasiraman34215");
	}

	@When("^User enters the password$")
	public void user_enters_the_password() throws Throwable {
		userInput(p.getHomePage().getPassword(), "QD4INB");

	}

	@When("^User login in to hotel booking page$")
	public void user_login_in_to_hotel_booking_page() throws Throwable {
		clickOnElement(p.getHomePage().getLogin());
	}

	@Then("^User select the desired inputs$")
	public void user_select_the_desired_inputs() throws Throwable {
printTheText(p.getHomePage().getTitle());
		
		dropDown(p.getSecondpage().getLocation(), "selectByIndex", null, 2);
		dropDown(p.getSecondpage().getHotels(), "selectByVisibleText", "Hotel Sunshine", null);
		dropDown(p.getSecondpage().getRoomtype(), "selectByVisibleText", "Double", null);
		dropDown(p.getSecondpage().getRoomno(), "selectByVisibleText", "2 - Two", null);
	clearOnElement(p.getSecondpage().getDatepickin());
	userInput(p.getSecondpage().getDatepickin(), "22/03/2022");
	clearOnElement(p.getSecondpage().getDatepickout());
	userInput(p.getSecondpage().getDatepickout(), "26/03/2022");
	 dropDown(p.getSecondpage().getAdultroomn(), "selectByIndex", null, 2);
	 dropDown(p.getSecondpage().getChildroomn(), "selectByIndex", null, 2);
	 clickOnElement(p.getSecondpage().getSearch());
	}



}
