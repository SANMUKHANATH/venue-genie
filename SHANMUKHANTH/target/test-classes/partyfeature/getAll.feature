
Feature: GetAll Request
Scenario: User want to read the data from data base

When user want to fetch the data by using uri "http://localhost:8080/venues/partyhalls/getall"
Then User want to verify the statusLine "HTTP/1.1 200 "
And user want to verify the statuscode 200
