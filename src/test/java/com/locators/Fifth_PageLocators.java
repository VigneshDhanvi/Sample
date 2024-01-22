package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class Fifth_PageLocators extends Fourth_PageLocators{
	public static WebElement getorderId() {
		WebElement orderId=driver.findElement(By.xpath("//input[@id = 'order_no']"));
	
		return orderId;
	}
	
}
