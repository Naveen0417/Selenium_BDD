@HomePage
Feature: Homepage Validations
 

Background: 
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login sucessfully and new page open

  @VeifyHomePage
  Scenario: Verify The Home page Tabs
				Then User should validate "Admin" tabs clickable in HomePage
				
	@VeifyPIMtab
	Scenario: Verify The Home page Tabs
				Then User should validate "PIM" tabs clickable in HomePage
 