package com.runner;


import org.openqa.selenium.chrome.ChromeDriver;

import com.locators.Fifth_PageLocators;

public class Hook extends Fifth_PageLocators{
	
	public void launchBro() {
		driver = new ChromeDriver();
	}
	
}
