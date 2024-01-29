package org.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageobject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://phptravels.org/register.php");
		
pagework.login(driver).sendKeys("satheesh");
Thread.sleep(2000);
pagework.login(driver).clear();
pagework.firstname(driver).sendKeys("v");
pagework.phone(driver).sendKeys("1234567890");
pagework.login(driver).sendKeys("hello");

//WebElement login=driver.findElement(By.id("inputLastName"));
//login.sendKeys("satheesh");
//
//WebElement firstname=driver.findElement(By.xpath("//input[@id='inputFirstName']"));
//firstname.sendKeys("v");
//
//WebElement phone=driver.findElement(By.xpath("//*[@type='tel']"));
//phone.sendKeys("1234567890");
	}

}
