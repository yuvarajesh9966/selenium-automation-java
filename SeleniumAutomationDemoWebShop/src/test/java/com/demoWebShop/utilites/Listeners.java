package com.demoWebShop.utilites;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;
	
	public ExtentReports extentReports;
	
	public ExtentTest test;
	
	
	public void onStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Testing");
		sparkReporter.config().setReportName("Tester");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extentReports = new ExtentReports();
		
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", "Windows");
		extentReports.setSystemInfo("Browser", "Edge");	
		
	}
	
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test = extentReports.createTest(result.getName());
		test.log(Status.PASS, "The test case passed is : "+ result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		test = extentReports.createTest(result.getName());
		test.log(Status.FAIL, "The test case failed is : "+ result.getName());
		
		
		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
		
		System.out.println(driver);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File desFile = new File(System.getProperty("user.dir")+"/screenshots/"+result.getName()+".png");
		
		try {
			FileUtils.copyFile(srcFile, desFile);
		}catch (Exception e) {
			
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		test = extentReports.createTest(result.getName());
		test.log(Status.SKIP, "The test skipped is : "+result.getName());
	}
	
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}
	
	
	

}
