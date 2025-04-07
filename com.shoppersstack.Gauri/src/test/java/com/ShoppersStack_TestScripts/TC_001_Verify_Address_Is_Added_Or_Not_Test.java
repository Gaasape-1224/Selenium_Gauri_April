package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_POM.AddressForm_Page;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;
import com.shoppersstack_GenericUtility.Base_Test;

public class TC_001_Verify_Address_Is_Added_Or_Not_Test extends Base_Test
{
	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		homePage.getAccountSettingBtn().click();
		homePage.getMyProfile().click();
		
		MyProfile_Page myProflePage=new MyProfile_Page(driver);
		myProflePage.getMyAddressesBtn().click();
		Thread.sleep(4000);
		MyAddresses_Page myAddressPage=new MyAddresses_Page(driver);
		myAddressPage.getAddAddressBtn().click();
		
		AddressForm_Page addressFormPage=new AddressForm_Page(driver);
		addressFormPage.getHomeRadioBtn().click();
		addressFormPage.getNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addressFormPage.getHouseInfoTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addressFormPage.getStreetInfoTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));
		addressFormPage.getLandmarkTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		
		webDriverUtility.selectByValue(addressFormPage.getCountryDropDown(),fileUtility.readDataFromPropertyFile("country"));
		webDriverUtility.selectByValue(addressFormPage.getStateDropDown(), fileUtility.readDataFromPropertyFile("state"));
		webDriverUtility.selectByValue(addressFormPage.getCityDropDown(), fileUtility.readDataFromPropertyFile("city"));
		
		addressFormPage.getPincodeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addressFormPage.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addressFormPage.getAddAddressbtn().click();
		
		myAddressPage.getCloseBtn().click();
		
		webDriverUtility.getWebPageScreenShot(driver);
	}
}
