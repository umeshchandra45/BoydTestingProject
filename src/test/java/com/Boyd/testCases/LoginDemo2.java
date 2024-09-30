package com.Boyd.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Boyd.base.TestBase;

public class LoginDemo2 extends TestBase{
	@Test
	public void login() throws Exception {
		  WebDriver driver=getDriver();
		  navigationsPom.navigatingToInventory();
		  Thread.sleep(16000);
		 // driver.findElement(By.xpath("//span[text()='Create Order']")).click();
		System.out.println("login complete");
	}
}
