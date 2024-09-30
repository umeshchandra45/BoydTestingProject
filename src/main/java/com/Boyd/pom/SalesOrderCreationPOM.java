package com.Boyd.pom;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Boyd.base.BasePOM;
import com.Boyd.utils.ExcelOperations;
import com.aventstack.extentreports.Status;

public class SalesOrderCreationPOM extends BasePOM{
	

	@FindBy(xpath="//span[text()='Create Order']")
	WebElement button_Create;
	
	@FindBy(xpath="//select[contains(@id, 'soc3::content')]")
	WebElement select_BussinessUnit;
	
	@FindBy(xpath="//*[contains(@id,'partyNameId::lovIconId')]")
	WebElement dropdown_customer;
	
	@FindBy(linkText="Search...")
	WebElement icon_search;
	
	@FindBy(xpath="//*[contains(@id,'qryId1:value00::content')]")
	WebElement input_customerName;
	
	@FindBy(xpath="//*[contains(@id,'qryId1::search')]")
	WebElement button_customerSearch;
    
	@FindBy(xpath="//*[contains(@id,'resId1::db')]/table/tbody/tr/td[1]")
	WebElement table_customer;
	
	@FindBy(xpath="//*[contains(@id,'partyNameId::lovDialogId::ok')]")
	WebElement button_OkCustomer;
	
	@FindBy(xpath="//*[contains(@id,'it1::content')]")
	WebElement input_purchase;
	
	@FindBy(xpath="//*[contains(@id,'orderType1Id::lovIconId')]")
	WebElement dropdown_ordertype;
	
	@FindBy(xpath="//*[contains(@id,'orderType1Id::_afrLovInternalQueryId:value00::content')]")
	WebElement input_orderType;
	
	@FindBy(xpath="//*[contains(@id,'orderType1Id::_afrLovInternalQueryId::search')]")
	WebElement button_orderTypeSearch;
    
	@FindBy(xpath="//*[contains(@id,'orderType1Id_afrLovInternalTableId::db')]/table/tbody/tr/td[1]")
	WebElement table_orderType;
	
	@FindBy(xpath="//*[contains(@id,'orderType1Id::lovDialogId::ok')]")
	WebElement button_OkOrderType;
	
	@FindBy(xpath="//*[contains(@id,'soldToPartyContactNameId::content')]")
	WebElement input_contact;
	
	@FindBy(xpath="//*[contains(@id,'soldToPartyContactPointId::content')]")
	WebElement input_ContactMethod;
	
	@FindBy(xpath="//*[contains(@id,'soldToPartyContactPointId::dropdownPopup::dropDownContent::db')]/table/tbody/tr[2]/td[2]/span")
	WebElement table_ContactMethod;
	
	
	@FindBy(xpath="//*[contains(@id,'shipToAddress::lovIconId')]")
	WebElement dropdown_ShipToAddress;
	
	@FindBy(xpath="//*[contains(@id,'qryId2:value00::content')]")
	WebElement input_NameShipToAddress;
	
	@FindBy(xpath="//*[contains(@id,'qryId2::search')]")
	WebElement button_SearchShipToAddress;
    
	@FindBy(xpath="//*[contains(@id,'resId4::db')]/table/tbody/tr/td[1]")
	WebElement table_ShipToAddress;
	
	@FindBy(xpath="//*[contains(@id,'shipToAddress::lovDialogId::ok')]")
	WebElement button_OkShipToAddress;
	
	@FindBy(xpath="//*[contains(@id,'billToPartyNameId::lovIconId')]")
	WebElement dropdown_billToCustomer;
	
	@FindBy(xpath="//*[contains(@id,'btpQry:value00::content')]")
	WebElement input_NamebillToCustomer;
	
	@FindBy(xpath="//*[contains(@id,'btpQry::search')]")
	WebElement button_SearchbillToCustomer;
    
	@FindBy(xpath="//*[contains(@id,'btpTbl::db')]/table/tbody/tr/td[1]")
	WebElement table_billToCustomer;
	
	@FindBy(xpath="//*[contains(@id,'billToPartyNameId::lovDialogId::ok')]")
	WebElement button_OkbillToCustomer;
	
	@FindBy(xpath="//*[contains(@id,'sdi3::icon')]")
	WebElement icon_billingAndPaymentDetails;
	
	@FindBy(xpath="//*[contains(@id,'billToLocation::lovIconId')]")
	WebElement dropdown_billToAddress;
	
	@FindBy(xpath="//*[contains(@id,'qryId2:value00::content')]")
	WebElement input_NamebillToAddress;
	
	@FindBy(xpath="//*[contains(@id,'qryId2::search')]")
	WebElement button_SearchbillToAddress;
    
	@FindBy(xpath="//*[contains(@id,'resId2::db')]/table/tbody/tr/td[1]")
	WebElement table_billTobillToAddress;
	
	@FindBy(xpath="//*[contains(@id,'billToLocation::lovDialogId::ok')]")
	WebElement button_OkbillToAddress;
	
	@FindBy(xpath="//*[contains(@id,'billToContact::content')]")
	WebElement input_billToContact;
	
	@FindBy(xpath="//*[contains(@id,'paymentTermId::content')]")
	WebElement select_paymentTerms;
	
	@FindBy(xpath="//*[contains(@id,'sdi1::icon')]")
	WebElement Icon_Lines;
	
	@FindBy(xpath="(//a[text()='Actions'])[1]")
	WebElement text_headerActions;
	
	@FindBy(xpath="//td[text()='Manage Attachments']")
	WebElement td_ManageAttachments;
	
	@FindBy(xpath="//*[contains(@id,'applicationsTable:_ATp:create::icon')]")
	WebElement icon_ManageAttachments;
	
	@FindBy(xpath="//*[contains(@id,'applicationsTable:_ATp:attachmentTable::db')]/table/tbody/tr/td[1]")
	WebElement table1_ManageAttachments;
	
	@FindBy(xpath="//*[contains(@id,'applicationsTable:_ATp:attachmentTable:0:dCode::content')]")
	WebElement select_ManageAttachments;
	
	@FindBy(xpath="//*[contains(@id,'manageHeaderAttachmentsDialog::ok')]")
	WebElement button_OkManageAttachments;
	
	@FindBy(xpath = "//td[text()='Edit Additional Information']")
    WebElement editAdditionalInfo;

    @FindBy(xpath = "//*[contains(@id,'CTXRNj_HeaderEffDooHeadersAddInfoprivateVOAdditional__Header__Information:0:endCustomerName_Display::lovIconId')]")
    WebElement dropdownEndCustomer;

    @FindBy(linkText = "Search...")
    WebElement ddsearch;

    @FindBy(xpath = "//*[contains(@id,'CTXRNj_HeaderEffDooHeadersAddInfoprivateVOAdditional__Header__Information:0:endCustomerName_Display::_afrLovInternalQueryId:value00::content')]")
    WebElement valueField;

    @FindBy(xpath = "//button[text()='Search']")
    WebElement searchButton;

    @FindBy(xpath = "//*[contains(@id,'CTXRNj_HeaderEffDooHeadersAddInfoprivateVOAdditional__Header__Information:0:endCustomerName_Display_afrLovInternalTableId::db')]/table/tbody/tr/td[1]")
    WebElement tableEntry;

    @FindBy(xpath = "//*[contains(@id,'CTXRNj_HeaderEffDooHeadersAddInfoprivateVOAdditional__Header__Information:0:endCustomerName_Display::lovDialogId::ok')]")
    WebElement okButton;
    
    @FindBy(xpath = "//*[contains(@id,'salesOrderAcknowledgementRequi::lovIconId')]")
    WebElement ackpopup;

    @FindBy(linkText = "Search...")
    WebElement acksearch;

    @FindBy(xpath = "//*[contains(@id,'salesOrderAcknowledgementRequi::_afrLovInternalQueryId:value00::content')]")
    WebElement ackvalue;

    @FindBy(xpath = "//*[contains(@id,'salesOrderAcknowledgementRequi::_afrLovInternalQueryId::search')]")
    WebElement ackSearchButton;

    @FindBy(xpath = "//*[contains(@id,'salesOrderAcknowledgementRequi_afrLovInternalTableId::db')]/table/tbody/tr/td[1]")
    WebElement acktable;

    @FindBy(xpath = "//*[contains(@id,'salesOrderAcknowledgementRequi::lovDialogId::ok')]")
    WebElement ackOkButton;

    // Elements for additional fields
    @FindBy(xpath = "//*[contains(@id,'headerNotes::content')]")
    WebElement headerNotesField;

    @FindBy(xpath = "//*[contains(@id,'qualityRating::content')]")
    WebElement qualityRatingField;

    @FindBy(xpath = "//*[contains(@id,'bde_Display::content')]")
    WebElement bdeField;

    @FindBy(xpath = "//*[contains(@id,'dpasAgency::content')]")
    WebElement dpasAgencyField;

    @FindBy(xpath = "//*[contains(@id,'dpasProgramId::content')]")
    WebElement dpasProgramIdField;

    @FindBy(xpath = "//*[contains(@id,'dpasRating::content')]")
    WebElement dpasRatingField;

    @FindBy(xpath = "//*[contains(@id,'governmentContract::content')]")
    WebElement governmentContractField;

    @FindBy(xpath = "//*[contains(@id,'itarRestricted::content')]")
    WebElement itarRestrictedCheckbox;

    @FindBy(xpath = "//*[contains(@id,'exportLicenseReqd_Display::content')]")
    WebElement exportLicenseReqdField;

    @FindBy(xpath = "//*[contains(@id,'CTXRNj_HeaderEffDooHeadersAddInfoprivateVORegulatory:0:fars::content')]")
    WebElement farsCheckbox;

    @FindBy(xpath = "//*[contains(@id,'CTXRNj_HeaderEffDooHeadersAddInfoprivateVORegulatory:0:dfars::content')]")
    WebElement dfarsCheckbox;

    @FindBy(xpath = "//*[contains(@id,'groupEngProd::content')]")
    WebElement groupField;

    @FindBy(xpath = "//*[contains(@id,'region::content')]")
    WebElement regionField;

    @FindBy(xpath = "//*[contains(@id,'region2::content')]")
    WebElement region2Field;
    
    @FindBy(xpath = "//*[contains(@id,'subEndCustomer_Display::lovIconId')]")
    WebElement subEndCustomerIcon;

    @FindBy(linkText = "Search...")
    WebElement subEndCustomerSearch;

    @FindBy(xpath = "//*[contains(@id,'subEndCustomer_Display::_afrLovInternalQueryId:value00::content')]")
    WebElement subEndCustomerValue;

    @FindBy(xpath = "//*[contains(@id,'subEndCustomer_Display::_afrLovInternalQueryId::search')]")
    WebElement subEndCustomerSearchButton;

    @FindBy(xpath = "//*[contains(@id,'subEndCustomer_Display_afrLovInternalTableId::db')]/table/tbody/tr/td[1]")
    WebElement subEndCustomerTable;

    @FindBy(xpath = "//*[contains(@id,'subEndCustomer_Display::lovDialogId::ok')]")
    WebElement subEndCustomerOkButton;

    @FindBy(xpath = "//*[contains(@id,'PricingSubEndCustomer_Display::lovIconId')]")
    WebElement pricingSubEndCustomerIcon;

    @FindBy(linkText = "Search...")
    WebElement pricingSubEndCustomerSearch;

    @FindBy(xpath = "//*[contains(@id,'PricingSubEndCustomer_Display::_afrLovInternalQueryId:value00::content')]")
    WebElement pricingSubEndCustomerValue;

    @FindBy(xpath = "//*[contains(@id,'PricingSubEndCustomer_Display::_afrLovInternalQueryId::search')]")
    WebElement pricingSubEndCustomerSearchButton;

    @FindBy(xpath = "//*[contains(@id,'PricingSubEndCustomer_Display_afrLovInternalTableId::db')]/table/tbody/tr/td[1]")
    WebElement pricingSubEndCustomerTable;

    @FindBy(xpath = "//*[contains(@id,'PricingSubEndCustomer_Display::lovDialogId::ok')]")
    WebElement pricingSubEndCustomerOkButton;

    @FindBy(xpath = "//*[contains(@id,'shipToContactNameId::content')]")
    WebElement shipToContact;

    @FindBy(xpath = "//*[contains(@id,'shipMethodId::content')]")
    WebElement shippingMethod;

    @FindBy(xpath = "//*[contains(@id,'id1::content')]")
    WebElement requestedDateHeader;

    @FindBy(xpath = "//*[contains(@id,'soc1::content')]")
    WebElement requestTypeHeader;

    @FindBy(linkText = "Shipping")
    WebElement shippingTab;

    @FindBy(xpath = "//*[contains(@id,'AP1:r5:0:soc3::content')]")
    WebElement fobDropdown;

    @FindBy(xpath = "//*[contains(@id,'AP1:r5:0:soc4::content')]")
    WebElement freightTermsDropdown;

    @FindBy(xpath = "//*[contains(@id,'warehouseNameId::content')]")
    WebElement warehouse;

    @FindBy(xpath = "//*[contains(@id,'supplierNameId::content')]")
    WebElement supplier;

    @FindBy(xpath = "//*[contains(@id,'AP1:r5:0:soc6::content')]")
    WebElement demandClassDropdown;

    @FindBy(xpath = "//*[contains(@id,'AP1:r5:0:soc7::content')]")
    WebElement allowPartialsDropdown;
    
    @FindBy(xpath = "//*[contains(@id,'dEffAttr::ok')]")
    private WebElement effectiveAttributeOkButton;

    @FindBy(xpath = "//*[contains(@id,'sdi2::icon')]")
    private WebElement secondIcon;
    
    @FindBy(xpath = "//*[contains(@id,'AP1:sdi1::icon')]")
    private WebElement icon_SDI1;
    
    @FindBy(xpath="//img[contains(@id, 'searchIcoId::icon')]")
    WebElement searchIcon;

    @FindBy(xpath="//*[contains(@id,'Advan1:0:efqrp::mode')]")
    WebElement advance;

    @FindBy(xpath="//*[contains(@id,'efqrp:operator0::content')]")
    WebElement operatorSelect;

    @FindBy(xpath="//*[contains(@id,'Advan1:0:efqrp:value00::content')]")
    WebElement itemValueInput;

    @FindBy(xpath="//*[contains(@id,'Advan1:0:efqrp::search')]")
    WebElement itemsearchButton;

    @FindBy(xpath="//*[contains(@id,'rstab:_ATp:table1::db')]/table/tbody/tr/td[1]")
    WebElement itemTable;

    @FindBy(xpath="//*[contains(@id,'itemNumberId2:cb1')]")
    WebElement itemok;

    @FindBy(xpath="//span[text()='Add']")
    WebElement addButton;


    @FindBy(xpath = "//*[contains(@id,'soc2::content')]")
    WebElement adjustmentTypeDropdown;

    @FindBy(xpath = "//*[contains(@id,'it2::content')]")
    WebElement unitSellingPriceInput;

    @FindBy(xpath = "//*[contains(@id,'soc1::content')]")
    WebElement reasonDropdown;

    @FindBy(xpath = "(//*[text()='ave and Close'])[2]")
    WebElement saveAndCloseButton;


    @FindBy(xpath="//*[text()='item']/../../../../../../../../../../../../../../..//*[contains(@id,'gearIconCreate')]")
    WebElement actElement;

    @FindBy(xpath="(//td[text()='Edit Additional Information'])[2]")
    WebElement editAdditionalInfo2;

    @FindBy(xpath="(//td[text()='Edit Additional Information'])[3]")
    WebElement editAdditionalInfoAlternate;

    @FindBy(xpath="//*[contains(@id,'rePromiseDate::content')]")
    WebElement promiseDateInput;

    @FindBy(xpath="//*[contains(@id,'vantageScheduledShipDate::content')]")
    WebElement scheduledShipDateInput;

    @FindBy(xpath="//*[contains(@id,'customerCatalogCrossReference_Display::content')]")
    WebElement customerCatalogCrossReferenceInput;

    @FindBy(xpath="//*[contains(@id,'additionalNotes::content')]")
    WebElement additionalNotesInput;

    @FindBy(xpath="//*[contains(@id,'mpn::content')]")
    WebElement mpnInput;

    @FindBy(xpath="//*[contains(@id,'internalItem::content')]")
    WebElement internalItemInput;

    @FindBy(xpath="//*[contains(@id,'custSrcInspec::content')]")
    WebElement custSrcInspecCheckbox;

    @FindBy(xpath="//*[contains(@id,'govtSrcInspec::content')]")
    WebElement govtSrcInspecCheckbox;

    @FindBy(xpath="//*[contains(@id,'fai::content')]")
    WebElement faiCheckbox;

    @FindBy(xpath="//*[contains(@id,'materialCerts::content')]")
    WebElement materialCertsCheckbox;

    @FindBy(xpath="//*[contains(@id,'testReports::content')]")
    WebElement testReportsCheckbox;

    @FindBy(xpath="//*[contains(@id,'dimensionalInspection::content')]")
    WebElement dimensionalInspectionCheckbox;

    @FindBy(xpath="//*[contains(@id,'a81303FaaForm::content')]")
    WebElement faaFormCheckbox;

    @FindBy(linkText="Trading Partner Attributes")
    WebElement tradingPartnerAttributesLink;

    @FindBy(xpath="//*[contains(@id,'subIndustrySegment_Display::lovIconId')]")
    WebElement subIndustrySegmentIcon;

    @FindBy(linkText="Search...")
    WebElement searchLink;

    @FindBy(xpath="//*[contains(@id,'subIndustrySegment_Display::_afrLovInternalQueryId:value00::content')]")
    WebElement subIndustrySegmentInput;

    @FindBy(xpath="//*[contains(@id,'subIndustrySegment_Display::_afrLovInternalQueryId::search')]")
    WebElement subIndustrySegmentSearchButton;

    @FindBy(xpath="//*[contains(@id,'subIndustrySegment_Display_afrLovInternalTableId::db')]/table/tbody/tr/td[1]")
    WebElement subIndustrySegmentTable;

    @FindBy(xpath="//*[contains(@id,'subIndustrySegment_Display::lovDialogId::ok')]")
    WebElement subIndustrySegmentOkButton;

    @FindBy(xpath="//*[contains(@id,'program_Display::lovIconId')]")
    WebElement programIcon;

    @FindBy(xpath="//*[contains(@id,'program_Display::_afrLovInternalQueryId:value00::content')]")
    WebElement programInput;

    @FindBy(xpath="//*[contains(@id,'program_Display::_afrLovInternalQueryId::search')]")
    WebElement programSearchButton;

    @FindBy(xpath="//*[contains(@id,'program_Display_afrLovInternalTableId::db')]/table/tbody/tr/td[1]")
    WebElement programTable;

    @FindBy(xpath="//*[contains(@id,'program_Display::lovDialogId::ok')]")
    WebElement programOkButton;

    @FindBy(xpath="//*[contains(@id,'platform_Display::lovIconId')]")
    WebElement platformIcon;

    @FindBy(xpath="//*[contains(@id,'platform_Display::_afrLovInternalQueryId:value00::content')]")
    WebElement platformInput;

    @FindBy(xpath="//*[contains(@id,'platform_Display::_afrLovInternalQueryId::search')]")
    WebElement platformSearchButton;

    @FindBy(xpath="//*[contains(@id,'platform_Display_afrLovInternalTableId::db')]/table/tbody/tr/td[1]")
    WebElement platformTable;

    @FindBy(xpath="//*[contains(@id,'platform_Display::lovDialogId::ok')]")
    WebElement platformOkButton;

    @FindBy(xpath="//*[contains(@id,'tradingPartnerItem_Display::lovIconId')]")
    WebElement tradingPartnerItemIcon;

    @FindBy(xpath="//*[contains(@id,'tradingPartnerItem_Display::_afrLovInternalQueryId:value00::content')]")
    WebElement tradingPartnerItemInput;

    @FindBy(xpath="//*[contains(@id,'tradingPartnerItem_Display::_afrLovInternalQueryId::search')]")
    WebElement tradingPartnerItemSearchButton;

    @FindBy(xpath="//*[contains(@id,'tradingPartnerItem_Display_afrLovInternalTableId::db')]/table/tbody/tr/td[2]")
    WebElement tradingPartnerItemTable;

    @FindBy(xpath="//*[contains(@id,'tradingPartnerItem_Display::lovDialogId::ok')]")
    WebElement tradingPartnerItemOkButton;

    @FindBy(xpath="//*[contains(@id,'dEffAttr::ok')]")
    WebElement okButton2;

    @FindBy(xpath="//*[contains(@id,'AP1:pc1:t1:0:pspnlinecombo::lovIconId')]")
    WebElement primarySalespersonIcon;

    @FindBy(xpath="//*[contains(@id,'AP1:pc1:t1:0:qryId6:value00::content')]")
    WebElement primarySalespersonInput;

    @FindBy(xpath="//*[contains(@id,'AP1:pc1:t1:0:qryId6::search')]")
    WebElement primarySalespersonSearchButton;

    @FindBy(xpath="//*[contains(@id,':AP1:pc1:t1:0:resId8::db')]//table/tbody/tr/td[1]")
    WebElement primarySalespersonTable;

    @FindBy(xpath="//*[contains(@id,'AP1:pc1:t1:0:pspnlinecombo::lovDialogId::ok')]")
    WebElement primarySalespersonOkButton;

    @FindBy(xpath="//*[contains(@id,'AP1:primarySalesPersonNameId::lovIconId')]")
    WebElement primarySalespersonIcon2;

    @FindBy(xpath="//*[contains(@id,'AP1:qryId5:value00::content')]")
    WebElement primarySalespersonInput2;

    @FindBy(xpath="//*[contains(@id,'FOTsr1:1:AP1:qryId5::search')]")
    WebElement primarySalespersonSearchButton2;

    @FindBy(xpath="//*[contains(@id,'FOTsr1:1:AP1:resId7::db')]//table/tbody/tr/td[2]")
    WebElement primarySalespersonTable2;

    @FindBy(xpath="//*[contains(@id,'primarySalesPersonNameId::lovDialogId::ok')]")
    WebElement primarySalespersonOkButton2;
    
    @FindBy(xpath = "//*[text()='Save']")
    WebElement saveButton;

    @FindBy(xpath = "//*[contains(@id,'SPph::_afrTtxt')]")
    WebElement statusText;

    @FindBy(xpath = "//span[text()='Submit']")
    WebElement submitButton;

    @FindBy(xpath = "//*[contains(@id,'cb14')]")
    WebElement okButton3;

    @FindBy(xpath = "//*[contains(@id,'APVIEW1:SPb')]")
    WebElement doneButton;

    @FindBy(xpath = "//span[text()='Create Order']")
    WebElement createOrderButton;
    
    public WebElement getTableRowForItem(String item) {
        String dynamicXpath = "//*[text()='" + item + "']";
        return driver.findElement(By.xpath(dynamicXpath));
    }
    
    public WebElement getQuantityInputForItem(String item) {
        String dynamicXpath = "//*[text()='" + item + "']/../../../../../../../../../../../../../../..//input[contains(@id,'lineQuantity::content')]";
        return driver.findElement(By.xpath(dynamicXpath));
    }
    public WebElement getIconForItem(String item) {
        String dynamicXpath = "(//*[text()='" + item + "']/../../../../../../../../../../../../../../..//img[contains(@id,'cil1::icon')])[1]";
        return driver.findElement(By.xpath(dynamicXpath));
    }
    
    public WebElement getGearIconForItem(String item) {
        String dynamicXpath = "//*[text()='" + item + "']/../../../../../../../../../../../../../../..//*[contains(@id,'gearIconCreate')]";
        return driver.findElement(By.xpath(dynamicXpath));
    }
    
    private ExcelOperations excelOperations;
    
    public ExcelOperations getExcelOperations() {
        return excelOperations;
    }
	public SalesOrderCreationPOM(WebDriver driver, String filePath, String sheetName) {
        super(driver);
        this.excelOperations = new ExcelOperations(filePath, sheetName);
    }
	
	public void clickCreateOrder() {
	    wait.waitUntilElementClickable(button_Create, driver, 30);
	    button_Create.click();
	}

	public void selectBusinessUnit(String unit) {
	    wait.waitUntilElementClickable(select_BussinessUnit, driver, 30);
	    Select select = new Select(select_BussinessUnit);
	    select.selectByVisibleText(unit);
	}

	public void selectCustomer(String customerName) {
	    wait.waitUntilElementClickable(dropdown_customer, driver, 30);
	    dropdown_customer.click();
	    wait.waitUntilElementClickable(icon_search, driver, 30);
	    wait.waitUntilElementClickable(input_customerName, driver, 30);
	    input_customerName.clear();
	    wait.WaituntilElementwritable(input_customerName, driver, customerName);
	    button_customerSearch.click();
	    wait.waitUntilElementClickable(table_customer, driver, 30);
	    wait.waitUntilElementClickable(button_OkCustomer, driver, 30);
	}

	public void enterPurchaseOrder(String purchaseOrder) {
	    wait.waitUntilElementClickable(input_purchase, driver, 30);
	    input_purchase.clear();
	    wait.WaituntilElementwritable(input_purchase, driver, purchaseOrder);
	}

	public void selectOrderType(String orderType) {
	    wait.waitUntilElementClickable(dropdown_ordertype, driver, 30);
	    WebElement searchtype = driver.findElement(By.linkText("Search..."));
		wait.waitUntilElementClickable(searchtype, driver, 40);
	    wait.waitUntilElementClickable(input_orderType, driver, 30);
	    input_orderType.clear();
	    wait.WaituntilElementwritable(input_orderType, driver, orderType);
	    wait.waitUntilElementClickable(button_orderTypeSearch, driver, 30);
	    wait.waitUntilElementClickable(table_orderType, driver, 30);
	    wait.waitUntilElementClickable(button_OkOrderType, driver, 30);

	}

	public void enterContact(String contact) {
	    wait.waitUntilElementClickable(input_contact, driver, 30);
	    input_contact.clear();
	    wait.WaituntilElementwritable(input_contact, driver, contact);
	}

	public void selectContactMethod(String method) {
	    wait.waitUntilElementClickable(input_ContactMethod, driver, 30);
	    wait.waitUntilElementClickable(table_ContactMethod, driver, 30);

	}
	public void clickOnicon_billingAndPaymentDetails() {
		wait.waitUntilElementClickable(icon_billingAndPaymentDetails, driver, 30);
	}

	public void selectShipToAddress(String address) {
	    wait.waitUntilElementClickable(dropdown_ShipToAddress, driver, 30);
	    WebElement searchtype = driver.findElement(By.linkText("Search..."));
		wait.waitUntilElementClickable(searchtype, driver, 40);
	    wait.waitUntilElementClickable(input_NameShipToAddress, driver, 30);
	    wait.WaituntilElementwritable(input_NameShipToAddress, driver, address);
	    button_SearchShipToAddress.click();
	    wait.waitUntilElementClickable(table_ShipToAddress, driver, 30);
	    wait.waitUntilElementClickable(button_OkShipToAddress, driver, 30);
	}

	public void selectBillToCustomer(String customerName) {
	    wait.waitUntilElementClickable(dropdown_billToCustomer, driver, 30);
	    WebElement searchtype = driver.findElement(By.linkText("Search..."));
		wait.waitUntilElementClickable(searchtype, driver, 40);
	    wait.waitUntilElementClickable(input_NamebillToCustomer, driver, 30);
	    input_NamebillToCustomer.clear();
	    wait.WaituntilElementwritable(input_NamebillToCustomer, driver, customerName);
	    button_SearchbillToCustomer.click();
	    wait.waitUntilElementClickable(table_billToCustomer, driver, 30);
	    wait.waitUntilElementClickable(button_OkbillToCustomer, driver, 30);
	}

	public void selectBillToAddress(String address) {
	    wait.waitUntilElementClickable(dropdown_billToAddress, driver, 30);
	    WebElement searchtype = driver.findElement(By.linkText("Search..."));
		wait.waitUntilElementClickable(searchtype, driver, 40);
	    wait.waitUntilElementClickable(input_NamebillToAddress, driver, 30);
	    input_NamebillToAddress.clear();
	    wait.WaituntilElementwritable(input_NamebillToAddress, driver, address);
	    button_SearchbillToAddress.click();
	    wait.waitUntilElementClickable(table_billTobillToAddress, driver, 30);
	    wait.waitUntilElementClickable(button_OkbillToAddress, driver, 30);
	}

	public void enterBillToContact(String contact) {
	    wait.waitUntilElementClickable(input_billToContact, driver, 30);
	    input_billToContact.clear();
	    wait.WaituntilElementwritable(input_billToContact, driver, contact);
	}

	public void selectPaymentTerms(String terms) {
	    wait.waitUntilElementClickable(select_paymentTerms, driver, 30);
	    Select select = new Select(select_paymentTerms);
	    select.selectByVisibleText(terms);
	}

	public void clickLinesIcon() {
	    wait.waitUntilElementClickable(Icon_Lines, driver, 30);
	}

	public void clickHeaderActions() {
	    wait.waitUntilElementClickable(text_headerActions, driver, 30);
	}

	public void clickManageAttachments() {
	    wait.waitUntilElementClickable(td_ManageAttachments, driver, 30);
	}

	public void selectManageAttachments() {
	    wait.waitUntilElementClickable(icon_ManageAttachments, driver, 30);
	    wait.waitUntilElementClickable(table1_ManageAttachments, driver, 30);
	    wait.waitUntilElementClickable(select_ManageAttachments, driver, 30);
	    wait.waitUntilElementClickable(button_OkManageAttachments, driver, 30);
	}

	public void clickOneditAdditionalInfo() {
	    wait.waitUntilElementClickable(editAdditionalInfo, driver, 30);
	}

	public void selectEndCustomer(String endCustomerName) {
	    wait.waitUntilElementClickable(dropdownEndCustomer, driver, 30);
	    wait.waitUntilElementClickable(ddsearch, driver, 30);
	    wait.waitUntilElementClickable(valueField, driver, 30);
	    valueField.clear();
	    wait.WaituntilElementwritable(valueField, driver, endCustomerName);
	    searchButton.click();
	    wait.waitUntilElementClickable(tableEntry, driver, 30);
	    wait.waitUntilElementClickable(okButton, driver, 30);
	}

	public void selectAcknowledgement(String acknowledgement) {
	    wait.waitUntilElementClickable(ackpopup, driver, 30);
	    wait.waitUntilElementClickable(acksearch, driver, 30);
	    wait.waitUntilElementClickable(ackvalue, driver, 30);
	    ackvalue.clear();
	    wait.WaituntilElementwritable(ackvalue, driver, acknowledgement);
	    ackSearchButton.click();
	    wait.waitUntilElementClickable(acktable, driver, 30);
	    wait.waitUntilElementClickable(ackOkButton, driver, 30);
	}

	public void enterHeaderNotes(String notes) {
	    wait.waitUntilElementClickable(headerNotesField, driver, 30);
	    headerNotesField.clear();
	    wait.WaituntilElementwritable(headerNotesField, driver, notes);
	}

	public void enterQualityRating(String rating) {
	    wait.waitUntilElementClickable(qualityRatingField, driver, 30);
	    qualityRatingField.clear();
	    wait.WaituntilElementwritable(qualityRatingField, driver, rating);
	}

	public void enterBDE(String bde) {
	    wait.waitUntilElementClickable(bdeField, driver, 30);
	    bdeField.clear();
	    wait.WaituntilElementwritable(bdeField, driver, bde);
	}

	public void enterDPASAgency(String agency) {
	    wait.waitUntilElementClickable(dpasAgencyField, driver, 30);
	    dpasAgencyField.clear();
	    wait.WaituntilElementwritable(dpasAgencyField, driver, agency);
	}

	public void enterDPASProgramId(String programId) {
	    wait.waitUntilElementClickable(dpasProgramIdField, driver, 30);
	    dpasProgramIdField.clear();
	    wait.WaituntilElementwritable(dpasProgramIdField, driver, programId);
	}

	public void enterDPASRating(String rating) {
	    wait.waitUntilElementClickable(dpasRatingField, driver, 30);
	    dpasRatingField.clear();
	    wait.WaituntilElementwritable(dpasRatingField, driver, rating);
	}

	public void enterGovernmentContract(String contract) {
	    wait.waitUntilElementClickable(governmentContractField, driver, 30);
	    governmentContractField.clear();
	    wait.WaituntilElementwritable(governmentContractField, driver, contract);
	}

	public void selectItarRestricted(String restricted) {
	    wait.waitUntilElementClickable(itarRestrictedCheckbox, driver, 30);
	}

	public void enterExportLicenseReqd(String license) {
	    wait.waitUntilElementClickable(exportLicenseReqdField, driver, 30);
	    exportLicenseReqdField.clear();
	    wait.WaituntilElementwritable(exportLicenseReqdField, driver, license);
	}

	public void selectFARS(String fars) {
	    wait.waitUntilElementClickable(farsCheckbox, driver, 30);
	}

	public void selectDFARS(String dfrs) {
	    wait.waitUntilElementClickable(dfarsCheckbox, driver, 30);
	}
	public void enterSubEndCustomer(String subEndCustomer) {
        if (!subEndCustomer.equals("NA")) {
            wait.waitUntilElementClickable(subEndCustomerIcon, driver, 30);
            wait.waitUntilElementClickable(subEndCustomerSearch, driver, 30);
            wait.waitUntilElementClickable(subEndCustomerValue, driver, 30);
            subEndCustomerValue.clear();
            wait.WaituntilElementwritable(subEndCustomerValue, driver, subEndCustomer);
            subEndCustomerSearchButton.click();
            wait.waitUntilElementClickable(subEndCustomerTable, driver, 30);
            subEndCustomerOkButton.click();
        }
    }

    // PricingSubEndCustomer Operations
    public void enterPricingSubEndCustomer(String pricingSubEndCustomer) {
        if (!pricingSubEndCustomer.equals("NA")) {
            wait.waitUntilElementClickable(pricingSubEndCustomerIcon, driver, 30);
            wait.waitUntilElementClickable(pricingSubEndCustomerSearch, driver, 30);
            wait.waitUntilElementClickable(pricingSubEndCustomerValue, driver, 30);
            pricingSubEndCustomerValue.clear();
            wait.WaituntilElementwritable(pricingSubEndCustomerValue, driver, pricingSubEndCustomer);
            pricingSubEndCustomerSearchButton.click();
            wait.waitUntilElementClickable(pricingSubEndCustomerTable, driver, 30);
            pricingSubEndCustomerOkButton.click();
        }
    }
    public void clickEffectiveAttributeOkButton() {
        wait.waitUntilElementClickable(effectiveAttributeOkButton, driver, 30);
    }

    public void clickSecondIcon() {
        wait.waitUntilElementClickable(secondIcon, driver, 30);
    }

    // Ship To Contact
    public void enterShipToContact(String shipToContactValue) {
        if (!shipToContactValue.equals("NA")) {
            wait.waitUntilElementClickable(shipToContact, driver, 30);
            shipToContact.clear();
            wait.WaituntilElementwritable(shipToContact, driver, shipToContactValue);
            shipToContact.sendKeys(Keys.ENTER);
        }
    }

    // Shipping Method
    public void enterShippingMethod(String shippingMethodValue) {
        if (!shippingMethodValue.equals("NA")) {
            wait.waitUntilElementClickable(shippingMethod, driver, 30);
            shippingMethod.sendKeys(shippingMethodValue);
        }
    }

    // Requested Date Header
    public void enterRequestedDateHeader(String requestedDate) {
        if (!requestedDate.equals("NA")) {
            wait.waitUntilElementClickable(requestedDateHeader, driver, 30);
            requestedDateHeader.clear();
            requestedDateHeader.sendKeys(requestedDate);
            requestedDateHeader.sendKeys(Keys.ENTER);
        }
    }

    // Request Type Header
    public void selectRequestTypeHeader(String requestType) {
        if (!requestType.equals("NA")) {
            wait.waitUntilElementClickable(requestTypeHeader, driver, 30);
            Select requestTypeSelect = new Select(requestTypeHeader);
            requestTypeSelect.selectByVisibleText(requestType);
        }
    }

    // Shipping Tab
    public void clickShippingTab() {
        wait.waitUntilElementClickable(shippingTab, driver, 30);
    }

    // FOB Dropdown
    public void selectFOB(String fob) {
        if (!fob.equals("NA")) {
            wait.waitUntilElementClickable(fobDropdown, driver, 30);
            Select fobSelect = new Select(fobDropdown);
            fobSelect.selectByVisibleText(fob);
        }
    }

    // Freight Terms
    public void selectFreightTerms(String freightTerms) {
        if (!freightTerms.equals("NA")) {
            wait.waitUntilElementClickable(freightTermsDropdown, driver, 30);
            Select freightTermsSelect = new Select(freightTermsDropdown);
            freightTermsSelect.selectByVisibleText(freightTerms);
        }
    }
    
    // Warehouse
    public void enterWarehouse(String warehouseValue) {
        if (!warehouseValue.equals("NA")) {
        	driver.findElement(By.linkText("Supply")).click();
            wait.waitUntilElementClickable(warehouse, driver, 30);
            wait.WaituntilElementwritable(warehouse, driver, warehouseValue);
        }
    }
    public void selectDemandClass(String demandClass) {
        if (!demandClass.equals("NA")) {
            wait.waitUntilElementClickable(demandClassDropdown, driver, 30);
            Select demandClassSelect = new Select(demandClassDropdown);
            demandClassSelect.selectByVisibleText(demandClass);
        }
    }
    // Supplier
    public void enterSupplier(String supplierValue) {
        if (!supplierValue.equals("NA")) {
            wait.waitUntilElementClickable(supplier, driver, 30);
            supplier.sendKeys(supplierValue);
        }
    }
    public void selectAllowPartials(String allowPartials) {
        if (!allowPartials.equals("NA")) {
            wait.waitUntilElementClickable(allowPartialsDropdown, driver, 30);
            Select allowPartialsSelect = new Select(allowPartialsDropdown);
            allowPartialsSelect.selectByVisibleText(allowPartials);
        }
    }
    public void clickIconSDI1() {
        wait.waitUntilElementClickable(icon_SDI1, driver, 30);
    }
    
    public void searchForItem(String itemNumber) {
        wait.waitUntilElementClickable(searchIcon, driver, 30);  
        wait.waitUntilElementClickable(advance, driver, 30);
        wait.waitUntilElementClickable(operatorSelect, driver, 30);
		Select itemvalue = new Select(operatorSelect);
		itemvalue.selectByVisibleText("Equals");
        wait.WaituntilElementwritable(itemValueInput, driver, itemNumber);
        wait.waitUntilElementClickable(searchButton, driver, 30);
        wait.waitUntilElementClickable(itemTable, driver, 30);
        itemTable.click();
        wait.waitUntilElementClickable(itemok, driver, 30);
    }

    public void addItemToOrder(String itemquantity,String itemNumber) {
    	wait.waitUntilElementClickable(addButton, driver, 30);
    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.stalenessOf(getTableRowForItem(itemNumber)));
        wait.waitUntilElementClickable(getTableRowForItem(itemNumber) , driver, 30);
        wait.waitUntilElementClickable(getQuantityInputForItem(itemNumber) , driver, 30);
        getQuantityInputForItem(itemNumber).clear();
        wait.WaituntilElementwritable(getQuantityInputForItem(itemNumber), driver, itemquantity);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", getIconForItem(itemNumber));
        wait.waitUntilElementClickable(getIconForItem(itemNumber), driver, 30);

    }
    // Select Adjustment Type if not "NA"
    public void selectAdjustmentType(String adjustmentType) {
        if (!adjustmentType.equals("NA")) {
            wait.waitUntilElementClickable(adjustmentTypeDropdown, driver, 40);
            Select typeSelect = new Select(adjustmentTypeDropdown);
            typeSelect.selectByVisibleText(adjustmentType);
        }
    }

    // Enter Unit Selling Price if not "NA"
    public void enterUnitSellingPrice(String unitSellingPrice) {
        if (!unitSellingPrice.equals("NA")) {
            wait.waitUntilElementClickable(unitSellingPriceInput, driver, 40);
            unitSellingPriceInput.clear();
            wait.WaituntilElementwritable(unitSellingPriceInput, driver, unitSellingPrice);
        }
    }

    // Select Reason if not "NA"
    public void selectReason(String reason) {
        if (!reason.equals("NA")) {
            wait.waitUntilElementClickable(reasonDropdown, driver, 40);
            Select reasonSelect = new Select(reasonDropdown);
            reasonSelect.selectByVisibleText(reason);
        }
    }

    // Click Save and Close Button
    public void clickSaveAndClose() {
        wait.waitUntilElementClickable(saveAndCloseButton, driver, 40);
        saveAndCloseButton.click();
    }

    public void fillAdditionalInformation(String item,String promiseDate, String scheduledShipDate, String customerCatalog, String additionalNotes, String mpn, String internalItem) {
    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.stalenessOf(getGearIconForItem(item)));
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", getGearIconForItem(item));
        wait.waitUntilElementClickable(getGearIconForItem(item), driver, 30);
        wait.waitUntilElementClickable(editAdditionalInfo2, driver, 30);
        if (!promiseDate.equals("NA")) {
            wait.WaituntilElementwritable(promiseDateInput, driver, promiseDate);
        }
        
        if (!scheduledShipDate.equals("NA")) {
            wait.WaituntilElementwritable(scheduledShipDateInput, driver, scheduledShipDate);
        }
        
        if (!customerCatalog.equals("NA")) {
            wait.WaituntilElementwritable(customerCatalogCrossReferenceInput, driver, customerCatalog);
        }
        
        if (!additionalNotes.equals("NA")) {
            wait.WaituntilElementwritable(additionalNotesInput, driver, additionalNotes);
        }
        
        if (!mpn.equals("NA")) {
            wait.WaituntilElementwritable(mpnInput, driver, mpn);
        }
        
        if (!internalItem.equals("NA")) {
            wait.WaituntilElementwritable(internalItemInput, driver, internalItem);
        }
    }

    public void handleCheckboxes() {
        wait.waitUntilElementClickable(custSrcInspecCheckbox, driver, 30);
        if (!custSrcInspecCheckbox.isSelected()) {
            custSrcInspecCheckbox.click();
        }
        
        wait.waitUntilElementClickable(govtSrcInspecCheckbox, driver, 30);
        if (!govtSrcInspecCheckbox.isSelected()) {
            govtSrcInspecCheckbox.click();
        }
        
        wait.waitUntilElementClickable(faiCheckbox, driver, 30);
        if (!faiCheckbox.isSelected()) {
            faiCheckbox.click();
        }
        
        wait.waitUntilElementClickable(materialCertsCheckbox, driver, 30);
        if (!materialCertsCheckbox.isSelected()) {
            materialCertsCheckbox.click();
        }
        
        wait.waitUntilElementClickable(testReportsCheckbox, driver, 30);
        if (!testReportsCheckbox.isSelected()) {
            testReportsCheckbox.click();
        }
        
        wait.waitUntilElementClickable(dimensionalInspectionCheckbox, driver, 30);
        if (!dimensionalInspectionCheckbox.isSelected()) {
            dimensionalInspectionCheckbox.click();
        }
        
        wait.waitUntilElementClickable(faaFormCheckbox, driver, 30);
        if (!faaFormCheckbox.isSelected()) {
            faaFormCheckbox.click();
        }
    }

    public void selectTradingPartnerAttributes(String subIndustrySegment, String program, String platform, String tradingPartnerItem) {
        wait.waitUntilElementClickable(tradingPartnerAttributesLink, driver, 30);
        wait.waitUntilElementClickable(subIndustrySegmentIcon, driver, 30);
        wait.waitUntilElementClickable(icon_search, driver, 30);
        wait.WaituntilElementwritable(subIndustrySegmentInput, driver, subIndustrySegment);
        wait.waitUntilElementClickable(subIndustrySegmentSearchButton, driver, 30);
        wait.waitUntilElementClickable(subIndustrySegmentTable, driver, 30);
        wait.waitUntilElementClickable(subIndustrySegmentOkButton, driver, 30);
        wait.waitUntilElementClickable(programIcon, driver, 30);
        wait.waitUntilElementClickable(icon_search, driver, 30);
        wait.WaituntilElementwritable(programInput, driver, program);
        wait.waitUntilElementClickable(programSearchButton, driver, 30);
        wait.waitUntilElementClickable(programTable, driver, 30);
        wait.waitUntilElementClickable(programOkButton, driver, 30);
        wait.waitUntilElementClickable(platformIcon, driver, 30);
        wait.waitUntilElementClickable(icon_search, driver, 30);
        wait.WaituntilElementwritable(platformInput, driver, platform);
        wait.waitUntilElementClickable(platformSearchButton, driver, 30);
        wait.waitUntilElementClickable(platformTable, driver, 30);
        wait.waitUntilElementClickable(platformOkButton, driver, 30);
        wait.waitUntilElementClickable(tradingPartnerItemIcon, driver, 30);
        wait.waitUntilElementClickable(icon_search, driver, 30);
        wait.WaituntilElementwritable(tradingPartnerItemInput, driver, tradingPartnerItem);
        wait.waitUntilElementClickable(tradingPartnerItemSearchButton, driver, 30);
        wait.waitUntilElementClickable(tradingPartnerItemTable, driver, 30);
        wait.waitUntilElementClickable(tradingPartnerItemOkButton, driver, 30);
        wait.waitUntilElementClickable(driver.findElement(By.xpath("//*[contains(@id,'dEffAttr::ok')]")), driver, 30);
    }
    
    public void selectPrimarySalespersonItemLevel(String salesperson) {
        wait.waitUntilElementClickable(primarySalespersonIcon, driver, 30);
        wait.waitUntilElementClickable(icon_search, driver, 30);
        wait.WaituntilElementwritable(primarySalespersonInput, driver, salesperson);
        wait.waitUntilElementClickable(primarySalespersonSearchButton, driver, 30);
        wait.waitUntilElementClickable(primarySalespersonTable, driver, 30);
        wait.waitUntilElementClickable(primarySalespersonOkButton, driver, 30);
    }
    public void selectPrimarySalespersonHeaderLevel(String salesperson) {
        wait.waitUntilElementClickable(primarySalespersonIcon2, driver, 30);
        wait.waitUntilElementClickable(icon_search, driver, 30);
        wait.WaituntilElementwritable(primarySalespersonInput2, driver, salesperson);
        wait.waitUntilElementClickable(primarySalespersonSearchButton2, driver, 30);
        wait.waitUntilElementClickable(primarySalespersonTable2, driver, 30);
        wait.waitUntilElementClickable(primarySalespersonOkButton2, driver, 30);
    }
    
    public void clickSaveButton() {
        wait.waitUntilElementClickable(saveButton, driver, 30);
    }

    public String getOrderStatus() {
        wait.waitUntilElementClickable(statusText, driver, 30);
        return statusText.getText();
    }

    public int getOrderNumber() {
        String orderStatus = getOrderStatus();
        return getNumericValue(orderStatus);
    }

    public void clickSubmitButton()  {
        wait.waitUntilElementClickable(submitButton, driver, 30);
    }

    public void clickOkButton() {
        wait.waitUntilElementClickable(okButton3, driver, 30);
    }

    public void clickDoneButton() {
        wait.waitUntilElementClickable(doneButton, driver, 30);
    }


    // Assuming you have the following helper method to extract numeric values from a string
//    public int getNumericValue(String text) {
//        String numberOnly = text.replaceAll("[^0-9]", "");
//        return Integer.parseInt(numberOnly);
//    }
	public static Integer getNumericValue(String str) {
	String str1[] = str.split("\\s");
	for (String s : str1) {
	boolean isNumeric = s.trim().chars().allMatch(Character::isDigit);
	if (isNumeric) {
	return Integer.parseInt(s);
	}
	}
	return 0;
	}

	public String Headerpartupdate(HashMap<String, String> testdata,int rownum) {
		boolean testcaseResult = false;
		try {
		selectBusinessUnit(testdata.get("Business_Unit"));
		selectCustomer(testdata.get("Customer"));
		enterPurchaseOrder(testdata.get("PurchaseOrder"));
		if(!testdata.get("OrderType").equals("NA")) {
		    selectOrderType(testdata.get("OrderType"));
		}
		if(!testdata.get("Contact").equals("NA")) {
			enterContact(testdata.get("Contact"));
		}
		if(!testdata.get("Contact_Method").equals("NA")) {
			selectContactMethod(testdata.get("Contact_Method"));
		}
		
		if(!testdata.get("Ship_to_Address").equals("NA")) {
			selectShipToAddress(testdata.get("Ship_to_Address"));
		}
		if(!testdata.get("Bill_to_Customer").equals("NA")) {
			selectBillToCustomer(testdata.get("Bill_to_Customer"));
		}
		clickOnicon_billingAndPaymentDetails();
		if(!testdata.get("Bill_to_Address").equals("NA")) {
			selectBillToAddress(testdata.get("Bill_to_Address"));
		}
		if(!testdata.get("Bill_To_Contact").equals("NA")) {
			enterBillToContact(testdata.get("Bill_To_Contact"));
		}
		if(!testdata.get("Payment_Terms").equals("NA")) {
			selectPaymentTerms(testdata.get("Payment_Terms"));
		}
		clickLinesIcon();
		clickHeaderActions();
		clickOneditAdditionalInfo();
		if(!testdata.get("EndCustomer_Name").equals("NA")) {
			selectEndCustomer(testdata.get("EndCustomer_Name"));
		}
		if(!testdata.get("Sales_Order_Acknowledgement_required").equals("NA")) {
			selectAcknowledgement(testdata.get("Sales_Order_Acknowledgement_required"));
		}
		if(!testdata.get("Header_Notes").equals("NA")) {
			enterHeaderNotes(testdata.get("Header_Notes"));
		}
		if(!testdata.get("Quality_Rating").equals("NA")) {
			enterQualityRating(testdata.get("Quality_Rating"));
		}
		if(!testdata.get("BDE").equals("NA")) {
			enterBDE(testdata.get("BDE"));
		}
		if(!testdata.get("DPAS_Agency").equals("NA")) {
			enterDPASAgency(testdata.get("DPAS_Agency"));
		}
		if(!testdata.get("DPAS_Program_ID").equals("NA")) {
			enterDPASProgramId(testdata.get("DPAS_Program_ID"));
		}
		if(!testdata.get("DPAS_Rating").equals("NA")) {
			enterDPASRating(testdata.get("DPAS_Rating"));
		}
		if(!testdata.get("Government_Contract").equals("NA")) {
			enterGovernmentContract(testdata.get("Government_Contract"));
		}
		if(!testdata.get("ITAR_Restricted").equals("NA")) {
			selectItarRestricted(testdata.get("ITAR_Restricted"));
		}
		if(!testdata.get("Export_License_Reqd").equals("NA")) {
			enterExportLicenseReqd(testdata.get("Export_License_Reqd"));
		}
		if(!testdata.get("FARS").equals("NA")) {
			selectFARS(testdata.get("FARS"));
		}
		if(!testdata.get("DFARS").equals("NA")) {
			selectDFARS(testdata.get("DFARS"));
		}
		if(!testdata.get("DPAS_Agency").equals("NA")) {
			enterDPASProgramId(testdata.get("DPAS_Agency"));
		}
		if(!testdata.get("DPAS_Rating").equals("NA")) {
			enterDPASRating(testdata.get("DPAS_Rating"));
		}
		if(!testdata.get("DPAS_Rating").equals("NA")) {
			enterDPASRating(testdata.get("DPAS_Rating"));
		}
		enterSubEndCustomer(testdata.get("SubEnd_Customer"));
		enterPricingSubEndCustomer(testdata.get("PricingSubEnd_Customer"));
		clickEffectiveAttributeOkButton();
		clickSecondIcon();
		enterShipToContact(testdata.get("Ship_To_Contact"));
		//enterShippingMethod(testdata.get("Ship_to_Contact_Method"));
		enterRequestedDateHeader(testdata.get("Requested_Date"));
		selectRequestTypeHeader(testdata.get("Request_Type"));
		clickShippingTab();
		selectFOB(testdata.get("FOB"));
		selectFreightTerms(testdata.get("FrieghtTerms"));
		enterWarehouse(testdata.get("Warehouse"));
		selectDemandClass(testdata.get("Demand_Class_Header"));
		selectAllowPartials(testdata.get("Allow_partials"));
		clickIconSDI1();
		testcaseResult = true;
		}
		catch (Exception e) {
			e.printStackTrace();
			excelOperations.writeResult(rownum, "Result", "Fail");
		    excelOperations.writeResult(rownum, "comments", "error while completing header part");
		}
		String Statusoftestcase = String.valueOf(testcaseResult);
		return Statusoftestcase;
		
	}
	public String itemConfiguration(HashMap<String, String> testdata,int rownum) {
		boolean testcaseResult = false;
		try {
		searchForItem(testdata.get("Item"));
		addItemToOrder(testdata.get("Quantity"),testdata.get("Item"));
		selectAdjustmentType(testdata.get("Adjustment_Type"));
		enterUnitSellingPrice(testdata.get("Unit_Selling_Price"));
		selectReason(testdata.get("Reason"));
		clickSaveAndClose();
		fillAdditionalInformation(testdata.get("Item"), testdata.get("Repromise_Date"), testdata.get("Original_Schedule_Ship_Date"), testdata.get("Customer_Catalouge_Cross_Refrerence"), testdata.get("Additional_Notes"), testdata.get("MPN"), testdata.get("Internal_Item"));
		selectTradingPartnerAttributes(testdata.get("SubIndustry_Segment"), testdata.get("Program"), testdata.get("Platform"), testdata.get("TradingPartnerItem"));
		selectPrimarySalespersonItemLevel(testdata.get("PrimarySalesperson"));
		selectPrimarySalespersonHeaderLevel(testdata.get("PrimarySalesperson"));
		testcaseResult = true;
		}
		catch (Exception e) {
			e.printStackTrace();
			excelOperations.writeResult(rownum, "Result", "Fail");
		    excelOperations.writeResult(rownum, "comments", "error while configuring item");
		}
		String Statusoftestcase = String.valueOf(testcaseResult);
		return Statusoftestcase;
	}
	public String submitSalesOrder(HashMap<String, String> testdata,int rownum) {
		boolean testcaseResult = false;
		try {
		clickSaveButton();
		Thread.sleep(20000);
		String orderNumberStr = String.valueOf(getOrderNumber());
		excelOperations.writeResult(rownum, "orderNumber", orderNumberStr);
		clickSubmitButton();
		clickOkButton();
		clickDoneButton();
		excelOperations.writeResult(rownum, "Result", "Pass");
		testcaseResult = true;
		}
		catch (Exception e) {
			excelOperations.writeResult(rownum, "Result", "Fail");
		    excelOperations.writeResult(rownum, "comments", "error while submitting salesorder");
			e.printStackTrace();
			
		}
		String Statusoftestcase = String.valueOf(testcaseResult);
		return Statusoftestcase;
			
		
		
	}
	public void enterSalesorderData(int rowNumber) {
		clickCreateOrder();
		HashMap<String, String> testdata = excelOperations.readRow(rowNumber);
		test.log(Status.INFO, "header part Started ");
		String resultofHeader=Headerpartupdate(testdata,rowNumber);
		test.log(Status.INFO, "header part completed ");
		Assert.assertEquals(resultofHeader, "true");
		test.log(Status.INFO, "item congiguration Started ");
		String resultofItemconfig=itemConfiguration(testdata,rowNumber);
		Assert.assertEquals(resultofItemconfig, "true");
		test.log(Status.INFO, "submitting sales order ");
		String resultofsubmitorder=submitSalesOrder(testdata,rowNumber);
		test.log(Status.INFO, "submited sales order ");
		Assert.assertEquals(resultofsubmitorder, "true");
		
		
	}



}
