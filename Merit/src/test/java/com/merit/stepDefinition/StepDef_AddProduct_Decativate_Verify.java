package com.merit.stepDefinition;

import com.merit.pages.AddProduct_Deactivate_Verify;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef_AddProduct_Decativate_Verify {

	@Given("^Select all product$")
	public void select_all_product() throws Throwable {
	   
		AddProduct_Deactivate_Verify.allProduct();
		AddProduct_Deactivate_Verify.log1();
		
	}

	@Then("^Select activate button$")
	public void select_activate_button() throws Throwable {
	   
		AddProduct_Deactivate_Verify.stat();
		
	}

	@Then("^Select deactivate$")
	public void select_deactivate() throws Throwable {
	   
		AddProduct_Deactivate_Verify.status();
		AddProduct_Deactivate_Verify.close();
	}


}
