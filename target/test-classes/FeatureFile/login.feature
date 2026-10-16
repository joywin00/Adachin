@login
Feature: user have to validate login functionality with username and password
Background:
Given user have to max chrome browser and wait for few sec

@regression
Scenario:
user have to validate login function using valid username and valid password
When user have to pass the valid username and password and need to click login button
    |joy|
    |win|
    |diesel123|
    |2HY9CY|
    |billing|
    |12345a|  
And user have to validate dashboard    
Then user have to close the tab

@smoke
Scenario:
user have to validate login function using invalid username and valid password
When user have to pass the invalid username and valid password and need to click login button
    |username  | win|
    |password  | joy|
And user have to validate dashboard    
Then user have to close the tab

@sanity
Scenario:
user have to validate login function using valid username and invalid password
When user have to pass the valid username and invalid password and need to click login button
      |joy     | win|
    |diesel123 | 2HY9CY|
    |billing   | 12345a|
And user have to validate dashboard    
Then user have to close the tab
  
 @smoke  
Scenario:
user have to validate login function using invalid username and invalid password
When user have to pass the invalid username and invalid password and need to click login button
    |username  | password|
    |win       | joy|
    |diesel23 | 2HY9CY |
    |billing   | 12345a|  
And user have to validate dashboard    
Then user have to close the tab