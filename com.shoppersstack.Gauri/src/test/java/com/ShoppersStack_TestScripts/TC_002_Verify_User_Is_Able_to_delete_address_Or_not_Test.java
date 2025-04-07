package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;
import com.shoppersstack_GenericUtility.Base_Test;

public class TC_002_Verify_User_Is_Able_to_delete_address_Or_not_Test extends  Base_Test {
	
	@Test
	public void deleteAddress() throws IOException {
		
		homePage.getAccountSettingBtn().click();
		homePage.getMyProfile().click();
		
		MyProfile_Page myProfilePage= new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();
		
		MyAddresses_Page myAddressPage = new MyAddresses_Page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(myAddressPage.getDeleteBtn())).click();
		wait.until(ExpectedConditions.elementToBeClickable(myAddressPage.getYesBtn())).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		webDriverUtility.getWebPageScreenShot(driver);
		
		
	}
	
	

}
