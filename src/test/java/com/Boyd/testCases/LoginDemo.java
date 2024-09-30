package com.Boyd.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Boyd.base.TestBase;
import com.aventstack.extentreports.Status;

public class LoginDemo extends TestBase {
	//WebDriver driver;
	@Test
	public void login() throws Exception {
		  WebDriver driver=getDriver();
		  navigationsPom.navigatingToOrderManagement();
		  Thread.sleep(16000);
		  driver.findElement(By.xpath("//span[text()='Create Order']")).click();
		System.out.println("login complete");
	//	test.log(Status.PASS, "Login Sucessfull");
	}
}
