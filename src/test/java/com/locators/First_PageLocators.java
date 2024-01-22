package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class First_PageLocators extends Base {
	public static WebElement getuserName() {
		WebElement UserName = driver.findElement(By.id("username"));
		return UserName;
	}

	public static WebElement getpassWord() {
		WebElement password = driver.findElement(By.id("password"));
		return password;
	}

	public static WebElement getloginClick() {
		WebElement click = driver.findElement(By.id("login"));
		return click;
	}

}
