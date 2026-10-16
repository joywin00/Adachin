Feature: user have to validate login details for hotel
Scenario Outline:
user have to validate the login functionality with different credentials
Given User have to launch the adactin site through chrome
When user have to pass the "<username>" and "<password>" and to click the login button
And user have to validate the dashboard
Then user have to close the browser

Examples:
|username | password|
|joy | win|
|win | joy|
|diesel123 | 2HY9CY|