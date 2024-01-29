package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//co.setBrowserVersion("116");
		WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.amazon.in/");
//WebElement signin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
//signin.click();
//WebElement create=driver.findElement(By.id("createAccountSubmit"));
//create.click();
		WebElement signin = driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span"));
		signin.click();
		WebElement text = driver.findElement(By.id("ap_email"));
		text.sendKeys("9952343410" + Keys.ENTER);
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("hardworks" + Keys.ENTER);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("samsung");
		WebElement box = driver.findElement(By.id("nav-search-submit-button"));
		box.click();

	}

}
