package UtilityLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Calender extends BaseClass{
	
	
	public static By by(String tagname, String date)
	{
		return By.xpath("//"+tagname+"[]text()='"+date+"']");
	}

	
	
	public static void dynamicCalender(WebElement MonthYearwb,String ExpectedMonthYear,String tagName,String date,WebElement next)
	{
		while(true)
		{
			String actualmonthyear=MonthYearwb.getText();
			if(actualmonthyear.contains(ExpectedMonthYear))
			{
				driver.findElement(by(tagName,date)).click();
				break;
			}
			else 
			{
				next.click();
			}
		}
		
	}
	
}





