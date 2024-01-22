package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_PageLocators extends First_PageLocators {
	public static WebElement getlocation() {
		WebElement location = driver.findElement(By.id("location"));
		return location;
	}

	public static WebElement gethotels() {
		WebElement hotel = driver.findElement(By.id("hotels"));
		return hotel;
	}

	public static WebElement getroomType() {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		return roomtype;
	}

	public static WebElement getnumOfRoom() {
		WebElement numberofrooms = driver.findElement(By.id("room_nos"));
		return numberofrooms;
	}

	public static WebElement getcheckIn() {
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		return checkin;
	}
	public static WebElement getcheckOut() {
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		return checkout;
	}
	public static WebElement getadults() {
		WebElement adults = driver.findElement(By.id("adult_room"));
		return adults;
	}
	public static WebElement getchilds() {
		WebElement childs = driver.findElement(By.id("child_room"));
		return childs;
	}
	public static WebElement getsearch() {
		WebElement search = driver.findElement(By.id("Submit"));
		return search;
	}
}
