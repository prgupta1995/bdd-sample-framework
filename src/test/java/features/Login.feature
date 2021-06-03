Feature: Application login


Scenario: Home page default login
Given User is on net banking landing page
When User is log into the application using "Jim" and "12345"
Then User redirects to the home page
And Cards displayed "true"

Scenario: Home page default login
Given User is on net banking landing page
When User is log into the application using "John" and "1234"
Then User redirects to the home page
And Cards displayed "false"


