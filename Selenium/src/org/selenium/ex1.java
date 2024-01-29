package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions sa = new ChromeOptions();
		sa.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(sa);

		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01dnctoprp5cziho4zbys2bxg7471135.node0");
		WebElement sel=driver.findElement(By.className("ui-selectonemenu"));
		
		Select select=new Select(sel);
				select.selectByIndex(2);
				//driver.findElement(By.cssSelector(null))
		

	}

}
