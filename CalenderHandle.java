package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CalenderHandle 
{

	@Test(groups = {"smoke test"})
	public void calenderWindow() throws Throwable
	{
		WebDriver dri= new FirefoxDriver();
		dri.get("https://www.cleartrip.com/");
		
		//click on calendar ICON
		dri.findElement(By.xpath("//i[text()='Cal']")).click();
		
		while(true)
		{
			try
			{
				//select a date
				String xDate="//td[@data-year='2018' and @data-month='6' ]/a[text()='2']";
				dri.findElement(By.xpath(xDate)).click();
				break;
			}
			catch(Exception e)
			{
				//click on next button
				dri.findElement(By.xpath("//a[contains(@class, 'nextMonth')]")).click();
			}
		}
	}
}
