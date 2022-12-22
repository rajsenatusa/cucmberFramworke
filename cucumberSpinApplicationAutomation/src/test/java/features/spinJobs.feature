Feature: Spin Application Daily Jobs

  @RunDailyManual
  Scenario Outline: As spin iscsops operator, I should be able to run daily manual job for release activities
    Given Launch the spin Application
    When User Login with <username> and <password>
    And Navigate to the  daily manual jobs screen
    And Start the job
    Then Verify that job successfully running

    Examples: 
      | username | password |
      | iscsops  | password |

  @RunSpecialJobs
  Scenario Outline: As spin iscsops operator, I should be able to Special Daily Jobs for release activities
    Given Launch the spin Application
    When User Login with <username> and <password>
    And Navigate to the speical daily jobs screen
    And Start the job
    Then Verify that job successfully running

    Examples: 
      | username | password |
      | iscsops  | password |
