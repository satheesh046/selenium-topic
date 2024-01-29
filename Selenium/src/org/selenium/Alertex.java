package org.selenium;

import java.util.List;
import java.util.Set;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement alert1=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[1]"));
		alert1.click();
Alert alertcheck =driver.switchTo().alert();
Thread.sleep(3000);
alertcheck.dismiss();
WebElement alert2=driver.findElement(By.xpath("	//*[@id=\'j_idt88:j_idt93\']/span[2]	"));
alert2.click();
Alert alertcheck2=driver.switchTo().alert();
Thread.sleep(2000);
alertcheck2.accept();
WebElement alert3=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]"));
alert3.click();
WebElement alert31=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
alert31.click();
//WebElement alert4=driv er.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span[2]"));
//alert4.click();
//
//
//Alert close=driver.switchTo().alert();
//close.accept();


//WebElement alert41=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt101\']/div[1]/a"));
//alert41.click();
//close.accept();

driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]")).click();
Alert type=driver.switchTo().alert();
type.sendKeys("satheesh");
Thread.sleep(3000);
type.accept();

WebElement alert6=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt106\']/span[2]"));
alert6.click();

//Alert alert61=driver.switchTo().alert();
//alert61.dismiss();
driver.findElement(By.id("j_idt88:j_idt108")).click();
driver.findElement(By.id("j_idt88:j_idt111")).click();
driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt112\']/div[1]/a[2]/span")).click();
driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt112\']/div[1]/a[1]")).click();
List<WebElement> li=driver.findElements(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input/li"));

	}
}
