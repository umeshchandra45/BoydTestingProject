package com.Boyd.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Boyd.base.TestBase;

import com.Boyd.pom.SchedulingSalesOrderPOM;
import com.aventstack.extentreports.Status;

public class SchedulingSalesOrder extends TestBase{
	@Test
	public void schedulingSalesOrder() {
		WebDriver driver=getDriver();
		try {
		navigationsPom.navigatingToOrderManagement();
		test.log(Status.INFO, "Test Execution is started ");
		String filePath = System.getProperty("user.dir") + "\\Excel\\BOYD_O2C_Scheduling_SalesOrder.xlsx";
		SchedulingSalesOrderPOM pom=new SchedulingSalesOrderPOM(driver, filePath, "Schedulingsalesorder");
		 for(int i=1;i< pom.getExcelOperations().getRowCount(); i++) {
		    	 pom.enterSchedulingSalesorderData(i);
		     }
		}
		catch (Exception e) {
			test.log(Status.FAIL, "Test Execution is Failed ");
		}
		
	}
}

