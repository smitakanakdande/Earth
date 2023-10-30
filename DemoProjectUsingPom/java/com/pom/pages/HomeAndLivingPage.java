package com.pom.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.pom.base.*;


public class HomeAndLivingPage {
	@FindBy(css = "img[src=\"https://assets.myntassets.com/w_350,c_limit,fl_progressive,dpr_2.0/assets/images/banners/2018/2/2/11517563810789-art-n-decor.jpg\"]")
	WebElement artAndDecor; // null

	public void art_decor() {
		artAndDecor.click();

	}
	@FindBy(css = "span.myntraweb-sprite.sort-downArrow.sprites-downArrow")
	WebElement sortDropDown; // null

	public void Sort_DropDown() {
		sortDropDown.click();

	}
	@FindBy(css = "ul.sort-list>li:nth-child(3)>label")
	WebElement popularityformDropDown; 
	

	public void popularity_DropDown() {
		//Select s=new select(WebElement);
		popularityformDropDown.click();
       
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

}
