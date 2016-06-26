Feature: Calc

Scenario: Addition
Given user enter 5 and 10
And select "Mul"
When click on Calculate
Then result should be 50