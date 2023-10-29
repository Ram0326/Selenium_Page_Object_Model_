Feature: Leaftaps login functionality

Scenario Outline: TC001_Positive flow

Given Enter the username as <username>
And Enter the Password as <password>
When Click on the Login
Then Demo should be displayed in HomePage

Examples:
|username|password|
|Demosalesmanager|crmsfa|
|DemoCSR|crmsfa|