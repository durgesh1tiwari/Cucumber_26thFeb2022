Feature: Search anything from google page



@goolge
Scenario Outline: Search any value from google
Given I am on Google homepage
When i enter "<SearchItems>" on searchbox
Then i should see the results

Examples:
|SearchItems|
|Cucumber|
|Selenium|
|Test Report|
|Run Report|




