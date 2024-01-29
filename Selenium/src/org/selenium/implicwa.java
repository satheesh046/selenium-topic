package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.leafground.com/input.xhtml;jsessionid=node011iwzqbfxn2zm1cuuhseqkmjc8651819.node0");
WebElement first=driver.findElement(By.id("j_idt88:name"));
first.click();
	}

}
