package com.Boyd.pom;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Boyd.base.BasePOM;
import com.Boyd.utils.ExcelOperations;
import com.aventstack.extentreports.Status;

public class SchedulingSalesOrderPOM extends BasePOM {

    @FindBy(linkText = "Tasks")
    WebElement icon_Task;

    @FindBy(xpath = "//td[text()='Manage Fulfillment Lines']")
    WebElement text_ManageFulfillmentLinesw;

    @FindBy(xpath = "//*[contains(@id,'value20::content')]")
    WebElement input_Order;

    @FindBy(xpath = "//*[contains(@id,'operator2::content')]")
    WebElement select_Order;

    @FindBy(xpath = "//*[contains(@id,'value30::content')]")
    WebElement input_Fullfillmentline;

    @FindBy(xpath = "//*[contains(@id,'value50::content')]")
    WebElement input_ItemNumber;

    @FindBy(xpath = "//button[text()='Sea' and //span[text()='r']]")
    WebElement button_Search;

    @FindBy(xpath = "//*[contains(@id,'ATt1::db')]/table/tbody/tr/td[1]")
    WebElement table_orderlines;

    @FindBy(xpath = "//*[contains(@id,'edit::icon')]")
    WebElement button_Edit;

    @FindBy(xpath = "//*[contains(@id,'qryId1:value00::content')]")
    WebElement input_customerName;

    @FindBy(xpath = "//*[contains(@id,'qryId1::search')]")
    WebElement button_customerSearch;

    @FindBy(xpath = "//*[contains(@id,'resId1::db')]/table/tbody/tr/td[1]")
    WebElement table_customer;

    @FindBy(xpath = "//*[contains(@id,'partyNameId::lovDialogId::ok')]")
    WebElement button_OkCustomer;

    @FindBy(xpath = "//*[contains(@id,'overrideScheduleDate::content')]")
    WebElement select_overSchedule;

    @FindBy(xpath = "//*[contains(@id,'id1::content')]")
    WebElement input_date;

    @FindBy(xpath = "//*[text()='ave and Close']")
    WebElement button_SaveAndClose;

    @FindBy(xpath = "//*[contains(@id,'FulSAP:AT1:d9::ok')]")
    WebElement button_OK;

    @FindBy(xpath = "//button[text()='Refresh']")
    WebElement button_Refresh;

    @FindBy(id = "d1::msgDlg::cancel")
    WebElement button_Ok2;

    @FindBy(xpath = "//*[contains(@id,'FulSAP:cb1')]")
    WebElement button_done;

    @FindBy(xpath = "//button[text()='ancel']")
    WebElement button_cancel;

    private ExcelOperations excelOperations;
    public ExcelOperations getExcelOperations() {
        return excelOperations;
    }

    public SchedulingSalesOrderPOM(WebDriver driver, String filePath, String sheetName) {
        super(driver);
        this.excelOperations = new ExcelOperations(filePath, sheetName);
        PageFactory.initElements(driver, this);
    }

    public void clickOnTasks() {
        wait.waitUntilElementClickable(icon_Task, driver, 30);
    }

    public void clickManageFullfillmentlines() {
        wait.waitUntilElementClickable(text_ManageFulfillmentLinesw, driver, 30);
    }

    public void enterOrderNumber(String orderNumber) {
        wait.waitUntilElementClickable(input_Order, driver, 30);
        input_Order.clear();
        wait.WaituntilElementwritable(input_Order, driver, orderNumber);
    }

    public void selectOrderType() {
        wait.waitForElementToBeEnabled(select_Order, driver, 30);
        cm.SelectDropDown(select_Order, "Equals");
    }

    public void enterFullfillmentLineNumber(String fullfillmentLinenumber) {
        wait.waitUntilElementClickable(input_Fullfillmentline, driver, 30);
        input_Fullfillmentline.clear();
        wait.WaituntilElementwritable(input_Fullfillmentline, driver, fullfillmentLinenumber);
    }

    public void enterItemNumber(String item) {
        wait.waitUntilElementClickable(input_ItemNumber, driver, 30);
        input_ItemNumber.clear();
        wait.WaituntilElementwritable(input_ItemNumber, driver, item);
    }

    public void clickOnSearch() {
        wait.waitUntilElementClickable(button_Search, driver, 30);
    }

    public void clickOnOrderLine() {
        wait.waitUntilElementClickable(table_orderlines, driver, 30);
    }

    public void clickOnEditButton() {
        wait.waitUntilElementClickable(button_Edit, driver, 30);
    }

    public void selectOveride() {
        wait.waitForElementToBeEnabled(select_overSchedule, driver, 30);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", select_overSchedule);
        cm.SelectDropDown(select_overSchedule, "Yes");
    }

    public void enterSchedulingDate(String date) {
        wait.waitUntilElementClickable(input_date, driver, 30);
        input_date.clear();
        wait.WaituntilElementwritable(input_date, driver, date);
    }

    public void clickOnSaveAndClose() {
        wait.waitUntilElementClickable(button_SaveAndClose, driver, 30);
    }

    public void clickOnOK() {
        wait.waitUntilElementClickable(button_OK, driver, 30);
    }

    public void clickOnRefresh() {
        wait.waitUntilElementClickable(button_Refresh, driver, 30);
    }

    public void clickOnOk2() {
        wait.waitUntilElementClickable(button_Ok2, driver, 30);
    }

    public void clickOnDone() {
        wait.waitUntilElementClickable(button_done, driver, 30);
    }

    public void clickOnCancel() {
        wait.waitUntilElementClickable(button_cancel, driver, 30);
    }

    public void enterSchedulingSalesorderData(int rowNumber) {
        HashMap<String, String> testdata = excelOperations.readRow(rowNumber);
        
        logger.info("Entering scheduling data for sales order at row number: " + rowNumber);

        clickOnTasks();
        clickManageFullfillmentlines();
        selectOrderType();
        
        logger.info("Entering order number: " + testdata.get("order"));
        test.log(Status.INFO, "Entering order number: "+ testdata.get("order"));
        enterOrderNumber(testdata.get("order"));
        
        logger.info("Entering fulfillment line number: " + testdata.get("Fulfillment_Number"));
        enterFullfillmentLineNumber(testdata.get("Fulfillment_Number"));
        enterItemNumber(testdata.get("Item_Number"));
        clickOnSearch();
        
        try {
            clickOnOrderLine();
            clickOnEditButton();
            selectOveride();
            Thread.sleep(4000);
            enterSchedulingDate(testdata.get("SSD_Update"));
            clickOnSaveAndClose();
            
            try {
                clickOnOK();
                excelOperations.writeResult(rowNumber, "Result", "Pass");
                logger.info("Test passed for row: " + rowNumber);
                test.log(Status.INFO, "scheduled sales order");
            } catch (Exception e) {
                clickOnOk2();
                clickOnCancel();
                excelOperations.writeResult(rowNumber, "Result", "Fail");
                excelOperations.writeResult(rowNumber, "comments", "date format is wrong");
                logger.error("Date format issue for row: " + rowNumber, e);
                test.log(Status.FAIL, "date format is wrong");
            }
            
            clickOnDone();
        } catch (Exception e) {
            try {
                clickOnOk2();
                clickOnDone();
                excelOperations.writeResult(rowNumber, "Result", "Fail");
                excelOperations.writeResult(rowNumber, "comments", "no data found");
                logger.error("No data found for row: " + rowNumber, e);
                test.log(Status.FAIL, "no data found");
            } catch (Exception e2) {
                clickOnDone();
                excelOperations.writeResult(rowNumber, "Result", "Fail");
                excelOperations.writeResult(rowNumber, "comments", "no data found");
                logger.error("No data found for row: " + rowNumber, e2);
                test.log(Status.FAIL, "no data found");
            }
        }
    }
    

}
