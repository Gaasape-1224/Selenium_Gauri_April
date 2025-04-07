package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passTextField;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginBtn;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPassTextField() {
		return passTextField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}	
}
