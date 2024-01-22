package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_PageLocators extends Second_PageLocators {
	public static WebElement getradioBtn() {
		WebElement radio =driver.findElement(By.id("radiobutton_0"));
		return radio;
	}
	public static WebElement getcontinueBtn() {
		WebElement continueBtn = driver.findElement(By.id("continue"));
		return continueBtn;
	}
}
