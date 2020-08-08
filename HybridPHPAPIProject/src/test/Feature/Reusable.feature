Feature: Verifying the Change2TestAutomation API Reusable Method concept
Scenario: Validating reusable method concept
Given The User has API method details
When The User use "postapi" and "PostPayload" method
Then The "message" in the response body is "Data Inserted Successfully"