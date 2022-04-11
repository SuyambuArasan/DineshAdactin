package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	
	public WebDriver driver;

	
	public SecondPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroomn() {
		return adultroomn;
	}

	public WebElement getChildroomn() {
		return childroomn;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath= "//select[@name='location']")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id ="room_type")
	private WebElement roomtype;
	
	@FindBy(id ="room_nos")
	private WebElement roomno;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement datepickin;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement datepickout;
	
	@FindBy(id ="adult_room")
	private WebElement adultroomn;
	
	@FindBy(id ="child_room")
	private WebElement childroomn;
	
	@FindBy(id ="Submit")
	private WebElement search;
	
	
	
	
	
	
	
	
	
	
	
}
