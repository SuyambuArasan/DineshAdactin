package runnerclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.pom.HomePagePOM;
import com.pom.PageObjectManager;
import com.pom.SecondPage;

import baseclass.BaseClass;
public class TestClass extends BaseClass {
public static void main(String[] args) throws Throwable {
	
	
	String browser =	ConfigurationHelper.getInstance().getInstanceCr().getBrowser();
       browserLaunch(browser);
       
      String Url=  ConfigurationHelper.getInstance().getInstanceCr().getUrl();
		getTheWebPage(Url);
		PageObjectManager p = new PageObjectManager(driver);
		
		userInput(p.getHomePage().getUsername(), "Dineshkasiraman34215");
		userInput(p.getHomePage().getPassword(), "QD4INB");
		clickOnElement(p.getHomePage().getLogin());
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
		
		
		
		

}}
