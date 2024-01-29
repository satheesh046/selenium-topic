package org.selenium;

import java.io.FileInputStream;





import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

public class Datadriven {
	public void excel() throws BiffException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\SATHEESH\\Desktop\\driven.xls");
		Workbook work=Workbook.getWorkbook(file);
		Sheet sheet=work.getSheet(0);
		int rows=sheet.getRows();
		int columns=sheet.getColumns();
		String testdata[][]=new String[rows-1][columns]; 
		for(int i=1;i<rows;i++){
			for(int j=0;j<columns;j++) {
				testdata[i-1][j]=sheet.getCell(j,i).getContents();
			}
		}
		
	



	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver= new ChromeDriver(co);
driver.get("https://www.leafground.com/input.xhtml");
WebElement username=driver.findElement(By.xpath("//*[@id='j_idt88:name']"));
username.sendKeys("satheesh");
WebElement password=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
password.sendKeys(" ,India");
	}
}


