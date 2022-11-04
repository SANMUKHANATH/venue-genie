
Feature: GetById request
Scenario: fetch the data by the ID
When User want to read the data by using URI " http://localhost:8080/venues/partyhalls/id/35"
Then user want to verify the statusCode 200