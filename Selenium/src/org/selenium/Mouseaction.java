package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		//dropme around
		WebElement dropme=driver.findElement(By.id("form:conpnl_content"));
		Actions target=new Actions(driver);
		target.dragAndDropBy(dropme, 200,0).build().perform();
		
		//drag and drop
		WebElement from=driver.findElement(By.id("form:drag_content"));
		WebElement to=driver.findElement(By.id("form:drop_content"));
		//Actions target=new Actions(driver);
		//target.clickAndHold(from).moveToElement(to).release(to).build().perform();
		target.dragAndDrop(from, to).build().perform();
		
		//draggable coloumns
		WebElement coloumns1=driver.findElement(By.xpath("//*[@id=\'form:j_idt125\']/span[1]"));
		target.dragAndDropBy(coloumns1, -100, 0).build().perform();
		WebElement coloumns2=driver.findElement(By.xpath("//*[@id=\'form:j_idt125\']/span[2]"));
		target.dragAndDropBy(coloumns2, 50, 0).build().perform();
		
		//resize image
		WebElement resize=driver.findElement(By.xpath("//*[@id=\'form\']/div/div[1]/div[3]"));
		//target.dragAndDropBy(resize,-50, -50).build().perform();
		target.dragAndDropBy(resize, 150, 130).build().perform();
		String value=resize.getAttribute("id");
		System.out.println(value);
		
		//progress bar
		//WebElement bar=driver.findElement(By.id("form:j_idt119"));
		//bar.click();
		
		//table coloum
		WebElement interchange=driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th[2]"));
		WebElement interchange1=driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th[3]"));
		target.dragAndDrop(interchange,interchange1).build().perform();
		
//form:j_idt94:j_idt95
		}

}
