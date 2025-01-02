
Feature: magento

  @Createaccount 
  Scenario: Create an account with valid data  
    Given open chrome browser 
    Then  open url
    And click creat account button
    Then enter fist name 
    And enter lost name
    And enter gmail
    And enter password
    And enter confirm password
    When click the create an account button
    
    
   @singuppage
   Scenario: Create an sing up with valid data 
   
   Given open chromebrowser 
    Then  open Url 
    And click creat sing up button
    And enter valid email
    And enter valid  password
    Then click sing up button
    

  
