package com.cjc.dws.webapp.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.dws.webapp.utility.common;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}
	@FindBy(css="a[class='ico-login']")
	WebElement logclk;
	
	@FindBy(css="input[id='Email']")
	WebElement email;
	
	@FindBy(css="input[id='Password']")
	WebElement password;
	
	@FindBy(css="input[class='button-1 login-button']")
	WebElement log;
	
	public void logincheak() throws IOException
	{
		logclk.click();
		String un=common.userName();
		String ps=common.Password();
		
		System.out.println(un);
		System.out.println(ps);
		
		email.sendKeys(un);
		password.sendKeys(ps);
		log.click();
		
	}
	
	
}
