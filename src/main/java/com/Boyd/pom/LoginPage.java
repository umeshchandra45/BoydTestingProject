package com.Boyd.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Boyd.Exceptions.DriverNotCreatedException;
import com.Boyd.base.BasePOM;
import com.Boyd.utils.WaitMethods;

public class LoginPage extends BasePOM {

	@FindBy(id="userid")
	WebElement input_user;
	
	@FindBy(id="password")
	WebElement input_password;
	
	@FindBy(id="btnActive")
	WebElement button_signIn;
	
	@FindBy(xpath="//a[text()='You have a new home page!']")
	WebElement text_homePage;
	 
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	public void enterUsername(String userName)
	{
		wait.waitUntilElementClickable(input_user, driver, 30);
		input_user.sendKeys(userName);
	}
	public void enterPassword(String password)
	{
		wait.waitUntilElementClickable(input_password, driver, 30);
		input_password.sendKeys(password);
	}
	public void clickOnSignIn()
	{
		wait.waitUntilElementClickable(button_signIn, driver, 30);
	}
	public void clickOnHomePage()
	{
		wait.waitUntilElementClickable(text_homePage, driver, 30);
		
	}

}
