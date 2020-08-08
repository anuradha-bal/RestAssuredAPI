Feature: To Verify Change2Test Automation API
Scenario: To Validate Post Method
Given User has Post Method Details
When User calls Post API with Post HTTP method
Then User receive Post Status code success

Scenario: Validating Put Method
Given The user has Put method details
When the user call Put API with put HTTP method
Then the user receive message successfully updated

Scenario: Validating Delete Method
Given The user has Delete method details
When the user call Delete API with delete HTTP method
Then the user receive message successfully deleted

Scenario: Validating Get Method
Given The user has Get method details
When the user call Get API with Get HTTP method
Then the user received the details

