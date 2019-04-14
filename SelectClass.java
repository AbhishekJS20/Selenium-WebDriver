package com.myntra.common.ib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass
{
	public Select sel;
	public void selectallthedata(WebElement wb) 
	{
		sel=new Select(wb);
		java.util.List<WebElement>lst=sel.getOptions();
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
		}
	}
	public void selectbyindex(WebElement wb,int index)
	
	{
		sel=new Select(wb);
		sel.selectByIndex(index);
	}
	public void selectbyindex(WebElement wb,String Text)
	
	{
		sel=new Select(wb);
		sel.selectByVisibleText(Text);
	}
    public void selectbyValue(WebElement wb,String value)
	
	{
		sel=new Select(wb);
		sel.selectByValue(value);
	}
    
    public void deselectByIndex(WebElement wb,int index)
	
 	{
 		sel=new Select(wb);
 		sel.deselectByIndex(index);
 	}   
    
    public void deselectByValue(WebElement wb,String value)
	
 	{
 		sel=new Select(wb);
 		sel.deselectByValue(value);
 	}   
    public void deselectByVisibleText(WebElement wb,String text)
	
  	{
  		sel=new Select(wb);
  		sel.deselectByVisibleText(text);
  	} 
    public void deselectByVisibleText(WebElement wb)
	
  	{
  		sel=new Select(wb);
  		sel.deselectAll();
  	} 
    

}
