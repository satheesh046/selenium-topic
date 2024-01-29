package org.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pagework {
public static WebElement login(WebDriver driver) {
	return driver.findElement(By.id("inputLastName"));
	}
public static WebElement firstname(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@id='inputFirstName']"));
	}
public static WebElement phone(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@type='tel']"));
}
}
