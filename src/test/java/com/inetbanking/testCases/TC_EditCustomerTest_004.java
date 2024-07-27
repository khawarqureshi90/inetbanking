package com.inetbanking.testCases;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.util.Assert;
import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass {

	LoginPage lp;
	EditCustomerPage ep;

	@Test
	public void editCustomer() throws InterruptedException {
		lp = new LoginPage(driver);
		ep = new EditCustomerPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		ep.ClickEditCus();
		ep.addID("80247");
		Thread.sleep(1000);
		ep.submitEdit();
		ep.changeCity("khi");
		Thread.sleep(1000);
		ep.subChange();
		if(isAlertshown()) {
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
			logger.warn("Edit Successful");
			Thread.sleep(2000);
		}
		else {
			Assert.assertTrue(false);
			logger.warn("Edit Failed");
		}
		

		ep.addID("52608");
		ep.submitEdit();

	}
	
	public boolean isAlertshown() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

}
