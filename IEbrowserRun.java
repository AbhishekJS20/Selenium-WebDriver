package workingWithIE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/*its not working*/
public class IEbrowserRun 
{
	public static void main(String[] args) 
	{
		System.setProperty("selenium.ie.driver", "C:\\Setup files\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
		WebDriver d = new InternetExplorerDriver();
	
	}
}
