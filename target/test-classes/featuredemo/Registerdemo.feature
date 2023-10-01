@all
Feature: User Registeration Functionallity

Background:
Given User navigate to Register page

@register @mandatoryfields @smoke @regression
Scenario: Register with mandatory fields
When User enters the below details
|FirstName      	|kanna|
|LastName       	|raja |
|email          	|kanna.r@gmail.com|
|phone          	|1234567891       |
|password					|12345            |
|confirmpassword	|12345						|
And Select Privacy Policy field
And Click on continue button
Then Account should Register successfully

@register @allfields @regression
Scenario: Register with all fields
When User enters the below details
|FirstName      	|kanna            |
|LastName       	|raja             |
|email          	|kanna.r@gmail.com|
|phone          	|1234567891       |
|password					|12345            |
|confirmpassword	|12345						|
And Select the Yes option in Newsletter
And Select Privacy Policy field
And Click on continue button
Then Account should Register successfully

@register @nofields @regression
Scenario: Register without providing any fields
When User dont enter details into any fields
And Click on continue button
Then User should get warning message

@register @duplicateemail @regression
Scenario: Register with duplicate email address
When User enters the below details
|FirstName      	|kanna            			|
|LastName       	|raja             			|
|email          	|amootoricap9@gmail.com	|
|phone          	|1234567891       			|
|password					|12345            			|
|confirmpassword	|12345									|
And Select the Yes option in Newsletter
And Select Privacy Policy field
And Click on continue button
Then Warning message about duplicate email address is displayed
