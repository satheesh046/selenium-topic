package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframeex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
driver.get("https://www.leafground.com/frame.xhtml");

driver.switchTo().frame(0);
WebElement first=driver.findElement(By.id("Click"));
first.click();

driver.switchTo().defaultContent();
//driver.switchTo().frame(0);
driver.switchTo().frame(2);
driver.switchTo().frame("frame2");
WebElement second=driver.findElement(By.id("Click"));
second.click();
driver.switchTo().defaultContent();

List<WebElement>total=driver.findElements(By.tagName("iframe"));
int s=total.size();
System.out.println(s);
	}

}
