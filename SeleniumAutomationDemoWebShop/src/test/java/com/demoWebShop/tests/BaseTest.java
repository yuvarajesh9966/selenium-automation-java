package com.demoWebShop.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.demoWebShop.utilites.ConfigReader;

public class BaseTest {
	
	protected WebDriver driver;
	protected ConfigReader co;
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(@Optional(value = "Edge") String browser) {
		registerDriver(browser);
		co = new ConfigReader();
		ITestContext context = Reporter.getCurrentTestResult().getTestContext();
		context.setAttribute("WebDriver", driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	private WebDriver registerDriver(String browser) {
		if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/Drivers/msedgedriver.exe");
			driver = new EdgeDriver();	
		}else if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	public void openUrl() throws Exception {
		driver.get(co.getUrl());
		Thread.sleep(4000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
