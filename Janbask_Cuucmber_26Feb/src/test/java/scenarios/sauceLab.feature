Feature: Verify the sauce lab functionalities

Background:
Given I launch browser with saucelab url
When I enter valid username
Then My user name should be entered in the text box
When I enter the valid password
When I click on login
Then I should be able to login



@RegressionTest
Scenario: Test login functionality with valid user credntials
And I should see Products


@RegressionTest
Scenario: Add Product to the cart
And I should see Products
When I add item into cart


@RegressionTest
Scenario: Sort products
And I should see Products
Then I sort the products
























