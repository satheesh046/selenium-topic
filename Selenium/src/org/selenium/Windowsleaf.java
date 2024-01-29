package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowsleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0u8daqweva081mykipf0uzri1397030.node0");

		String oldwindows = driver.getWindowHandle();
		WebElement openbox = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		openbox.click();

		WebElement multiple = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
		multiple.click();
		int newwindow = driver.getWindowHandles().size();
		System.out.println("no of window open=" + newwindow);

		WebElement closewindows = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		closewindows.click();
		Set<String> childwindow = driver.getWindowHandles();
		for (String allwindow : childwindow) {
			if (!allwindow.equals(oldwindows)) {
				driver.switchTo().window(allwindow);
				driver.close();
			}
		}
	}

}
