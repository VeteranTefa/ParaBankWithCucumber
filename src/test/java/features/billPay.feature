Feature: Bill Pay 
@Default 
Scenario: after login will bill pay 
Given user should be exist in website or home page 
When user enter a valid "mostafa" and valid "tefa123"
And click on login button
And click bill pay button
When enter a valid "<payeename>" and "<address>" and "<city>" "<state>" 
And enter "<zipcode>" and "<phone>" 
And enter "<account>" and "<verifyaccount>" and enter "<amount>"
And enter send payement button 
Then will display Bill Payment Complete

Examples:
|payeename |address|city |state|zipcode|phone      |account|verifyaccount|amount|
|asd22     |Cairo  |Cairo|Cairo|12345  |01013347528|1      |1            |1300  |



