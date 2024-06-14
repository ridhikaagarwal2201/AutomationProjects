Feature : Test Login functionality

Scenario: Login test scenario

Given the user is on login page for amazon website
When the user enters "ridhika" and "test123"
Then the user clicks on Login button

//using examples keyword and scenario outline

Feature: login test

Scenario Outline:
Given the user is on login page for amazon website
When the user enters "<username>" and "<username>"
Then the user clicks on Login button

Examples:
|username|pwd|
|ridhika|test123|
|sidhika|test1234|


// Using DataTable object

Given the user is on login page for amazon website
When the user enters username and username
|ridhika|test123|
Then the user clicks on Login button
