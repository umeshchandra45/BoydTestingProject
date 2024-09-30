package com.Boyd.utils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Boyd.base.Object_Repo;
import com.aventstack.extentreports.Status;


public class ListnersImplementation extends Object_Repo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case : " + result.getMethod().getMethodName() + " is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        String actualDate = simpleDateFormat.format(date);
		test.log(Status.FAIL, "Test case : " + result.getMethod().getMethodName() + " is failed");
		test.log(Status.FAIL, result.getThrowable());
		// for Screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String ScreenShotPath = System.getProperty("user.dir") + "/Report/ScreenShots/ScreenShot_" + actualDate+ ".jepg";
		File dest = new File(ScreenShotPath);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(ScreenShotPath,"testcase failure Screenshot");
}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		// setup method call
		extent = ExtentSetUP.setUpExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		// close extent
		extent.flush();
	}

}
