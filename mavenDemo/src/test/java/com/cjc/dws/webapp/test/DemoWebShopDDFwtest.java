package com.cjc.dws.webapp.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cjc.dws.webapp.pages.AdToCaert;
import com.cjc.dws.webapp.pages.Login;
import com.cjc.dws.webapp.pages.Registration;

public class DemoWebShopDDFwtest {

	
	WebDriver driver;
	@BeforeSuite
	public void openbrowser()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\New folder\\chromedriver.exe");
		
		  driver=new ChromeDriver();
		}
		
	
	@BeforeTest
	public void url()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		
	}
		
	
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
	}
		
	@BeforeMethod
	public void cookies()
	{
		
	}
	@Test(priority = 1,dataProvider ="getdata")
	public void register(String fn,String ln,String em,String ps,String cp)
	{
		Registration	rg=PageFactory.initElements(driver,Registration.class);
		rg.registercheak(fn, ln, em, ps, cp);
	}
	@Test(priority = 2)
	public void login() throws IOException
	{
	Login 	lg=PageFactory.initElements(driver,	Login.class);
		
	lg.logincheak();
	
	}
	
	@Test(priority = 3)
	public void Addtocart()
	{
		AdToCaert 	ad=PageFactory.initElements(driver,	AdToCaert.class);
		
		ad.cartcheak();
	}
	
	
	@Test(priority = 4)
	public void Adress()
	{
		
	}
	@Test(priority = 5)
	public void payment()
	{
		
	}
	@Test(priority = 6)
	public void conformOrder() 
	{
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		
		return new Object[][]
				{
			new Object[] {"yogesh","patil","yogesh810@gmail.com","yogesh899","yogesh899" }
				};
	}
}
