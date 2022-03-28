Feature: Test login with multiple user

@ExploratoryTest
Scenario Outline: Test the login functionality with multple user

Given I launch browser with saucelab url
When I enter username as "<username>"
When I enter password as "<password>"
When I click on login
Then I should be able to login
And I should see Products


Examples:
|username|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|


