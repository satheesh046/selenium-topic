package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions co=new ChromeOptions();
co.setBrowserVersion("116");
WebDriver driver=new ChromeDriver(co);
driver.get("https://www.google.com/search?sca_esv=559959589&sxsrf=AB5stBhOHFU9P9k5o2aBMnQxcMAETp25Fg:1692945452546&q=google&tbm=vid&source=lnms&sa=X&sqi=2&ved=2ahUKEwi7ysqimfeAAxVOiO4BHbzPCW8Q0pQJegQIChAB&biw=1536&bih=707&dpr=1.25");
	}

}
