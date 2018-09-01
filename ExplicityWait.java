package waitPracctice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		// wait for dynamic Link to available in GUI
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Win an iPhone 7 every month")));
		
		//capture the name of the Link
		
		String str = driver.findElement(By.partialLinkText("Win an iPhone 7 every month")).getText();
		System.out.println(str);
		driver.findElement(By.partialLinkText("Win an iPhone 7 every month")).click();
		
		
	}

}
