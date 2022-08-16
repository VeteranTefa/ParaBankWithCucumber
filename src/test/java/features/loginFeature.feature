Feature: User Login 
@Regression
Scenario: User Login for Website 
Given user should be exist in website or home page 
When user enter a valid "mostafa" and valid "tefa123"
And click on login button
Then login successfuly and enter on overview page

@Regression @Default
Scenario Outline: User Login for Website 
Given user should be exist in website or home page 
When user enter  invalid "<username>" and invalid "<password>"
And click on login button
Then will display show error message 
Examples:
|username                		 |password                 		 |
|ali                         |sasa123                      |

