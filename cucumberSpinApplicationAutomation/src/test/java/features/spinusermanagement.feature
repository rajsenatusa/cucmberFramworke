Feature: Spin Application User Management Feature

  @ResetUserPassword
  Scenario Outline: As a SPIN adminuser, I should be able to reset password for users
    Given Launch the spin Application
    When User Login with "gallopadmin" and "Winter@2022!"
    Then Verify that user "gallopadmin" logged in to the application successfully
    And navigate to admin > user management screen
    And Search the user <username>
    And Navigate to reset password Screen
    And Enter <newpassword> and click on change password
    Then Verify password Changed Successfully

    Examples: 
      | username   | newpassword |
      | srajendran | Winter@2023!|

