package com.pom.pages;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(css = "div.desktop-query>input.desktop-searchBar")
	WebElement searchComponant; // null

	public void searchProduct(String productName) {
		searchComponant.sendKeys(productName);
		searchComponant.sendKeys(Keys.RETURN);

	}

	@FindBy(css = "li.product-base div.product-productMetaInfo h4.product-product")
	List<WebElement> productTitles;

	public List<String> getProductTitles() {

		List<String> titles = new ArrayList<>();
		for (WebElement product : productTitles) {
			titles.add(product.getText());

		}
		return titles;
	}
//----------------------------------------------------------------------

	@FindBy(css = "a[href*=\"/personal-care\"].desktop-main")
	WebElement beautyButton;

	public void beautybtn() {
		beautyButton.click();
	}
//----------------------------------------------------------------------

	@FindBy(css = "a[href=\"/shop/men\"].desktop-main") // Remaining
	WebElement menButton;

	public void men_Button() {

		menButton.click();
	}

	@FindBy(css = "img[src=\"https://assets.myntassets.com/w_163,c_limit,fl_progressive,dpr_2.0/assets/images/2020/7/8/89f1bd9d-3a28-456d-888a-beff717a06f81594222908155-Shirts.jpg\"]")
	WebElement shirtFromMen;

	public void shirt_FromMen() {
		shirtFromMen.click();

	}

	@FindBy(css = "img[src*=\"images/19818628/2022\"]")
	WebElement shirtImgFirst;

	public void shirt_ImgFirst() {
		shirtImgFirst.click();

	}
//------------------------------------------------------------------------------

	@FindBy(css = "a.desktop-wishlist>span.desktop-userTitle")
	WebElement wishList;

	public void wish_List() {
		wishList.click();

	}

	@FindBy(css = "a.wishlistLogin-button")
	WebElement loginFromWishList;

	public void login_WishList() {
		loginFromWishList.click();

	}

	@FindBy(css = "input.form-control.mobileNumberInput")
	WebElement MobileNoAsPwd;

	public void mobile_Pwd(String num) {
		MobileNoAsPwd.sendKeys(num);

	}

	@FindBy(css = "div.submitBottomOption")
	WebElement mobilePwdSubmitBtn;

	public void mobilePwd_SubmitBtn() {
		mobilePwdSubmitBtn.click();
	}

	// ---------------------------------------------------------------
	

	@FindBy(css = "div.filter-search-filterSearchBox")
	WebElement magnifierCategory;

	public void magnifierSelect() {
		magnifierCategory.click();
	}

	@FindBy(css = "div.filter-search-filterSearchBox.filter-search-expanded>input.filter-search-inputBox")
	WebElement searchBoxCatagory;

	public void searchBox_Catagory(String name) {
		searchBoxCatagory.sendKeys(name);
	}

	@FindBy(css="div:nth-child(1) > div:nth-child(3) > ul:nth-child(3) > li:nth-child(1) > label:nth-child(1)")
	//@FindBy(css = "ul.ctegories-list>li:nth-child(1)>label")
	WebElement checkBox_Lipstick;

	public void checkBoxLipstick() {
		
           checkBox_Lipstick.click();
           
		// Verify if the checkbox is selected or not

		if (checkBox_Lipstick.isSelected()) {
			System.out.println("Checkbox is selected.");
		} else {
			System.out.println("Checkbox is not selected.");
		}

	}
	
	@FindBy(css="ul.pagination-container>li:nth-child(12)>a")
	WebElement nextPageBtn;
	
	public void nextbtn() {
	//nextPageBtn.click();
   
	while(nextPageBtn.isEnabled())
	{
		nextPageBtn.click();
	}

	}
}