package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fourth_PageLocators extends Third_PageLocators {
	public static WebElement getfirstName() {
		WebElement fName=driver.findElement(By.id("first_name"));
		return fName;
	}
	public static WebElement getlastName() {
		WebElement lName=driver.findElement(By.id("last_name"));
		return lName;
	}
	public static WebElement getaddress() {
		WebElement address=driver.findElement(By.id("address"));
		return address;
	}
	public static WebElement getccNumber() {
		WebElement creditCard=driver.findElement(By.id("cc_num"));
		return creditCard;
	}
	public static WebElement getccType() {
		WebElement creditCardType=driver.findElement(By.id("cc_type"));
		return creditCardType;
	}
	public static WebElement getexpiryMonth() {
		WebElement expiryMonth=driver.findElement(By.id("cc_exp_month"));
		return expiryMonth;
	}
	public static WebElement getexpiryYear() {
		WebElement expiryYear=driver.findElement(By.id("cc_exp_year"));
		return expiryYear;
	}
	public static WebElement getcvv() {
		WebElement cvv=driver.findElement(By.id("cc_cvv"));
		return cvv;
	}
	public static WebElement getbookNow() {
		WebElement bookNow=driver.findElement(By.id("book_now"));
		return bookNow;
	}

}
