package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	WebDriver webd;
	public EditCustomerPage(WebDriver rdriver) {
		webd = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Edit Customer']")
	@CacheLookup
	WebElement editcustomer;
	
	@FindBy(xpath = "//input[@name='cusid']")
	@CacheLookup
	WebElement addid;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	@CacheLookup
	WebElement submitEdit;
	
	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	WebElement editCity;
	
	@FindBy(xpath = "//input[@name='sub']")
	@CacheLookup
	WebElement changeSubmit;
	
	
	
	public void ClickEditCus() {
		editcustomer.click();
	}
	
	public void addID(String id) {
		addid.sendKeys(id);
	}
	
	public void submitEdit() {
		submitEdit.click();
	}
	public void changeCity(String city) {
		editCity.clear();
		editCity.sendKeys(city);
	}
	
	public void subChange() {
		changeSubmit.click();
	}
	

}
