package com.Boyd.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class WaitMethods {
	private WebDriver driver;
	private WebDriverWait wait;
	public static int timeout = 50;
	
    public WaitMethods(WebDriver driver) {
        this.driver = driver;
    }
	
	
	 public  void waitUntilElementClickable(final WebElement elementToWaitFor, WebDriver driver,int timeout) {
		    wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		    wait.until(new Function<WebDriver, Boolean>() {
		          int j;
		          
		          public Boolean apply(WebDriver driver) {
		            this.j++;
		            if (elementToWaitFor.isEnabled())
		              try {
		                elementToWaitFor.click();
		              } catch (Exception e) {
		                return Boolean.valueOf(false);
		              }  
		            return Boolean.valueOf(true);
		          }
		        });
		  }
		  
	  public  void WaituntilElementwritable(final WebElement elementToWaitFor,
				WebDriver driver, final String value) {

			wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(new Function<WebDriver, Boolean>() {
				int j;

				public Boolean apply(WebDriver driver) {
					j++;
					if (elementToWaitFor.isEnabled()) {
						try {
							elementToWaitFor.sendKeys(value);

						} catch (Exception e) {
							return false;

						}

					}
					return true;

				}
			});

		}
		  
	  public void waitForElementToBeEnabled(WebElement elementToWaitFor, WebDriver driver, int timeoutInSeconds) {
		    wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		    wait.until(ExpectedConditions.elementToBeClickable(elementToWaitFor));
		}
}
