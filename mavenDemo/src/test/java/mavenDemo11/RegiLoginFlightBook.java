package mavenDemo11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegiLoginFlightBook {
 WebDriver driver;
	
	@BeforeSuite
	public void  openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	      driver=new ChromeDriver();
	
	}
	@Parameters({"url"})
	@BeforeClass
	
public void URL(String url)
	
	{
		driver.get(url);
		
	}
	
	@BeforeClass
	public void m3() {
	
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1 )
	@Parameters({"fname","lname","phn","usn","adr","ct","st","pc","cnt","em","ps","cps",})
	public void register(String fname,String lname,String phn,String usn,String adr,String ct,String st,String pc,String cnt,String em,String ps, String cps )
	{
		
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		
		driver.findElement(By.name("phone")).sendKeys(phn);
		
		driver.findElement(By.name("userName")).sendKeys(usn);
		
		driver.findElement(By.name("address1")).sendKeys(adr);
		driver.findElement(By.name("city")).sendKeys(ct);
		
		driver.findElement(By.name("state")).sendKeys(st);
		
		driver.findElement(By.name("postalCode")).sendKeys("pc");
		WebElement a=driver.findElement(By.name("country"));
		
		Select s=new Select(a);
		s.selectByValue(cnt);
		
		driver.findElement(By.name("email")).sendKeys(em);
		
		driver.findElement(By.name("password")).sendKeys(ps);
		
		driver.findElement(By.name("confirmPassword")).sendKeys(cps);
		
		driver.findElement(By.name("submit")).click();
		
		
		
	}
	
@Test(priority = 2 )
@Parameters({"ps","ps"})
public void login(String us,String ps) throws Exception
{
	driver.findElement(By.cssSelector("a[href='login.php']")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.name("userName")).sendKeys(us);
	
	driver.findElement(By.name("password")).sendKeys(ps);
	
	driver.findElement(By.name("submit")).click();
}



	@Test(priority = 3 )
	@Parameters({"pcount","fport","fmonth","fday","tport","tomonth","today","clas"})
	public void flightbook(String pcount,String fport,String fmonth,String fday,String tport,String tomonth,String today,String clas) throws Exception
	{
		
		
		driver.findElement(By.cssSelector("a[href='reservation.php']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();

		WebElement w=driver.findElement(By.name("passCount"));
		
		Select s=new Select(w);
		
		s.selectByIndex(Integer.parseInt(pcount));
		
		
		

		WebElement w1=driver.findElement(By.name("fromPort"));
		
		Select s1=new Select(w1);
		s1.selectByIndex(Integer.parseInt(fport));
		
WebElement w2=driver.findElement(By.name("fromMonth"));
		

		Select s2=new Select(w2);
		
		s2.selectByIndex(Integer.parseInt(fmonth));
		
		
		
WebElement w3=driver.findElement(By.name("fromDay"));
		
		Select s3=new Select(w3);
		s3.selectByIndex(Integer.parseInt(fday));

WebElement w4=driver.findElement(By.name("toPort"));
		
		Select s4=new Select(w4);
		
		s4.selectByIndex(Integer.parseInt(tport));
		

WebElement w5=driver.findElement(By.name("toMonth"));
		
		Select s5=new Select(w5);
		
		s5.selectByIndex(Integer.parseInt(tomonth));
		


WebElement wn=driver.findElement(By.name("toDay"));
		
		Select s8=new Select(wn);
		
		s8.selectByIndex(Integer.parseInt(today));
		
	
		
	
	 
	    driver.findElement(By.xpath("//input[@name='servClass'] /parent :: font / child :: input[2]")).click(); 
	    

WebElement w6=driver.findElement(By.name("airline"));
		
		Select s6=new Select(w6);
		
		s6.selectByIndex(Integer.parseInt(clas));
		

	    

driver.findElement(By.name("findFlights")).click();
		
		
		
	} 	
		
		
	
	
}
