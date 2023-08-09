package com.siva;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.ArrayList;
import java.util.HashSet;
public class HandlingFrames {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(options);
//		driver.get("https://www.w3schools.com/js/js_popup.asp");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[text()='Try it Yourself »'][1]")).click();
//		String parent=driver.getWindowHandle();
//		System.out.println(parent);
//		driver.findElement(By.xpath("//a[text()='Try it Yourself »'][1]")).click();
//		String parent1=driver.getWindowHandle();
//		System.out.println(parent1);
//		ArrayList<String>adrs=new ArrayList<String>(driver.getWindowHandles());
//		Thread.sleep(3000);
//		HashSet<String>ads=new HashSet<String>(driver.getWindowHandles());
//		driver.switchTo().window(adrs.get(1));
//		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
//		driver.switchTo().frame(frame);
//		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
//		//Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.close();
//		
		//handling file upload popup
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.findElement(By.xpath("//button[text()='Skip Sign In']")).click();
		driver.findElement(By.xpath("//a[text()='More']")).click();
		driver.findElement(By.xpath("//a[text()='File Upload']")).click();
		driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("C:\\Users\\user\\Pictures\\Screenshots\\Screenshot 2023-05-29 101509.png");
			
	}

}
