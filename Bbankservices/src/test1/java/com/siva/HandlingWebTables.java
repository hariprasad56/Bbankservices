package com.siva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWebTables {
	public static void main(String args[])
	{
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("//table[@class='ws-table-all']"));
		List<WebElement> rows=table.findElements(By.xpath("//table[@class='ws-table-all']//tr"));
		int rno=rows.size();
		System.out.println(rno);
		List<WebElement> columns=table.findElements(By.xpath("//table[@class='ws-table-all']//th"));
		int cno=columns.size();
		System.out.println(cno);
		for(int i=1;i<rno;i++)
		{
			String value=rows.get(i).getText();
			System.out.println(value);
		}
		for(WebElement cvalues:columns)
		{
			String result=cvalues.getText();
			System.out.println(result);
		}
		WebElement rew=table.findElement(By.xpath("//table[@class='ws-table-all']//tr[5]/td[2]"));
		String ha=rew.getText();
		System.out.println(ha);
	}
	

}
