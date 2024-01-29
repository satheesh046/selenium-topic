package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tablemarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://dreamcivil.com/cement-price-list/");
		List<WebElement> coloumn = driver
				.findElements(By.xpath("//table[@style='width: 95.6137%; height: 1708px;']/tbody/tr/td[1]"));
		List<WebElement> price = driver
				.findElements(By.xpath("//table[@style='width: 86.8756%; height: 1589px;']/tbody/tr/td[3]"));

		for (int i = 0; i < coloumn.size(); i++) {
			// System.out.println(coloumn.get(i).getText());
			if (coloumn.get(i).getText().equalsIgnoreCase("Ramco Cement")) {
				System.out.println(price.get(i).getText());
			}
			}
		System.out.println(coloumn.size());
		List<WebElement>jaypee=driver.findElements(By.xpath("//table[@style='width: 86.8756%; height: 1589px;']/tbody/tr[8]/td"));
		for(int j=0;j<jaypee.size();j++) {
			
			System.out.println(jaypee.get(j).getText());
		}
	}
}




