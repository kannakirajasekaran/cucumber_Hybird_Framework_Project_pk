Feature: Login Action

#datatable without heading
Scenario: Successful Login with Valid Credentials
Given User is on Home Page
When User enters Credentials to LogIn
|Admin|admin123|
And User enter login button
Then verify the Dashboard page

#datatable with heading

Scenario: Successful Login with InValid Credentials
Given User is on Home Page
When User enters InvalidCredentials to LogIn
|username|Admin  	 |
|password|admin1234|
And User enter login button
