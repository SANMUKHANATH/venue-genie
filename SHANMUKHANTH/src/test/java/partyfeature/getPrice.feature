Feature: GetBy Price Request
Scenario: user want to see the data
When user want to see the data by using uri "http://localhost:8080/venues/partyhalls?high=100&low=40"
Then user want to verify the statusLine "HTTP/1.1 200 "
And user want to verify statusCode 200
