package NewAssigment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class Screenshort 
{
	@Test
	public void run() throws Throwable
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		//take screenshort
		EventFiringWebDriver ed=new EventFiringWebDriver(driver);
		File src=ed.getScreenshotAs(OutputType.FILE);
		//create new file
		File des=new File(".\\ScreenShort\\testing.png");
		//copy the screenshort
		org.apache.commons.io.FileUtils.copyFile(src, des);
		
		
	}

}
