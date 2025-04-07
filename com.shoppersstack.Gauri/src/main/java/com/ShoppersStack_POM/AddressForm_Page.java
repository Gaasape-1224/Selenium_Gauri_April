package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page 
{
	public AddressForm_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Home")
	private WebElement homeRadioBtn;
	
	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement houseInfoTextField;
	
	@FindBy(id="Street Info")
	private WebElement streetInfoTextField;
	
	@FindBy(id="Landmark")
	private WebElement landmarkTextField;
	
	@FindBy(id="Country")
	private WebElement countryDropDown;
	
	@FindBy(id="State")
	private WebElement stateDropDown;
	
	@FindBy(id="City")
	private WebElement cityDropDown;
	
	@FindBy(id="Pincode")
	private WebElement pincodeTextField;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTextField;
	
	@FindBy(id="addAddress")
	private WebElement addAddressbtn;

	public WebElement getHomeRadioBtn() {
		return homeRadioBtn;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseInfoTextField() {
		return houseInfoTextField;
	}

	public WebElement getStreetInfoTextField() {
		return streetInfoTextField;
	}

	public WebElement getLandmarkTextField() {
		return landmarkTextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getAddAddressbtn() {
		return addAddressbtn;
	}
}
