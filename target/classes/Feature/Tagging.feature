@FunctionalTest
Feature: Free CRM Login Feature

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Title of the Login Page
Given Titles of the Login Page is Cogmento CRM

@SmokeTest @RegressionTest
Scenario: User is able to login button or not
Given User Clicks on Logins Button
When User is on Homes Page
