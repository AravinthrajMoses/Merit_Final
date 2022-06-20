package com.merit.stepDefinition;

import com.merit.pages.AddChildCategory_Verify_Edit_Delete;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_AddChildCategory_Verify_Edit_Delete {
	@Given("^Entering Login credentials$")
	public void admin_is_login_page() {
		 AddChildCategory_Verify_Edit_Delete.driverurl1();   
	}

	@When("^Enter the username$")
	public void enter_the_username()   {
			AddChildCategory_Verify_Edit_Delete.username1();
	}

	@When("^Enter the password$")
	public void enter_the_password() {
			AddChildCategory_Verify_Edit_Delete.password1();
	}
	@Then("^Open the Admin Dashboard page$")
	public void admin_Dashboard_page()  {
			AddChildCategory_Verify_Edit_Delete.login1();
			 AddChildCategory_Verify_Edit_Delete.tabclose1();
	}
	
//sub category
	@Given("^open Manage Category page$")
	public void smanage_Category_page_open()  {
		 AddChildCategory_Verify_Edit_Delete.driverurl1();   
			AddChildCategory_Verify_Edit_Delete.username1();
			AddChildCategory_Verify_Edit_Delete.password1();
			AddChildCategory_Verify_Edit_Delete.login1();
			AddChildCategory_Verify_Edit_Delete.manage();
	}

	@When("^open the sub Category page$")
	public void sub_Category_page_open()   {
			AddChildCategory_Verify_Edit_Delete.subcategory();
	}

	@When("^Add the sub category Product Name$")
	public void sub_Add_the_Product_Name()  {
			AddChildCategory_Verify_Edit_Delete.subaddnew();
	}

	@When("^select the drop down$")
	public void drob_down_select() {
			AddChildCategory_Verify_Edit_Delete.subcategory_drop_down();
	}

	@When("^create the sub category product name$")
	public void sub_product_name_create()  {
			AddChildCategory_Verify_Edit_Delete.subproductcategory();
	}

	@When("^create the Slug name$")
	public void sub_Slug_name_create()   {
			AddChildCategory_Verify_Edit_Delete.subproductname();
	}

	@When("^upload the Image$")
	public void sub_upload_Image()   {
			AddChildCategory_Verify_Edit_Delete.subcategoryfileupload();
	}

	@When("^click create product$")
	public void sub_create_product()   {
			AddChildCategory_Verify_Edit_Delete.subcategory_create();
	}

	@When("^Delete the product in sub category$")
	public void sub_product_delete()  {
			AddChildCategory_Verify_Edit_Delete.subdelet();
	}

	@Then("^confirming the sub category product delete$")
	public void add_sub_category_product_name_confirm_Delete()  {
		 AddChildCategory_Verify_Edit_Delete.subconfromdelete();
		 AddChildCategory_Verify_Edit_Delete.tabclose1();
	}



}