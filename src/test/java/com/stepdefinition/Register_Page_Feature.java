package com.stepdefinition;

import com.actions.Register_Page_Action;

import com.utility.Helper_Class;
import com.utility.Utility_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_Page_Feature {
	Register_Page_Action RPA = new Register_Page_Action();
	Utility_Class UC = new Utility_Class();
	@Given("User is on Demo Cyclos classic Homepage")
	public void user_is_on_demo_cyclos_classic_homepage() {
		Helper_Class.openPage(UC.url);
	}

	@When("User click the register button")
	public void user_click_the_register_button() {
		RPA.Register();
	}

	@When("User enter the Name")
	public void user_enter_the_name() {
	    RPA.setName(UC.strName);
	}

	@When("User enter the LoginName")
	public void user_enter_the_login_name() {
		RPA.setLoginName(UC.strLoginName);
	}

	@When("User enter the Email")
	public void user_enter_the_email() {
		RPA.setEmail(UC.strEmail);
	}

	@When("User enter the Password")
	public void user_enter_the_password() {
		RPA.setPassword(UC.strPassword);
	}

	@When("User enter the confirmPassword")
	public void user_enter_the_confirm_password() {
		RPA.setConfirmPassword(UC.strConfirmPassword);
	}

	@When("User click the RegistrationAgreement")
	public void user_click_the_registration_agreement() {
	    RPA.RegistrationAgreement();
	}

//	@When("User click the Verification")
//	public void user_click_the_verification(){
//		RPA.Verification();
//	}
//
//	@Then("User click the SubmitButton")
//	public void user_click_the_submit_button() {
//	    RPA.SubmitButton();
//	}



}
