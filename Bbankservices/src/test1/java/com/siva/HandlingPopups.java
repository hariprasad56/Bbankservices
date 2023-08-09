package com.siva;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HandlingPopups {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 options.addArguments("--disable-notification");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.flipkart.com/account/login?signup=true&ret=/");
	driver.manage().window().maximize();
	//handling hidden division popup
	driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("8019114220)");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8019114220");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	//handling popups using alert
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='alertBox']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//button[@id='promptBox']")).click();
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	Thread.sleep(5000);
	driver.switchTo().alert().sendKeys("hari");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	driver.close();
	//handle fileupload popup
	driver.findElement(By.xpath("//input[@value='Upload CV']")).sendKeys("D://sample resume.doc");
	//handle notification popup
//	  ChromeOptions options = new ChromeOptions();
//	  options.addArguments("--disable-notification");
//	  WebDriver driver = new ChromeDriver(options);

	
	
}
}
