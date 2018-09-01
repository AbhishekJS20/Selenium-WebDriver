package popUp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTab 
{
	@Test(groups = {"smoke test"})
	public void HandleNewWindow() throws Throwable
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// click on car / bus available in "tourism" dropdown menu
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Tourism"))).perform();
		driver.findElement(By.linkText("Cab / Bus")).click();
		
		//Get All Window IDs
		
		Set<String> set =driver.getWindowHandles();
		//capture all windows ID's from set collection
		
		Iterator it = set.iterator();
		String parentID = (String) it.next();
		String childID = (String) it.next();
		
		//pass driver control to child window
		
		driver.switchTo().window(childID);
		driver.findElement(By.id("withoutPnr")).click();
		WebElement wb=driver.findElement(By.name("cityName"));
		Select sc = new Select(wb);
		
		// capture all options from a drop down of a child page
		
		List<WebElement> i = sc.getOptions();
		
		for(int j=0; j<i.size(); j++)
		{
			System.out.println(i.get(j).getText());
		}
		
		// perform action on parentID
		
		driver.switchTo().window(parentID);
		Thread.sleep(2000);
		// select a check box on parentID called Request OTP
		
		driver.findElement(By.id("otpId")).click();
		
		//close childID window
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		driver.close();
	}
}
