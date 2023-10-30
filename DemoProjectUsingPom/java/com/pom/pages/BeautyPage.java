package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeautyPage {

	
	//@FindBy(css = "ul.categories-list>li:nth-child(1)>label")    //not found,check css again
	
/*	@FindBy(css= "div[class='vertical-filters-filters categories-container'] li:nth-child(1)")
	WebElement checkBox_Lipstick;
	

	public void checkBoxLipstick() {
		try {
			if (checkBox_Lipstick.isSelected() == false) {

			checkBox_Lipstick.click();
			
		} }catch (Exception e) {
			
			System.out.println("CheckBox not clicked");
		}

	

	}*/
	@FindBy(css="ul.gender-list>li>label.common-customRadio.gender-label.undefined")
	WebElement menFilter;                            //not found,check css again
	
	public void menFilterList() {
		if(menFilter.isSelected()==false)
		{
			menFilter.click();
		}

	}

}
