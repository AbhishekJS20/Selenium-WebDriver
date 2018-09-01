package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdvertisementPopUp 
{
	@Test
	public void AdvertiseTest() throws Throwable 
	{
		WebDriver dri = new FirefoxDriver();
		dri.get("http://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		try
		{
		dri.findElement(By.id("close")).click();	
		}
		catch (Exception e) 
		{
		System.out.println("Ad not found");
		}
	}
}
