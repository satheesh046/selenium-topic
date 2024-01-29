package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://jqueryui.com/selectmenu/");
		Thread.sleep(4000);
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//div[@class='gb_0d']//preceding::div[2]")).click();
//	sendKeys("infomats"+Keys.ENTER);
		WebElement speed=driver.findElement(By.className("ui-selectmenu-text"));
		Select select=new Select(speed);
		select.selectByVisibleText("slow");
		
		
		
//		driver.quit();	
	}

}
