@Login
Feature: Login Validations
 

Background: 
Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"

  @Validlogin
  Scenario: Veify Login with valid creds
  
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login sucessfully and new page open

