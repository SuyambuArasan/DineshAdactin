Feature: Validating a Hotel Booking Application
Background:
Given  user Launch The Adactin Url
 @suyambuarasan
Scenario Outline:: Login page


When  user enter the "<username>" in username field
And   user enter the "<password>" in password field
And  user click the login Button  and it navigates to search hotel page  
Then user select the desired inputs


Examples:
|username|password|
|Dineshkasiraman34215|QD4INB|
