package com.Boyd.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	//checking radio buttons
	public void selectRadioButton(List<WebElement> element,String valuetobeSelected) {
		for (WebElement refElement : element) {
			if(refElement.getText().equals(valuetobeSelected)) {
				refElement.click();
				break;
			}
		}

	}
	//checking  checkboxes
	public void selectCheckBoxes(List<WebElement> element,String valuestobeSelected) {
		String [] CheckStringArray=valuestobeSelected.split(",");
		for (String str1 : CheckStringArray) {
			for (WebElement refElement : element) {
				if(refElement.getText().endsWith(str1)) {
					refElement.click();
					break;
				}

			}
		}
	}
	//selecting dropdown by text
	public void SelectDropDown(WebElement element,String valueTobeselected) {
		Select select=new Select(element);
		select.selectByVisibleText(valueTobeselected);
	}
	//verifing dropdown values
	public List<String> getDropdownList(WebElement element) {
		Select options=new Select(element);
		List<WebElement> listOfOptions=options.getOptions();
		List<String> actualOptions=new ArrayList<String>();

		for (WebElement ref : listOfOptions) {

			actualOptions.add(ref.getText());
		}
		return actualOptions;
	}


}
