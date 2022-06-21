package com.merit.stepDefinition;

import com.merit.pages.AddProduct_Delete_Verify;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_AddProduct_Delete_Verify {

	@Given("^click the all products$")
	public void click_the_all_products() throws Throwable {
	    
		AddProduct_Delete_Verify.actions();
		AddProduct_Delete_Verify.log();
		
	}

	@When("^click to the actions button$")
	public void click_to_the_actions_button() throws Throwable {
	  
		AddProduct_Delete_Verify.delete();
		
	}

	@When("^click the delete button$")
	public void click_the_delete_button() throws Throwable {
		
		AddProduct_Delete_Verify.ok();
		AddProduct_Delete_Verify.close();
	   
	}

	
}
