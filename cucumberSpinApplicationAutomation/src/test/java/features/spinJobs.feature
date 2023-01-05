Feature: Spin Application Daily Jobs Feature

  @RunDailyJobs
  Scenario Outline: As spin iscsops operator, I should be able to run daily manual job for release activities
    Given Launch the spin Application
    When User Login with <username> and <password>
    And Navigate to the  daily manual jobs screen
    And Start the job if the day is other than Friday or Saturday
    Then Verify that job successfully running

    Examples: 
      | username | password |
      | iscsops  | password |

	@RunDailyJobs
  Scenario Outline: As spin iscsops operator, I should be able to run Special Daily Jobs on weekend and holidays for release activities
    Given Launch the spin Application
    When User Login with <username> and <password>
    And Navigate to the speical daily jobs screen
    And Start the job if today is Friday or Saturday
    Then Verify that job successfully running

    Examples: 
      | username | password |
      | iscsops  | password |
