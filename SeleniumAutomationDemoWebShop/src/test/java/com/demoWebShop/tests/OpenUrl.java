package com.demoWebShop.tests;

import org.testng.annotations.Test;

import com.demoWebShop.utilites.ConfigReader;

public class OpenUrl extends BaseTest {
	
	@Test
	public void openUrl() throws Exception {
		ConfigReader co = new ConfigReader();
		driver.get(co.getUrl());
		Thread.sleep(4000);
	}

}
