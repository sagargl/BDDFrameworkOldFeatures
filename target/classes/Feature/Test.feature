Feature: Login to the Test Application

Scenario: Login to the App
Given user enters to the amazon app
When search the "Applemac" and price 100
Then "Apple" should be displayed
Then user enters "<products>" and "<pricetag>"