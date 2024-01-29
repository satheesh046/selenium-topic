package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrolldownup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\SATHEESH\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		 JavascriptExecutor executor=(JavascriptExecutor) driver;
			
//			  executor.executeScript("window.scroll(0,450)", "");
//			  executor.executeScript("window.scroll(0,900)", ""); Thread.sleep(3000);
//			  executor.executeScript("window.scroll(0,-400)", ""); Thread.sleep(2000);
//			  executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
//			 
		 
WebElement button=driver.findElement(By.xpath("//*[@id=\'schedule\']/div[1]/div[1]/div/button[1]"));
//executor.executeScript("arguments[0].scrollIntoview(true);", button);
executor.executeScript("arguments[0].scrollIntoview(true);", button);
	}

}
