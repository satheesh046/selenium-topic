package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tablepopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.worldometers.info/world-population/population-by-country/");
		//WebElement table=driver.findElement(By.id("example2"));
		List<WebElement>countries=driver.findElements
				(By.xpath("//*[@id=\'example2\']/tbody/tr/td[2]"));
		List<WebElement> pop=driver.findElements(By.xpath("//*[@id=\'example2\']/tbody/tr/td[3]"));
		for (int i=0;i<countries.size();i++) {
			//System.out.println(countries.get(i).getText());
if(countries.get(i).getText().equalsIgnoreCase("germany")) {
	System.out.println(pop.get(i).getText());
		}
		}
			System.out.println(countries.size());
			//div[@class='table-responsive']//th[2]//following::tr/td[2]
			//div[@class='table-responsive']//th[2]//following::tr
			////table[@id='example2']//thead//following::tr//td[2]
			//*[@id="example2"]/tbody/tr[2]/td[2]
			//table[@id='example2']//thead//following::tr//td[2]
			//*[@id="example2"]/tbody/tr[55]/td[2]/a
			//*[@id="example2"]/tbody/tr[3]/td[3]
			//*[@id="example2"]/tbody/tr[1]/td[2]/a
	}


}
