@all
Feature: User Login
Registered User should be able to login to access account details

#below background gherkin keyword is execute before each scenario
Background:
Given User navigates to Login page

@login @validcredentials @smoke @regression
Scenario Outline: Login with valid credentials
When User enters valid email address "<email>"
And Enter valid password "<password>"
And Click on Login button
Then User should login successfully
Examples:
|email								 |password|
|amotooricap3@gmail.com|12345		|
|amotooricap1@gmail.com|12345		|

@login @invalidcredentials @smoke @regression @dev
Scenario: Login with invalid credentials
When User enters invalid email address "amotooricap356678@gmail.com"
And Enter invalid password "123455678"
And Click on Login button
Then User should get a proper warning message

@login @invalidemailaddress @regression @wip
Scenario: Login with invalid email address and valid password
When User enters invalid email address "amotooricap356678@gmail.com"
And Enter valid password "12345"
And Click on Login button
Then User should get a proper warning message

@login @invalidpassword @regression @ignore
Scenario: Login with valid email address and invalid password
When User enters valid email address "amotooricap3@gmail.com"
And Enter invalid password "123455678"
And Click on Login button
Then User should get a proper warning message

@login @nocredentials @regression
Scenario: Login without providing any credentials
When User donot enters credentails
And Click on Login button
Then User should get a proper warning message