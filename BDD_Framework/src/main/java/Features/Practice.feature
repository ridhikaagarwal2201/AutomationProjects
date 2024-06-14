Feature: Application login test

@First @RegressionTest
Scenario : Enter Login credentials
Given that the user is on login page
When enters "ridhika" and "test123"
Then clicks on login button

@First @Smoke test
Scenario Outline: give multiple data and check
Given user is on login page1
When enters "<username>" and "<password>"
Then clicks on logon button

Examples:
|username|password|
|ridhka|test123|
|sidhika|test234|


@Second
Scenario:Check login using Data Tables
Given user is on login page
When user2 enters username and password
|ridhika|test123|
Then clicks on login button


