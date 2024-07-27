package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	// here I locating all the web-elements
	
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement addcustomer;
//	= ldriver.findElement(By.xpath("//a[normalize-space()='New Customer']"));
	
	@FindBy(xpath = "//input[@name='name']")
	@CacheLookup
	WebElement cusName;
	
	@FindBy(xpath = "//input[@name='rad1']")
	@CacheLookup
	WebElement cusGender;
	
	@FindBy(xpath = "//input[@name='dob']")
	@CacheLookup
	WebElement cusDOB;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	@CacheLookup
	WebElement cusAdd;
	
	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	WebElement cusCity;
	
	@FindBy(xpath = "//input[@name='state']")
	@CacheLookup
	WebElement cusState;
	
	@FindBy(xpath = "//input[@name='pinno']")
	@CacheLookup
	WebElement cusPin;
	
	@FindBy(xpath = "//input[@name='telephoneno']")
	@CacheLookup
	WebElement cusMobile;
	
	@FindBy(xpath = "//input[@name='emailid']")
	@CacheLookup
	WebElement cusEmail;
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement cusPassword;
	
	@FindBy(xpath = "//input[@name='sub']")
	@CacheLookup
	WebElement cusSubmit;
	
	//I calling these methods from TC_AddCustomerTest_003.java class by creating the object of this class "AddCustomerPage".
	public void clickAddCus() {
		addcustomer.click();
	}
	
	public void name(String name) {
		cusName.sendKeys(name);
	}
	
	public void gender(String gender) {
		cusGender.click();;
	}
	
	public void dob(String mm, String dd, String yy) {
		cusDOB.sendKeys(mm);
		cusDOB.sendKeys(dd);
		cusDOB.sendKeys(yy);
	}
	
	public void address(String address) {
		cusAdd.sendKeys(address);
	}
	
	public void city(String city) {
		cusCity.sendKeys(city);
	}
	
	public void state(String state) {
		cusState.sendKeys(state);
	}
	
	public void pin(String pin) {
		cusPin.sendKeys(String.valueOf(pin));
	}
	
	public void phonenumber(String pNumber) {
		cusMobile.sendKeys(pNumber);
	}
	
	public void email(String email) {
		cusEmail.sendKeys(email);
	}
	
	public void password(String pass) {
		cusPassword.sendKeys(pass);
	}
	
	public void submitDetails() {
		cusSubmit.click();
	}

}
