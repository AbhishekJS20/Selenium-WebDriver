package Campus;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Getdata extends Excellib
{
	WebDriver d;
	@Test
	public void data() throws Throwable
	{
		String path="G:\\Program\\Selenium new class\\Testdata\\Campus.xlsx";
	String sheet="Sheet1";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		Row row=sh.getRow(1);
		//String data=row.getCell(cellnum).getStringCellValue();

		
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://demoqa.com/registration");
		
	
		String fname=row.getCell(0).getStringCellValue();

		System.out.println(fname);
		String lname=row.getCell(1).getStringCellValue();
		System.out.println(lname);
		Double phn=row.getCell(2).getNumericCellValue();
		String phns=String.valueOf(phn);
		System.out.println(phns);
		String username=row.getCell(3).getStringCellValue();
		String em=row.getCell(4).getStringCellValue();
		System.out.println(em);
		String pwd=row.getCell(5).getStringCellValue();
		String pwd2=row.getCell(6).getStringCellValue();
		d.findElement(By.id("name_3_firstname")).sendKeys(fname);
		d.findElement(By.id("name_3_lastname")).sendKeys(lname);
		d.findElement(By.xpath("//input[@value='dance']")).click();
		d.findElement(By.name("phone_9")).sendKeys(phns);
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.id("email_1")).sendKeys(em);
		d.findElement(By.id("password_2")).sendKeys(pwd);
		d.findElement(By.id("confirm_password_password_2")).sendKeys(pwd2);
		
	}

}
