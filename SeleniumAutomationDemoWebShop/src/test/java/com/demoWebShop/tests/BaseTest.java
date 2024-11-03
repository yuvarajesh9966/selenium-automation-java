package com.demoWebShop.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(@Optional(value = "Edge") String browser) {
		registerDriver(browser);
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
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
