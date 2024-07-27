package com.inetbanking.testCases;

import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	LoginPage lp;
	AddCustomerPage acp;

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(2000);

		acp = new AddCustomerPage(driver);
		acp.clickAddCus();

		acp.name("tomy");
		acp.gender("female");
		acp.dob("13", "02", "1990");
		Thread.sleep(2000);
		acp.address("420 Beauchamp avenue");
		acp.city("london");
		acp.state("westmidland");
		acp.pin("896589");
		acp.phonenumber("0123456789");
		String email = randGenerate() + "@gamil.com";
		acp.email(email);
		acp.password("323e23r2");
		acp.submitDetails();

		Thread.sleep(3000);
		
		logger.info("validation start");
		
		Boolean done = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(done) {
			Assert.assertTrue(true);
			captureScreen(driver, "AddCustomer");
			logger.info("test passed");
		}
		
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "AddCustomer");
			logger.info("test failed");
		}
	}

}
