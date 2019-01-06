package gmailCreateuser;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class GmailCreateUser 
{
	public static void createUser() throws Throwable
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://accounts.google.com/SignUp?hl=en-GB");
		d.findElement(By.id("FirstName")).sendKeys("Dommy");
		d.findElement(By.id("LastName")).sendKeys("Automation");
		d.findElement(By.id("GmailAddress")).sendKeys("dommyautomationmail@gmail.com");
		d.findElement(By.id("Passwd")).sendKeys("automation123");
		d.findElement(By.id("PasswdAgain")).sendKeys("automation123");
		d.findElement(By.id("BirthDay")).sendKeys("01");
		
		d.findElement(By.xpath("//label[@id='month-label']")).click();
		Thread.sleep(1500);
		java.util.List<WebElement> lst1=d.findElements(By.xpath("//div[@class='goog-menu goog-menu-vertical']"));
		for(int i=0;i<lst1.size();i++)
		{
			if(lst1.get(i).getText().contains("May"))
			{
				lst1.get(i).click();
			}
		}
		d.findElement(By.id("BirthYear")).sendKeys("1995");
		
		
		d.findElement(By.id("Gender")).click();
		java.util.List<WebElement> lst2=d.findElements(By.xpath("//div[@class='goog-menu goog-menu-vertical']"));
		for(int i=0;i<lst2.size();i++)
		{
			if(lst2.get(i).getText().contains("Rather not say"))
			{
				lst2.get(i).click();
			}
		}
		
		d.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9583517138");
		d.findElement(By.id("submitbutton")).click();
		
		
	}
	
	

}
