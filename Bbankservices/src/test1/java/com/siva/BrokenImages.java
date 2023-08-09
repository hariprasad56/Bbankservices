package com.siva;
import java.net.URL;
import java.util.List;
import java.net.HttpURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BrokenImages {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.tagName("img"));
		for(WebElement link: links) {
			String url=link.getAttribute("src");
			if(url!=null && !url.isEmpty())
			{
				try {
					HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
					connection.setRequestMethod("HEAD");
					
					connection.connect();
					int responseCode=connection.getResponseCode();
					
					if(responseCode>=400) {
						System.out.println("Broken image:"+url);
					}
				}catch (Exception e) {
					System.out.println("Exception occured while checking URL:"+url);
				}
			}}
			}}
	

