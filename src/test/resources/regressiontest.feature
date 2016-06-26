Feature: Regression Test

@naveen
Scenario Outline: Testing search as per distance
Given <user> enter radios <kms>
And current <location>
When click on button <button>
Then sytem display <result>
Examples:
|user|kms|location|button|result|
|"Naveen"|5|"Madhapur"|"Submit"|10|
|"Naveen"|2|"Madhapur"|"Submit"|3|
|"Naveen"|5|"Miyapur"|"Submit"|20|