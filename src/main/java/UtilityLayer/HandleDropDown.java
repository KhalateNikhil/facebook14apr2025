package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String value) {
		new Select(Wait.visibilityStatus(wb)).selectByVisibleText(value);

	}

	public static void selectByValue(WebElement wb, String value) {
		new Select(Wait.visibilityStatus(wb)).selectByValue(value);
	}

	public static void selecByIndex(WebElement wb, int index) {
		new Select(Wait.visibilityStatus(wb)).selectByIndex(index);
	}

	public static void getOptions(WebElement wb) {
		List<WebElement> ls = new Select(Wait.visibilityStatus(wb)).getOptions();

		for (WebElement wb1 : ls) {
			System.out.println(wb1.getText());
		}

	}

	public static int size(WebElement wb) {
		return new Select(Wait.visibilityStatus(wb)).getOptions().size();
	}

	public static void selectAnyDropDown(WebElement wb, String value) {
		List<WebElement> ls = Wait.visibilityAllElement(wb);

		for (WebElement wb1 : ls) {
			if (wb1.getText().equalsIgnoreCase(value)) {
				wb1.click();
				break;
			}

		}

	}

	public static String getFirstSelectedOption(WebElement wb) {
		return new Select(Wait.visibilityStatus(wb)).getFirstSelectedOption().getText();
	}

}
