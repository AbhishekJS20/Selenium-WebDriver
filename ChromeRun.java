package workingWithChromw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRun 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Setup files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://gmail.com");
	
	}
}
