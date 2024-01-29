package org.selenium;

import java.awt.AWTException;

import java.awt.Robot;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node01be9i7sdgwujem3gsojitwu9u437595.node0");
		WebElement upload = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89\']/span[1]"));
		upload.click();
		String fileupload="C:/Users/SATHEESH/Downloads/1.%20Introduction.pdf";
		StringSelection selection = new StringSelection(fileupload);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot board = new Robot();
		board.keyPress(KeyEvent.VK_CONTROL);
		board.keyPress(KeyEvent.VK_V);
		board.keyRelease(KeyEvent.VK_V);
		board.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		board.keyPress(KeyEvent.VK_ENTER);
		board.keyRelease(KeyEvent.VK_ENTER);
		
		//j_idt88:j_idt89_input
		
		////*[@id="j_idt88:j_idt89"]/span[1]
		
		
		
		
//C:\Users\SATHEESH\Downloads
		//driver.findElement(By.id("j_idt93:j_idt95")).click();
//C:\\Users\\SATHEESH\\Downloads
//		File file = new File("C:\\Users\\SATHEESH\\Downloads");
//		File[] listfile = file.listFiles();
//		for (File file2 : listfile) {
//			if (file2.getName().equals("TestLeaf Logo.png")) {
//				System.out.println("file is present");
//				break;

		//	}

	//	}
	

	
	
		
}
}
