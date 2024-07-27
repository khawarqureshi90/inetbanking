package com.inetbanking.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@name='btnLogin']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	@CacheLookup
	WebElement lnkLogout;

//	WebElement txtUserName = ldriver.findElement(By.name("uid"));
//	WebElement txtPassword = ldriver.findElement(By.name("password"));
//	WebElement btnLogin = ldriver.findElement(By.name("btnLogin"));

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
}
