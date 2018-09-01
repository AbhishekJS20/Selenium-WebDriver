package grid;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid 
{
	public static void main(String[] args) throws Throwable
	{
		URL url = new URL("http://192.168.0.50:4444/wd/hub");
		
		DesiredCapabilities des = DesiredCapabilities.firefox();
		RemoteWebDriver driver = new RemoteWebDriver(url, des);
		
		driver.get("facebook.com");
		
	}
}
