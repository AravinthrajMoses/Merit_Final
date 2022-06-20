Feature: To check the functionality of manage category in Merit Gift Shop Application 
  Scenario: To Login Admin page
    Given Entering the Login credentials
    When Enter username
    And Enter password
    Then Open Admin Dashboard page
    
  Scenario: Adding and Deleting the Main category in Manage Category
	Given Open the Manage Category page
	When open Main Category page
	And Add the Main category Name
	And create product name 
	And create Slug name
	And upload Image
	And click the create product
	And delete the product in the main category
	Then confirming the product Delete
	
	 Scenario: To Login the Admin page
    Given Entering Login credentials 
    When Enter the username
    And Enter the password
    Then Open the Admin Dashboard page
     
	Scenario: Adding and Deleting the Sub category in Manage Category
	Given open Manage Category page 
	When open the sub Category page
	And Add the sub category Product Name
	And select the drop down 
	And create the sub category product name 
	And create the Slug name 
	And upload the Image
	And click create product
	And  Delete the product in sub category
	Then confirming the sub category product delete