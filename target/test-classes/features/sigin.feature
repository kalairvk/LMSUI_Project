Feature: Signin page validation for User

  Scenario: User should be able to sigin using valid credentials
    Given user is on the sigin page on LMS site
  	When user provides valid username as "User" and password as "Password"
  	And user clicks on login button
    Then user should see the message "you are logged in successfully" and land on homepage
    
