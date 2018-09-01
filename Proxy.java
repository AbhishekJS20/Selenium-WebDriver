package Manymore1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Proxy 
{
	@Test
	public void test()
	{
	String PROXY="192.168.2.01:8080";
	org.openqa.selenium.Proxy pro=new org.openqa.selenium.Proxy();
	
	pro.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY);
	
	DesiredCapabilities des = new DesiredCapabilities();
	des.setCapability(CapabilityType.PROXY, pro);
	WebDriver driver=new FirefoxDriver(des);

	
}
}
