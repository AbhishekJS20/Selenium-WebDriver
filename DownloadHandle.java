package ManyMore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadHandle
{
	@Test
	public static void download()
	{
		FirefoxProfile pro=new FirefoxProfile();
		pro.setPreference("browser.download.folderList", 0);
		pro.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/jar");
		WebDriver d=new FirefoxDriver(pro);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.seleniumhq.org/download/");
		d.findElement(By.linkText("Previous Releases")).click();
		d.findElement(By.linkText("2.53")).click();
		d.findElement(By.linkText("selenium-server-standalone-2.53.0.jar")).click();
		
	}

	
}
