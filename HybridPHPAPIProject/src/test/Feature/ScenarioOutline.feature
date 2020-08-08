Feature: To verifying change2TestAutomation API using datadriven concept
Scenario Outline: Validating post method with multiple sets of values
Given User has Post Method Details "<Title>" "<body>" "<author>"
When the user send post HTTP request
Then user gets message data inserted succesfully

Examples:
|Title|body|author|
|QA|Hello|Anu|
|Manual|Hello!|AAA|
|Automation|Hello....|A|

Scenario Outline: Validating put method with multiple sets of values
Given User has Put Method Details "<id>" "<author>"
When the user send put HTTP request
Then user gets message data updateded succesfully

Examples:
|id|author|
|60|Anu|
|61|AAA|
|62|A|

Scenario Outline: Validating delete method with multiple sets of values
Given User has delete Method Details "<id>" 
When the user send delete HTTP request
Then user gets message data deleted succesfully

Examples:
|id|
|60|
|61|
|62|