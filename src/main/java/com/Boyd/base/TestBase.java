package com.Boyd.base;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Boyd.pom.LoginPage;
import com.Boyd.pom.NavigationsPom;
import com.Boyd.utils.ExtentManager;
import com.Boyd.utils.PropertiesOperations;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class TestBase  extends Object_Repo{

	protected Logger logger;
//	protected static ExtentReports extentReports;
//    protected static ExtentTest extentTest;
	protected NavigationsPom navigationsPom;
	public WebDriver getDriver() {
		 return driver;
	 }
	 public Logger getLogger() {
		 return logger;
	 }
	
	public void launchAndNavigate() throws Exception{
		String browser=PropertiesOperations.getPropertyValueByKey("Browser");
		String url=PropertiesOperations.getPropertyValueByKey("Url");
		String userName=PropertiesOperations.getPropertyValueByKey("Username");
		String password=PropertiesOperations.getPropertyValueByKey("Password");
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();	
		}
		else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();	
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get(url);
		logger.info("entered into Url =  "+url);
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(userName);
		lp.enterPassword(password);
		lp.clickOnSignIn();
		logger.info("Signined in");
		lp.clickOnHomePage();
		
	}
	@BeforeTest
	public void setUp() throws Exception {
		logger=LogManager.getLogger(this.getClass().getName());
		logger.info("Setting up the test environment");
		launchAndNavigate();
		navigationsPom=new NavigationsPom(driver);
	}
	@AfterTest
	public void cleanup() {
	//	driver.quit();
		ExtentManager.flush();
	}

}
