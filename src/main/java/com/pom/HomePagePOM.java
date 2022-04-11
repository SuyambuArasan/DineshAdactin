package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	
	public  WebDriver driver = null;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password ;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	
	@FindBy(xpath = "//td[text() ='Welcome to Adactin Group of Hotels']")
	private WebElement title;
	
	public WebElement getTitle() {
		return title;
	}

	public HomePagePOM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}
}
