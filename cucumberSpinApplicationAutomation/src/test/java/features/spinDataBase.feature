Feature: Spin Application Claim Maintenance Feature

  @CATFileGeneration
  Scenario: As a CAT user, I should be able to run query for ER Request and generate results in excel file.
    Given Connect the Model Data Base
    When Run the ER request SQL Query
    Then Write the results in to the excel file
    Then place the file in a desired location
