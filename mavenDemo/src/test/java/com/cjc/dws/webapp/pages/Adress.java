package com.cjc.dws.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adress {

	WebDriver driver;

	public Adress(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(css="#BillingNewAddress_Company")
	WebElement cmpny;
	
	@FindBy(css="#BillingNewAddress_CountryId")
	WebElement country;
	
	@FindBy(css="#BillingNewAddress_City")
	WebElement ct;
	
	@FindBy(css="#BillingNewAddress_Address1")
	WebElement ad1;
	
	@FindBy(css="#BillingNewAddress_Address2")
	WebElement ad2;
	
	@FindBy(css="#BillingNewAddress_ZipPostalCode")
	WebElement post;
	
	@FindBy(css="#BillingNewAddress_PhoneNumber")
	WebElement phn;
	@FindBy(css="#BillingNewAddress_FaxNumber")
	WebElement fax;
	
	public void bilingadrcheak(String cm) {
		
		cmpny.sendKeys(cm);
		country.click();
		
		
		
	}
	
	
}
