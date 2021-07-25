Feature: Free CRM LoginData Feature

#Without Examples Keyword
#
#Scenario: Free CRM Login DataDriven Test Scenario
#
#Given User is already on Login Page
#When Title of the Login Page is Cogmento CRM
#Then User Enters "sagar.lankegowda@gmail.com" and "Eclipse$@123"
#Then User Clicks on Login Button
#And User is on Home Page


#With Examples Keyword
Scenario Outline: Free CRM Login DataDriven Test Scenario

Given User is already on Login Page
When Title of the Login Page is Cogmento CRM
Then User Enters "<username>" and "<password>"
Then User Clicks on Login Button
And User is on Home Page
Then Close the browser


Examples:
  |username| password|
  |sagar.lankegowda@gmail.com| Eclipse$@123|
  |sagar.lankegowda@gmail1.com| Eclipse$@1234|
  
  
