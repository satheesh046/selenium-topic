package org.selenium;

import org.bouncycastle.crypto.prng.ThreadedSeedGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.leafground.com/checkbox.xhtml");
	
		WebElement firstbox=driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
		firstbox.click();
		
		//secondbox
		driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]")).click();
		
		//thirdbox
		driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]")).click();

		//fourth
		driver.findElement(By.xpath("//*[@id=\'j_idt87:ajaxTriState\']/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'j_idt87:ajaxTriState\']/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'j_idt87:ajaxTriState\']/div[2]")).click();

		//fifthbox
		driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt100\']/div[2]")).click();

		//sixthbox
		WebElement sixthbox=driver.findElement(By.id("j_idt87:j_idt102"));
		boolean check=sixthbox.isDisplayed();
		System.out.println(check);
		
		//seventhbox
		WebElement seventhbox=driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple\']/ul"));
		seventhbox.click();
		driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[3]/label")).click();
		driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[5]/div/div[2]")).click();

		
	}

}
