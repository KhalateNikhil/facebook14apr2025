package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass{
	
	
	//reusable script for handling frames
	//create static reusable frame method by passing String argument 
	public static void frame(String frameIdOrName)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));
	}

	public static void frame(int frameindex)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
	}
	
	
	public static void frame(WebElement framewb)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framewb));
	}
	//switch to immediate parent frame
	public static void parentFrame()
	{
		driver.switchTo().parentFrame();
	}
	//switch to main frame/top frame
	
	public static void defaultcontent()
	{
		driver.switchTo().defaultContent();
	}
	
	
	
	
}
