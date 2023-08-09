package com.siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Frames1 {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Skip Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']")).click();
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[@href='#Single']")).click();
	    WebElement ad=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	    Thread.sleep(5000);
	    driver.switchTo().frame(ad);
	    System.out.println(driver.getTitle());
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("hARIPRASAD");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	    WebElement ad1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(ad1);
	    Thread.sleep(3000);
	    WebElement ad2=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][1]"));
	    driver.switchTo().frame(ad2);
	    driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Gireesh");
	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
	}

}
