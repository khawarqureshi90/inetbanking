package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	/*
	 * Reading all the information given in "./Configuration/config.properties"
	 * File. By doing this we don't need to change the information everywhere if
	 * values need to be changed.
	 */
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is:" + e.getMessage());
		}
	}
	// These methods getting all the values.
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	

}
