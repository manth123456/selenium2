package com.cjc.dws.webapp.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class common {

	public static WebDriver driver;

	public static FileInputStream fis;
	
	public static XSSFWorkbook ow;
	
	public static XSSFSheet sheet;
	
	public static XSSFRow rw;
	
	public static XSSFCell cell;
	
	public static FileInputStream filecall() throws FileNotFoundException
	{
		fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\mavenDemo\\src\\test\\resources\\loginexl.xlsx");
		return fis;
		
	}
	
	public static String userName() throws IOException 
	{

		fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\mavenDemo\\src\\test\\resources\\loginexl.xlsx");
		ow=new XSSFWorkbook(fis);
		
		sheet=ow.getSheet("sheet1");
		rw=sheet.getRow(0);
		cell=rw.getCell(0);
		
		 String username=cell.getStringCellValue();
		return username;
		
	}
	public static String Password() throws IOException 
	{
		fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\mavenDemo\\src\\test\\resources\\loginexl.xlsx");
		ow=new XSSFWorkbook(fis);
		
		sheet=ow.getSheet("sheet1");
		rw=sheet.getRow(1);
		cell=rw.getCell(0);
		
		 String pass=cell.getStringCellValue();
		return pass;
		
	
		
	}
	
	
	
}
