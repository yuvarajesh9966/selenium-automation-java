package com.demoWebShop.utilites;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	private Properties pro;
	
	public ConfigReader() {
		
		try {
			FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
			pro = new Properties();
			pro.load(fileInput);
		}catch (Exception e) {
			System.out.println("File not found. Something Error....");
		}
		
	}
	
	
	public String getUrl() {
//		System.out.println(pro.getProperty("mainUrl"));
		return pro.getProperty("mainUrl");
	}
	
	public String getEmail() {
		return pro.getProperty("email");
	}
	
	public String getPassword() {
		return pro.getProperty("password");
	}

}
