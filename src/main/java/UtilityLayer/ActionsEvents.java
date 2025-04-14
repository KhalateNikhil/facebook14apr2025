package UtilityLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionsEvents extends BaseClass {

	public static void click(WebElement wb) {
		new Actions(driver).click(Wait.visibilityStatus(wb)).build().perform();
	}

	public static void doubleClick(WebElement wb) {
		new Actions(driver).doubleClick(Wait.visibilityStatus(wb)).build().perform();
	}

	public static void contextClick(WebElement wb) {
		new Actions(driver).contextClick(Wait.visibilityStatus(wb)).build().perform();
	}

	public static void moveToElement(WebElement wb) {
		new Actions(driver).moveToElement(Wait.visibilityStatus(wb)).build().perform();
	}

	public static void clickAndHold(WebElement wb) {
		new Actions(driver).clickAndHold(Wait.visibilityStatus(wb)).build().perform();
	}

	public static void dragAndDrop(WebElement source, WebElement destination) {
		new Actions(driver).dragAndDrop(Wait.visibilityStatus(source), Wait.visibilityStatus(destination)).build()
				.perform();
	}

	public static void release(WebElement wb) {
		new Actions(driver).release(Wait.visibilityStatus(wb)).build().perform();

	}

	public static void sendKeys(WebElement wb, String value) {
		new Actions(driver).sendKeys(Wait.visibilityStatus(wb), value).build().perform();
	}

	public static void sendUCText(WebElement wb, String value) {
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(Wait.visibilityStatus(wb)).keyUp(Keys.SHIFT).build().perform();
	}

}
