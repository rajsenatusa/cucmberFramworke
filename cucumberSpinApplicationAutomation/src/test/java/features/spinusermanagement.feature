Feature: Spin Application User Management Feature

  @ResetUserPassword
  Scenario Outline: As a SPIN adminuser, I should be able to reset password for users
    Given Launch the spin Application
    When User Login with <username> and <password>
    Then Verify that user <username> logged in to the application successfully
    And navigate to admin > user management screen
    And Search the user <searchuser>
    And Navigate to reset password Screen
    And Enter <newpassword> and click on change password
    Then Verify password Changed Successfully

    Examples: 
      | username    | password     | searchuser   | newpassword  |
      | gallopadmin | Winter@2022! | srajendran   | Winter@2023! |
      | gallopadmin | Winter@2022! | Adjuster1    | Winter@2023! |
      | gallopadmin | Winter@2022! | Adjuster2    | Winter@2023! |
      | gallopadmin | Winter@2022! | Adjuster3    | Winter@2023! |
      | gallopadmin | Winter@2022! | Billing1     | Winter@2023! |
      | gallopadmin | Winter@2022! | BillingMgr   | Winter@2023! |
      | gallopadmin | Winter@2022! | Accounting   | Winter@2023! |
      | gallopadmin | Winter@2022! | Underwriter1 | Winter@2023! |
      | gallopadmin | Winter@2022! | uwmanager1   | Winter@2023! |
      | gallopadmin | Winter@2022! | csruw1       | Winter@2023! |
      | gallopadmin | Winter@2022! | csruwmgr1    | Winter@2023! |
      | gallopadmin | Winter@2022! | VillageAgent | Winter@2023! |
      | gallopadmin | Winter@2022! | Jlockwood    | Winter@2023! |
      | gallopadmin | Winter@2022! | MLAING       | Winter@2023! |

  @AddUser
  Scenario Outline: As a SPIN adminuser, I should be able to add new users in to the system
    Given Launch the spin Application
    When User Login with <username> and <password>
    Then Verify that user <username> logged in to the application successfully
    And navigate to admin > user management screen
    And Go to add user screen
    And Enter User Code <UserCode>
    And Select User Type <UserType>
    And Enter ConcurrentSessions <ConcurrentSessions>
    And Select Status <Status>
    And Select Language <Language>
    And Enter First Name <FirstName>
    And Enter Last Name <LastName>
    And Enter Address of the User <Address>
    And Enter City of the the User <City>
    And Select the State of the User <State>
    And Enter the Zip Code of the User <Zip>
    And Select the Country <Country>
    And Click Verify Address Link
    And Select Type of the Primary Phone <TypeOfPrimaryPhone>
    And Enter the Primary Phone Number <PrimaryPhoneNumber>
    And Enter the Email Address <EmailAddress>
    And Select Department <Department>
    And Enter Supervisor Code <SupervisorCode>
    And Select Toolbar Search Mode <ToolbarSearchMode>
    And Enter Password for the User <Password>
    And Enter Confirm Password for the user <ConfirmPassword>
    And Select User Must Change Password On Next Login
    And Select Password Policy <PasswordPolicy>
    And Select Branch Code <BranchCode>
    And Click On Save
    Then Verify User Successfully Created
    Then Add User Role as <UserRole>


    Examples: 
      | username    | password     | SearchUser | UserCode  | UserType | ConcurrentSessions | Status | Language | FirstName      | LastName   | Address                    | City  | State | Zip        | Country       | TypeOfPrimaryPhone | PrimaryPhoneNumber | EmailAddress 						|Department | SupervisorCode | ToolbarSearchMode | Password    | ConfirmPassword | PasswordPolicy | BranchCode  | UserRole 		|																
      | gallopadmin | Winter@2022! | srajendran | TestUsr06 | Company  |                 99 | Active | en_US    | TestUser06		 | TestUser06 | 5426 Bay Center Dr STE 600 | Tampa | FL    | 33609-3440 | United States | Business           | (813) 880-7000     | aiicmodel@aiiflorida.com	|IT         | Dochoa         | None              | Winter@2023 | Winter@2023		 | StandardUser   | Home Office | Everything	|

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      