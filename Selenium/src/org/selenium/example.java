package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.setBrowserVersion("116");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
	}

}
