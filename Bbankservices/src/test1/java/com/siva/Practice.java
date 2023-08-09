package com.siva;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.google.common.io.Files;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Practice {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException, IOException
	{
		for(int i=0;i<5;i++)
		{
	    driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy--MM--dd--HH--mm--ss");
		Date de=new Date();
		String dateTime=sdf.format(de);
		String path="C:\\Users\\user\\eclipse-workspace\\Bbankservices\\Screenshots";
		File dst=new File(path,"imag_"+ dateTime +".jpg");
		Files.copy(src, dst);
		driver.close();
		}
		EventFiringWebDriver ab=new EventFiringWebDriver(driver);
		File scr=ab.getScreenshotAs(OutputType.FILE);
		File dts=new File("C:\\Users\\user\\eclipse-workspace\\Bbankservices\\Screenshots\\.jpg");
		Files.copy(scr, dts);
			
		WebElement ele=driver.findElement(By.xpath("//a[text()='Sign in securely']"));
		File crs=ele.getScreenshotAs(OutputType.FILE);
		File tsd=new File("C:\\Users\\user\\eclipse-workspace\\Bbankservices\\Screenshots\\.png");
		Files.copy(crs, tsd);		
	}
}
