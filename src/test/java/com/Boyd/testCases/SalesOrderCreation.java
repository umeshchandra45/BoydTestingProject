package com.Boyd.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Boyd.base.TestBase;
import com.Boyd.pom.SalesOrderCreationPOM;
import com.aventstack.extentreports.Status;

public class SalesOrderCreation extends TestBase {

	@Test
	public void salesOrderCreation() {
		WebDriver driver=getDriver();
		try {
		navigationsPom.navigatingToOrderManagement();
		test.log(Status.INFO, "Test Execution is started ");
		String filePath = System.getProperty("user.dir") + "\\Excel\\BOYD_O2C_Sales_Order_Creation1.xlsx";
		SalesOrderCreationPOM pom=new SalesOrderCreationPOM(driver, filePath, "Salesordercreation");
		   for(int i=1;i< pom.getExcelOperations().getRowCount(); i++) {
		    	 pom.enterSalesorderData(i);
		     }
		}
		catch (Exception e) {
			test.log(Status.FAIL, "Test Execution is Failed ");
		
		}
		
	}
}
