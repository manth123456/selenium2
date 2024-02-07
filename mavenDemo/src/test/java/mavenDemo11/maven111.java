package mavenDemo11;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class maven111 {

	WebDriver driver;
	
	@BeforeSuite
public void m1() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		      driver=new ChromeDriver();
		          
	}
	@Parameters({"url"})
	@BeforeTest
	public void m2(String url)
	
	{
		driver.get(url);
		
	}
	
	@BeforeClass
	public void m3() {
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}	
		
	@BeforeMethod
	public void ck()
	{
		 
	     Set<Cookie> ck2=driver.manage().getCookies();
	     
	             int  count=ck2.size();
	     System.out.println(count);
	     
	     for (Cookie cooki : ck2) {
			
	    	 
	    	 System.out.println("name is"+cooki.getName());
	}
	}
	
	@Parameters({"us","ps"})
	
	@Test
	
	public void m4(String us,String ps) {
		
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(us);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(ps);
		
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
	}
	
@AfterMethod
	public void scn() throws Exception
	{		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\user\\Desktop\\New folder (2)\\New folder\\sb.jpg"));
	
		System.out.println("ss captured");
		
		
		
	}

	@AfterSuite
	public void m5()
	{
		driver.close();
		
	}
	
}