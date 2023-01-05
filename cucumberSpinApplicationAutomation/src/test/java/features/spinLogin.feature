Feature: Spin Application Login Feature

  @Login
  Scenario Outline: As Spin Registered User I should be able to login to the application.
    Given Launch the spin Application
    When User Login with <username> and <password>
    Then Verify that user <username> logged in to the application successfully
    And Verify spin application home page is displayed

    Examples: 
      | username   | password    |
      | srajendran | Winter@2023 |
      | ag1730     | Winter@2022 |
      | ag8134     | Winter@2022 |
      | jlowe      | Winter@2022 |
