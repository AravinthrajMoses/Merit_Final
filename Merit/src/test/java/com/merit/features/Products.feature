Feature: To check the functionalities of order for AddProduct
  
 Scenario: To login Admin page of MeritGiftShop
    Given admin is a login page
    When admin enters the valid username
    And admin enters the valid password
    And click the login button
    And add the product
    Then Admin able to see the homepage
  
    Scenario: To check the actions for edit button
    Given click the all product
    When click the actions button
    And click the edit button
    
    Scenario: To Check the Deactivate 
    Given Select all product
    Then Select activate button
    Then Select deactivate 

    Scenario: To check the actions for delete button
    Given click the all products
    When click to the actions button
    And click the delete button
   