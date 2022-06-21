package com.merit.stepDefinition;

import com.merit.pages.AddProduct_Verify;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_AddProduct_Verify {

	@Given("^admin is a login page$")
	public void admin_is_a_login_page()   {

		try {
			AddProduct_Verify.buttons();
			AddProduct_Verify.link();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}


	@When("^admin enters the valid username$")
	public void admin_enters_the_valid_username()  {
		AddProduct_Verify.username();


	}

	@When("^admin enters the valid password$")
	public void admin_enters_the_valid_password()  {
		AddProduct_Verify.password();

	}

	@When("^click the login button$")
	public void click_the_login_button() {
		AddProduct_Verify.login();

	}
	@When("^add the product$")
	public void add_the_product ()    {
		AddProduct_Verify. product();
		AddProduct_Verify. productadd();
		AddProduct_Verify. productname();
		AddProduct_Verify. cat();
		AddProduct_Verify. subcat();
		AddProduct_Verify. uploadimage();
		AddProduct_Verify. click();
		AddProduct_Verify. stock();
		AddProduct_Verify. cost();
		AddProduct_Verify. create();

	}

	@Then("^Admin able to see the homepage$")
	public void admin_able_to_see_the_homepage() throws Exception {

		AddProduct_Verify.close();
	}

}
