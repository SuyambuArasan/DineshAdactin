package baseclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass

// WebDriver Methods
{
	public static WebDriver driver = null;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("edge"))

		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else {

			System.out.println("Invalid browser");
		}
		return driver;

	}

	public static void getTheWebPage(String entertheurl) {

		driver.get(entertheurl);

	}

	public static void getTheCurrentUrl()

	{
		String url = driver.getCurrentUrl();
		System.out.println("Current url is :" + url);

	}

	public static void getTheTitle() {

		String Title = driver.getTitle();
		System.out.println("Title of the page :" + Title);

	}

	public static void maximizeThePage() {

		driver.manage().window().maximize();

	}

	// navigation methods

	public static void navigationOperation(String type, String url) {

		if (type.equals("to")) {

			driver.navigate().to(url);

		} else if (type.equals("forward")) {

			driver.navigate().forward();

		} else if (type.equals("back")) {

			driver.navigate().back();

		}

		else if (type.equals("refresh")) {

			driver.navigate().refresh();

		}

	}
	public static void closeThePage(){
		
		driver.close();
		
	}
	
	public static void quitThePage(){
		
		driver.quit();
		
		
	}
	//WebElement methods
	
	
	public static void userInput(WebElement element,String value){
		
		element.sendKeys(value);
		
	}
	
	public static void clickOnElement(WebElement element){
		element.click();
		
	}
	
	public static void clearOnElement(WebElement element){
		
		element.clear();
		
	}
	
	
	public static void printTheText(WebElement element ){
		String t = element.getText();
		System.out.println("Text of the element :"+t );
		
		
	}
	
	public static void getAttributeValue(WebElement element) {
		
	String n =	element.getAttribute("value");
	System.out.println("AttributeValue of the element :"+n );
		
	}
	
	public static  void getAttributePlaceholder(WebElement element) {
	String p =	element.getAttribute("placeholder");
	System.out.println("AttributePlaceholder of the element :"+p );

	}
	
	public static void elementDisplayed(WebElement element) {

		boolean q = element.isDisplayed();
		System.out.println("Element displayed Status:" + q);
	}

	public static void elementEnabled(WebElement element) {

		boolean q = element.isEnabled();
		System.out.println("Element enabled Status:" + q);
	}

	public static void elementSelected(WebElement element) {

		boolean q = element.isSelected();
		System.out.println("Element selected Status:" + q);
		
		

	}
	
	public static void dropDown(WebElement element, String type,String text,Integer index){
		
		if (type.equals("isMultiple")) {
			
			Select s = new Select(element);
			boolean b = 	s.isMultiple();
			System.out.println("WebElement isMultiple:"+b);
			
		}

		if (type.equals("index")) {

			Select se = new Select(element);
			se.selectByIndex(index);

		}
		if (type.equals("getFirstSelectedOption")) {
			Select sel = new Select(element);
			WebElement b = sel.getFirstSelectedOption();
			System.out.println("Get first selected option is :" + b.getText());

		}
		if (type.equals("selectByVisibleText")) {

			Select sele = new Select(element);
			sele.selectByVisibleText(text);

		}

		if (type.equals("selectByIndex")) {

			Select sele = new Select(element);
			sele.selectByIndex(index);

		}
		
		if (type.equals("getSelectedAllOptions")) {
			
			Select s = new Select(element);
		    List<WebElement> q =s.getAllSelectedOptions();
		    for (WebElement we : q) {
		    	
		    	System.out.println(we.getText());
				
			}
		    
		    if (type.equals("selectByValue")) {
		    	
		    	Select sew = new Select(element);
		    	sew.selectByValue(text);
				
			}
	
			
		}}
		    
		    
	public static void getAllDropDownText(WebElement element)           {
		
		Select s1 = new Select(element);
		List<WebElement> l = s1.getOptions();
		
		for (WebElement we : l) {
			
			System.out.println(we.getText());
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
