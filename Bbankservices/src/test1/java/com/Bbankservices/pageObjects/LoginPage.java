package com.Bbankservices.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	@FindBy(name="uid")WebElement usname;
	
	@FindBy(name="password")WebElement pasword;
	
	@FindBy(name="btnLogin")WebElement logbutton;
	
	public void setusername(String uname)
	{
		usname.sendKeys(uname);
	}
	public void setpassword(String password)
	{
		pasword.sendKeys(password);
	}
	public void setloginButton()
	{
		logbutton.click();
	}

}
