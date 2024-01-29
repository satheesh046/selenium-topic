package org.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Workwithtable {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
driver.get("https://www.leafground.com/table.xhtml#");
List<WebElement> header=driver.findElements(By.tagName("th"));

for (WebElement string : header) {
	String text=string.getText();
	System.out.println(text);
	
	
}
List<WebElement> rows=driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr"));
int no=rows.size();
System.out.println(no);
List<WebElement>coloumn=driver.findElements(By.xpath("//tr[@role='row']"));
int col=coloumn.size();
System.out.println(col);

List<WebElement>row2=driver.findElements(By.cssSelector("tr"));
for (WebElement webElement : row2) {
	String h1=webElement.getText();
			System.out.println(h1);
	////th[@id='form:j_idt89:j_idt94']
}
	}

}
