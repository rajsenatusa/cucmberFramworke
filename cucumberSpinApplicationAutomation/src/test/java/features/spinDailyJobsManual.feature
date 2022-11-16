Feature: Spin Application Daily Jobs

  @TriggerDailyManual
  Scenario: As spin iscsops operator, I should be able to run daily manual job for release activities
    Given Launch the spin Application
    When login with credentials "iscsops" and "password"
    And Navigate to the  daily manual jobs screen
    And Start the job
    Then Verify that job successfully running
