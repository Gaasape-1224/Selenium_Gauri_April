package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//span[contains(@class,'BaseBadge-badge MuiBadge-badge MuiBadge')]")
	private WebElement accountsettingBtn;
	
	@FindBy(xpath ="//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath ="//li[text()='Logout']")
	private WebElement logoutBtn;

	public WebElement getAccountSettingBtn() {
		return accountsettingBtn;
		
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
}