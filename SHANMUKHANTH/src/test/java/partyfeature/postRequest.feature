
Feature: post request
Scenario: user want to create party hall
Given User Want to Create data in the data base 
When User able to Pass the data by using URI  "http://localhost:8080/venues/partyhalls" 
Then  uSer Want to Verify StatusLine "HTTP/1.1 201 "
And UsER Want to VerFY StatuscOde 201