
package AutoSuggest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CaptureAutoSuggest 
{
	public static void main(String[] args) 
	{
		WebDriver dri = new FirefoxDriver();
		dri.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dri.manage().window().maximize();
		dri.get("https://google.com");
	
		dri.findElement(By.id("lst-ib")).sendKeys("romeo ");
		//capture all auto suggest list
		List<WebElement> list =dri.findElements(By.xpath("//div[@class='sbsb_a']/ul/li/div/div[2]"));
		for(WebElement wb : list)
		{
			System.out.println(wb.getText());
		}

		
		dri.close();
	}
}
