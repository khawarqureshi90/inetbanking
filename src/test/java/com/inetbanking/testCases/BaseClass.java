package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;

	public static Logger logger;

	// This method runs before the testcase to set the all environment
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());

		logger = Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("log4j2.properties");
		BasicConfigurator.configure();

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
//		driver.manage().window().maximize();

	}

	// this method runs in the end of testcase
	@AfterClass
	public void tearDown() {
//		driver.quit();
		driver.manage().window().maximize();
	}

	// This method takes screen shot
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	// genarating random alphabets which helps to create the emails in every run
	// testcase.
	public String randGenerate() {

		String randstring = RandomStringUtils.randomAlphabetic(5);
		return randstring;
	}

	public String randIntGenerate() {

		String randInt = RandomStringUtils.randomNumeric(6);
		return randInt;
	}
}
