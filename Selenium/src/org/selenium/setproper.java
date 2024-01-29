package org.selenium;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setproper {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SATHEESH\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
	}

}
