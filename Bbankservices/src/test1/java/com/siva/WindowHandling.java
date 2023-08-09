package com.siva;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
//		String parentWindow=driver.getWindowHandle();
//		System.out.println(parentWindow);
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		String child=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.switchTo().window(child);
		//driver.close();
//		Set <String>w=driver.getWindowHandles();
//		System.out.println(w.size());
//		for(String a:w)
//		{
//			driver.switchTo().window(a);
//			System.out.println(driver.getTitle());
//		}
	}
	

}
