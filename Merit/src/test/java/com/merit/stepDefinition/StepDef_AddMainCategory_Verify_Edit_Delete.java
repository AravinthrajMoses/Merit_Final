package com.merit.stepDefinition;

import com.merit.pages.AddMainCategory_Verify_Edit_Delete;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_AddMainCategory_Verify_Edit_Delete {
	
		@Given("^Entering the Login credentials$")
		public void admin_is_login_page()  {
			 AddMainCategory_Verify_Edit_Delete.driverurl();	   
		}
		@When("^Enter username$")
		public void enter_the_username()  {
			 AddMainCategory_Verify_Edit_Delete.username();
		}

		@When("^Enter password$")
		public void enter_the_password() {
			 AddMainCategory_Verify_Edit_Delete.password();
		}

		@Then("^Open Admin Dashboard page$")
		public void admin_Dashboard_page()  {
			 AddMainCategory_Verify_Edit_Delete.login();  
			 AddMainCategory_Verify_Edit_Delete.tabclose();
		}
		
		@Given("^Open the Manage Category page$")
		public void manage_Category_page_open()   {
			 AddMainCategory_Verify_Edit_Delete.driverurl();
			 AddMainCategory_Verify_Edit_Delete.username();
			 AddMainCategory_Verify_Edit_Delete.password();
			 AddMainCategory_Verify_Edit_Delete.login();   
			 AddMainCategory_Verify_Edit_Delete.manage();
		}

		@When("^open Main Category page$")
		public void main_Category_page_open()  {
			 AddMainCategory_Verify_Edit_Delete.maincategory(); 
		}

		@When("^Add the Main category Name$")
		public void add_the_Product_Name()   {
			 AddMainCategory_Verify_Edit_Delete.addnew();
			 	}

		@When("^create product name$")
		public void product_name_create()   {
			 AddMainCategory_Verify_Edit_Delete.productcategory();
		}

		@When("^create Slug name$")
		public void slug_name_create()   {
			 AddMainCategory_Verify_Edit_Delete.productname();
		}

		@When("^upload Image$")
		public void upload_Image()  {
			 AddMainCategory_Verify_Edit_Delete.maincategoryfileupload(); 
		}

		@When("^click the create product$")
		public void create_product()   {
			 AddMainCategory_Verify_Edit_Delete.maincategory_create();  
		}

		@When("^delete the product in the main category$")
		public void product_delete() {
			 AddMainCategory_Verify_Edit_Delete.maindelet();
		}

		@Then("^confirming the product Delete$")
		public void add_main_category_product_name_confirm_Delete()   {
			 AddMainCategory_Verify_Edit_Delete.mainconfromdelete();
			 AddMainCategory_Verify_Edit_Delete.tabclose();
		}
		

	}