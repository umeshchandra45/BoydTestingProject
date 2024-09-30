package com.Boyd.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Boyd.Exceptions.DriverNotCreatedException;
import com.Boyd.base.BasePOM;
import com.Boyd.utils.WaitMethods;
import com.aventstack.extentreports.Status;

public class NavigationsPom extends BasePOM {
	
	//private WebDriver driver;
	//WaitMethods wait;
	@FindBy(linkText="Supply C hain Execution")
	WebElement text_SupplyChainExecution;
	
	@FindBy(linkText="Inventory Management")
	WebElement InventoryManagement;
	
	@FindBy(xpath="//*[text()='Order Management']")
	WebElement text_OrderManagement;
	
	@FindBy(xpath="(//a[text()='Order Management'])[2]")
	WebElement text_OrderManagement2;
	
	public NavigationsPom(WebDriver driver) {
    super(driver);
	}
	public void navigatingToOrderManagement() {
		wait.waitUntilElementClickable(text_OrderManagement, driver, 30);
		wait.waitUntilElementClickable(text_OrderManagement2, driver, 30);
	//	test.log(Status.PASS, "Navigated to order management");
	}
	public void navigatingToInventory() {
		wait.waitUntilElementClickable(text_SupplyChainExecution, driver, 30);
		wait.waitUntilElementClickable(InventoryManagement, driver, 30);
	}
}
