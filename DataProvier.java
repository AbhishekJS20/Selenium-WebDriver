package Campus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvier extends Excellib
{
	WebDriver d;
	@Test(dataProvider="getdata")
	public void dataprovide(String fname,String lname,String phn, String username, String em,String pwd,String pwd2)
	{
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://demoqa.com/registration");
		d.findElement(By.id("name_3_firstname")).sendKeys(fname);
		d.findElement(By.id("name_3_lastname")).sendKeys(lname);
		d.findElement(By.xpath("//input[@value='dance']")).click();
		
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.id("email_1")).sendKeys(em);
		d.findElement(By.id("password_2")).sendKeys(pwd);
		d.findElement(By.id("confirm_password_password_2")).sendKeys(pwd2);
		
	}
	@DataProvider(name="getdata")
	public Object[][] getdata() throws Throwable
	{
		Excellib e=PageFactory.initElements(d, Excellib.class);
		int row=e.getlastrow();
		Object[][] data=new Object[row][7];
		for(int i=1;i<row;i++)
		{
			
			data[i][1]=e.getdata(row, 1);
		}
		
		return data;
		
		
	}
}
