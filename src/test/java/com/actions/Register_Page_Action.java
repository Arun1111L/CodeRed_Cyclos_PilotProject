package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.locators.Register_Page_Locators;
import com.utility.Helper_Class;

public class Register_Page_Action {
	
	WebDriver driver;
	Register_Page_Locators RP = new Register_Page_Locators();
	
	public Register_Page_Action() {
		RP = new Register_Page_Locators();
		PageFactory.initElements(Helper_Class.getDriver(),RP);
	}
	public void Register() {
		RP.Register.click();
	}
	
	public void setName(String strName) {
		RP.Name.sendKeys(strName);
	}
	
	public void setLoginName(String strLoginName) {
		RP.LoginName.sendKeys(strLoginName);
	}
	
	public void setEmail(String strEmail) {
		RP.Email.sendKeys(strEmail);
	}
	
	public void setPassword(String strPassword) {
		RP.Password.sendKeys(strPassword);
	}

	public void setConfirmPassword(String strConfirmPassword) {
		RP.ConfirmPassword.sendKeys(strConfirmPassword);
	}
	
	public void RegistrationAgreement() {
		RP.RegistrationAgreement.click();
	}

//	public void Verification() {
//		RP.Verification.click();
//	}
//	public void SubmitButton() {
//		RP.SubmitButton.click();
//	}
}
