package com.merit.stepDefinition;

import com.merit.pages.AddProduct_Edit_Verify;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDef_AddProduct_Edit_Verify {

	
	@Given("^click the all product$")
	public void click_the_all_product() throws Throwable {
		AddProduct_Edit_Verify.actions();
		AddProduct_Edit_Verify.log();
		
	}
	
	
	@When("^click the actions button$")
	public void click_the_actions_button() throws Throwable {
		AddProduct_Edit_Verify.edit();
		AddProduct_Edit_Verify.text();
	}

	@When("^click the edit button$")
	public void click_the_edit_button() throws Throwable {
		
		AddProduct_Edit_Verify.name();
		
	}
	
}
