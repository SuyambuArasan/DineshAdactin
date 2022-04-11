package runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.PageObjectManager;
import runnerclass.RunnerClassCheck;
import baseclass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionCheck extends BaseClass{
	 public WebDriver driver = RunnerClassCheck.driver;
	 PageObjectManager p = new PageObjectManager(RunnerClassCheck.driver);
	 @Given("^user Launch The Adactin Url$")
	 public void user_Launch_The_Adactin_Url() throws Throwable {
		 String Url=  ConfigurationHelper.getInstance().getInstanceCr().getUrl();
			BaseClass.getTheWebPage(Url);
	}

//	@When("^User enters the username$")
//	public void user_enters_the_username() throws Throwable {
//		BaseClass.userInput(p.getHomePage().getUsername(), "Dineshkasiraman34215");
//	}
//
//	@When("^User enters the password$")
//	public void user_enters_the_password() throws Throwable {
//		userInput(p.getHomePage().getPassword(), "QD4INB");
//	}
	
	 @When("^user enter the \"([^\"]*)\" in username field$")
	 public void user_enter_the_in_username_field(String username) throws Throwable {
		BaseClass.userInput(p.getHomePage().getUsername(), username);
		
	}
	 @When("^user enter the \"([^\"]*)\" in password field$")
	 public void user_enter_the_in_password_field(String password) throws Throwable {
		userInput(p.getHomePage().getPassword(), password);
	}
	


	 @When("^user click the login Button  and it navigates to search hotel page$")
	 public void user_click_the_login_Button_and_it_navigates_to_search_hotel_page() throws Throwable{
		clickOnElement(p.getHomePage().getLogin());
		printTheText(p.getHomePage().getTitle());
	
	}

@Then("^user select the desired inputs$")
public void user_select_the_desired_inputs() throws Throwable {
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
}}
