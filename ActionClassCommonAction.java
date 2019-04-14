package com.myntra.common.ib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassCommonAction
{
	public Actions act;
	public void moveToElement(WebDriver driver,WebElement wb)
	{
		act =new Actions(driver);
		act.moveToElement(wb).perform();
	}
	
	public void contextClick(WebDriver driver)
	{
		act =new Actions(driver);
		act.contextClick().perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement target)
	{
		act =new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}	
	public void dragAndDrop(WebDriver driver)
	{
		act =new Actions(driver);
		act.click().perform();
	}
}
