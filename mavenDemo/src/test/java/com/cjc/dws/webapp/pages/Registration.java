package com.cjc.dws.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {

	WebDriver driver;

	public Registration(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	@FindBy(css="input[id='gender-male']")
	WebElement gender;
	
	@FindBy(css="input[id='FirstName']")
	WebElement firstname;
	
	@FindBy(css="input[id='LastName']")
	WebElement lastname;
	
	@FindBy(css="input[id='Email']")
	WebElement email;
	
	@FindBy(css="input[id='Password']")
	WebElement password;
	
	@FindBy(css="input[id='ConfirmPassword']")
	WebElement Cnpass;
	
	@FindBy(css="input[id='register-button']")
	WebElement regButtn;
	
	@FindBy(css="a[class='ico-logout']")
	WebElement logout;
	
	public void registercheak(String fn,String ln,String em,String ps,String cp )
	{
		gender.click();
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		email.sendKeys(em);
		password.sendKeys(ps);
		Cnpass.sendKeys(cp);
		regButtn.click();
		logout.click();
		
		
		
	}
}
