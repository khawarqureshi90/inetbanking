package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL);
		logger.info("URL is opened");

		/*
		 * Creating object of LoginPage class to call the methods which are used to
		 * enter the information and getting login
		 */
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		String title =  driver.getTitle();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
		}

	}

}
