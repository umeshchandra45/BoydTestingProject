package com.Boyd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Boyd.Exceptions.DriverNotCreatedException;
import com.Boyd.utils.CommonMethods;
import com.Boyd.utils.LoggerUtil;
import com.Boyd.utils.WaitMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
public class BasePOM extends Object_Repo{
	
    protected WaitMethods wait;
    public CommonMethods cm = new CommonMethods();
    protected Logger logger;

    public BasePOM(WebDriver driver) {
        if (driver == null) {
            throw new DriverNotCreatedException();
        } else {
            this.driver = driver;
            this.wait = new WaitMethods(driver);
            PageFactory.initElements(driver, this);
            
            logger = LogManager.getLogger(this.getClass().getName());
            String logFileName = ThreadContext.get("logFilename");
            logger.info("Initializing logger for POM: " + this.getClass().getSimpleName() + ", Log File: " + logFileName);
            
        }
    }

}
