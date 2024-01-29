package org.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafwindows {

	private static final WindowType Alert = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
driver.get("https://www.leafground.com/window.xhtml;jsessionid=node04qdz2354c26x1uwcp1fdo8wg4472145.node0");
driver.manage().window().maximize();
String oldwindow=driver.getWindowHandle();
WebElement newwin=driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
newwin.click();
//Set<String>win=driver.getWindowHandles();
//driver.switchTo().window(null);
//Iterator closeme=multi.iterator();

	WebElement exceptme=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
	exceptme.click();
	Set<String>multi=driver.getWindowHandles();
	for (String string : multi) {
		if(!string.equals(oldwindow)) {
			driver.switchTo().window(string);
		
			driver.close();
			
		}
		
		
	}
//	Iterator<String>allwindows=multi.iterator();
//	String parent=allwindows.next();
//	String childwindow=allwindows.next();
//	driver.switchTo().window(childwindow);
//	driver.switchTo().newWindow(Alert);

	}

}
