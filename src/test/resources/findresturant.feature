Feature: Find Resturant

As I foodie 
I want to search Punjabi food
So that I can have dinner with my family


Scenario: Find by location
Given "Naveen" entered location as "Hitech City"
And select food type "Punjabi"
When click on "Find"
Then system display all available resturant serving "Punjabi" food

Scenario: Find by location and rating
Given "Naveen" entered location as "Hitech City"
And select food type "Punjabi"
And select rating more than 4
When click on "Find"
Then system display all available resturant serving "Punjabi" food with riting higher than 4