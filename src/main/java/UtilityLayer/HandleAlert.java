package UtilityLayer;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass {

	public static void accept() {
		Wait.alertIsPresent().accept();
	}

	public static void dismiss() {
		Wait.alertIsPresent().dismiss();
	}

	public static void sendKeys(String value) {
		Wait.alertIsPresent().sendKeys(value);
	}

	public static String getText() {
		return Wait.alertIsPresent().getText();
	}

}
