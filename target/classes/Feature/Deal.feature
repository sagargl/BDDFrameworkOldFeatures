Feature: Free CRM Deal Daata Creation Feature

Without Examples Keyword

Scenario: Free CRM Create a new Deal Scenario

Given User is already on Login Page
When Title of the Login Page is Cogmento CRM
Then User Enters username and password
| sagar.lankegowda@gmail.com | Eclipse$@123 |

Then User Clicks on Login Button
Then User is on Home Page
Then user moves to new deal page
Then user enters deal details
| test deal | 1000 | 

Then Close the browser