package com.cjc.dws.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdToCaert {

	WebDriver driver;

	public AdToCaert(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.leftside-3 > div.block.block-category-navigation > div.listbox > ul > li:nth-child(1) > a")
	WebElement book;

	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-grid > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input")
	WebElement adtcart;
	

	@FindBy(css="#topcartlink > a > span.cart-label")
	WebElement shoppigcart;

	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div > div > div.page-body > div > form > table > tbody > tr > td.remove-from-cart > input[type=checkbox]")
	WebElement cheakbox;
	
	

	@FindBy(css="#termsofservice")
	WebElement TCbox;

	@FindBy(css="#checkout")
	WebElement cheakout;
	
	public void cartcheak()
	{
		book.click();
		adtcart.click();
		shoppigcart.click();
		cheakbox.click();
		TCbox.click();
		cheakout.click();
	}
	
	
}
