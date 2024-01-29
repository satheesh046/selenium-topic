package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafgroundex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://leafground.com/input.xhtml");
				driver.findElement(By.id("j_idt88:name")).sendKeys("satheesh046@gmail.com");
				driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("-INDIA");
				driver.findElement(By.id("j_idt88:j_idt95")).clear();
				
				WebElement disable=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
				boolean enable=disable.isEnabled();
				System.out.println(enable);
				WebElement retrive= driver.findElement(By.id("j_idt88:j_idt97"));
				
				
				String trial2=retrive.getAttribute("value");
				
				System.out.println(trial2);
				driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("satheesh046@gmail.com"+Keys.TAB);
				WebElement address=driver.findElement(By.id("j_idt88:j_idt101"));
				address.sendKeys("ponnamapet, salem-1");
				driver.findElement(By.id("j_idt106:thisform:age")).sendKeys("enter the field"+Keys.ENTER);
				
				

				

	}

}
