package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobuttonex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://leafground.com/button.xhtml");
//		WebElement button1=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt90\']/span"));
//button1.click();
WebElement button2=driver.findElement(By.className("card"));
boolean two=button2.isDisplayed();
System.out.println(two);
WebElement button4=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
String col=button4.getCssValue("background");
System.out.println(col);
WebElement button5=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
Point xypoint=button5.getLocation();
int x=xypoint.getX();
int y=xypoint.getY();
System.out.println(x);
System.out.println(y);
System.out.println("height="+button5.getRect().getHeight());
System.out.println("width="+button5.getRect().getWidth());





	}

	

}
