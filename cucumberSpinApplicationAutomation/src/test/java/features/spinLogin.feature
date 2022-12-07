Feature: Spin Application Login

@SanityTest
Scenario: As Spin User admin I should be able to login to application.

Given Launch the spin Application
When login with credentials "SRajendran" and "Password@2023!"
Then Verify that user user logged in to the application successfully
And  Verify spin application home page is displayed


@SmokeTest @RegressionTest
Scenario Outline: As Spin Registered User I should be able to login to the application.

Given Launch the spin Application
When User Login with <username> and <password>
Then Verify that user user logged in to the application successfully
And  Verify spin application home page is displayed

Examples:
|username	|password|
|ag1730  	|Password@2023!|
|ag1529  	|Password@2023!|
|ag8134  	|Password@2023!|
|jlowe   	|Password@2023!|




