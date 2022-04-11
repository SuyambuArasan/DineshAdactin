package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	public WebDriver driver = null;

	public PageObjectManager(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public HomePagePOM getHomePage(){
		
		HomePagePOM hp = new HomePagePOM(driver);
		return hp;
	
	}
	
	public SecondPage getSecondpage(){
		
		SecondPage sp = new SecondPage(driver);
		return sp;
		
		
	}

}
