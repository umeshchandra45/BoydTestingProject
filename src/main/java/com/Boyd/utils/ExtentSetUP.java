package com.Boyd.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.Boyd.base.Object_Repo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentSetUP extends Object_Repo
{
	
	public static ExtentReports setUpExtentReport() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
       
        Date date = new Date();
        String actualDate = simpleDateFormat.format(date);
		String filePath=System.getProperty("user.dir")+"/Report/ExecutionReport_"+actualDate+".html";
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(filePath);
	    extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("DocumentTitle");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Execution Report");
		
		return extent;
	}
}