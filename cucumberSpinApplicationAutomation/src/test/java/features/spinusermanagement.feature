Feature: Spin Application User Management Feature

  @AddUserCompanyClaims
  Scenario Outline: As a SPIN adminuser, I should be able to add new company claims users in to the spin system
    Given Launch the spin Application
    When User Login with <username> and <password>
    Then Verify that user <username> logged in to the application successfully
    And navigate to admin > user management screen
    And Go to add user screen
    And Enter User Code : <UserCode>
    And Select User Type : <UserType>
    And Enter ConcurrentSessions : <ConcurrentSessions>
    And Select Status : <Status>
    And Select Language : <Language>
    And Enter First Name : <FirstName>
    And Enter Last Name : <LastName>
    And Enter Address of the User : <Address>
    And Enter City of the the User : <City>
    And Select the State of the User : <State>
    And Enter the Zip Code of the User : <Zip>
    And Select the Country : <Country>
    And Click Verify Address Link
    And Select Type of the Primary Phone : <TypeOfPrimaryPhone>
    And Enter the Primary Phone Number : <PrimaryPhoneNumber>
    And Enter the Email Address : <EmailAddress>
    And Select Department : <Department>
    And Enter Supervisor Code : <SupervisorCode>
    And Select Toolbar Search Mode : <ToolbarSearchMode>
    And Enter Password for the User : <Password>
    And Enter Confirm Password for the user : <ConfirmPassword>
    And Select User Must Change Password On Next Login
    And Select Password Policy : <PasswordPolicy>
    And Add Provider Code : <ProviderCode>
    And Select Branch Code : <BranchCode>
    And Click On Save at UserMaintenance Screen
    Then Verify User Successfully Created
    Then Add User Role as : <UserRole>

    Examples: 
      | username    | password     | UserCode  		 | UserType       | ConcurrentSessions | Status | Language | FirstName | LastName  | Address                    | City  | State | Zip        | Country       | TypeOfPrimaryPhone | PrimaryPhoneNumber | EmailAddress      			  | Department | SupervisorCode | ToolbarSearchMode | Password    | ConfirmPassword | PasswordPolicy | ProviderCode | BranchCode  | UserRole     |
      | gallopadmin | Winter@2022! | BVazquez			 | Company Claims |                 20 | Active | en_US    | Trevor		 | McDonald	 | 5426 Bay Center Dr STE 600 | Tampa | FL    | 33609-3440 | United States | Business           | (813) 880-7000     | TMcDonald@aiiflorida.com | Claims     | JRitchie			  | None         		  | Winter@2023 | Winter@2023     | StandardUser   | CA0CV        | Home Office | VP of Claims |


	@AddUserCompany
  Scenario Outline: As a SPIN adminuser, I should be able to add new company users in to the spin system
    Given Launch the spin Application
    When User Login with <username> and <password>
    Then Verify that user <username> logged in to the application successfully
    And navigate to admin > user management screen
    And Go to add user screen
    And Enter User Code : <UserCode>
    And Select User Type : <UserType>
    And Enter ConcurrentSessions : <ConcurrentSessions>
    And Select Status : <Status>
    And Select Language : <Language>
    And Enter First Name : <FirstName>
    And Enter Last Name : <LastName>
    And Enter Address of the User : <Address>
    And Enter City of the the User : <City>
    And Select the State of the User : <State>
    And Enter the Zip Code of the User : <Zip>
    And Select the Country : <Country>
    And Click Verify Address Link
    And Select Type of the Primary Phone : <TypeOfPrimaryPhone>
    And Enter the Primary Phone Number : <PrimaryPhoneNumber>
    And Enter the Email Address : <EmailAddress>
    And Select Department : <Department>
    And Enter Supervisor Code : <SupervisorCode>
    And Select Toolbar Search Mode : <ToolbarSearchMode>
    And Enter Password for the User : <Password>
    And Enter Confirm Password for the user : <ConfirmPassword>
    And Select User Must Change Password On Next Login
    And Select Password Policy : <PasswordPolicy>
    And Select Branch Code : <BranchCode>
    And Click On Save at UserMaintenance Screen
    Then Verify User Successfully Created
    Then Add User Role as : <UserRole>

    Examples: 
      | username    | password     | UserCode  		 | UserType       | ConcurrentSessions | Status | Language | FirstName | LastName  | Address                    | City  | State | Zip        | Country       | TypeOfPrimaryPhone | PrimaryPhoneNumber | EmailAddress      			  | Department | SupervisorCode | ToolbarSearchMode | Password    | ConfirmPassword | PasswordPolicy |  BranchCode  | UserRole     |
      | gallopadmin | Winter@2022! | TMcDonald		 | Company 			  |                 1	 | Active | en_US    | Trevor		 | McDonald	 | 5426 Bay Center Dr STE 600 | Tampa | FL    | 33609-3440 | United States | Business           | (813) 880-7000     | TMcDonald@aiiflorida.com | Claims     | JRitchie			  | None         		  | Winter@2023 | Winter@2023     | StandardUser   |  Home Office | VP of Claims |



  @CopyUsersMirrorAccess
  Scenario Outline: As a SPIN adminuser, I should be able to copy existing user profile and mirror the access level to the new users
    Given Launch the spin Application
    When User Login with <username> and <password>
    Then Verify that user <username> logged in to the application successfully
    And navigate to admin > user management screen
    And Search User Existing User Code: <SearchExistingUser>
    And Click Copy to add Profile
    And Enter User Code : <UserCode>
    And Enter First Name : <FirstName>
    And Enter Last Name : <LastName>
    And Click Verify Address Link
    And Enter the Primary Phone Number : <PrimaryPhoneNumber>
    And Enter the Email Address : <EmailAddress>
    And Enter Password for the User : <Password>
    And Enter Confirm Password for the user : <ConfirmPassword>
    And Select User Must Change Password On Next Login
    And Click On Save at UserMaintenance Screen
    Then Verify User Successfully Created

    Examples: 
      | username    | password     | SearchExistingUser | UserCode   | FirstName | LastName  | TypeOfPrimaryPhone | PrimaryPhoneNumber | EmailAddress             | Password    | ConfirmPassword |
      | gallopadmin | Winter@2022! | PKnowles           | rlayne     | Ryan      | Layne     | Business           | (662) 397-2301     | rlayne@vcsclaims.com     | Winter@2023 | Winter@2023     |
      | gallopadmin | Winter@2022! | PKnowles           | Mmattammal | Mike      | Mattammal | Business           | (737) 443-0821     | Mmattammal@vcsclaims.com | Winter@2023 | Winter@2023     |
      | gallopadmin | Winter@2022! | PKnowles           | Jim        | Jim       | Townsend  | Business           | (512) 964-1751     | jim@vcsclaims.com        | Winter@2023 | Winter@2023     |
      | gallopadmin | Winter@2022! | PKnowles           | Dgackle    | David     | Gackle    | Business           | (970) 219-9815     | Dgackle@vcsclaims.com    | Winter@2023 | Winter@2023     |
      
      
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
      | username    | password     | searchuser   | newpassword |
      | gallopadmin | Winter@2022! | ccowell      | Winter@2023 |
      | gallopadmin | Winter@2022! | bedwards     | Winter@2023 |
      | gallopadmin | Winter@2022! | cbankes      | Winter@2023 |
      | gallopadmin | Winter@2022! | jbenoit      | Winter@2023 |
      | gallopadmin | Winter@2022! | jvanderbilt  | Winter@2023 |
      | gallopadmin | Winter@2022! | ggahrman     | Winter@2023 |
      | gallopadmin | Winter@2022! | mcollins     | Winter@2023 |
      | gallopadmin | Winter@2022! | nbell        | Winter@2023 |
      | gallopadmin | Winter@2022! | mturnipseed  | Winter@2023 |
      | gallopadmin | Winter@2022! | qdavison     | Winter@2023 |
      | gallopadmin | Winter@2022! | rvanhorn     | Winter@2023 |
      | gallopadmin | Winter@2022! | sgilpin      | Winter@2023 |
      | gallopadmin | Winter@2022! | striplett    | Winter@2023 |
      | gallopadmin | Winter@2022! | dbrembs      | Winter@2023 |
      | gallopadmin | Winter@2022! | jarnett      | Winter@2023 |
      | gallopadmin | Winter@2022! | tjames       | Winter@2023 |
      | gallopadmin | Winter@2022! | jdevivo      | Winter@2023 |
      | gallopadmin | Winter@2022! | rdefosses    | Winter@2023 |
      | gallopadmin | Winter@2022! | bdaley       | Winter@2023 |
      | gallopadmin | Winter@2022! | jgrabowski   | Winter@2023 |
      | gallopadmin | Winter@2022! | jgulledge    | Winter@2023 |
      | gallopadmin | Winter@2022! | rsanchez     | Winter@2023 |
      | gallopadmin | Winter@2022! | swoodard     | Winter@2023 |
      | gallopadmin | Winter@2022! | emangon      | Winter@2023 |
      | gallopadmin | Winter@2022! | lrambach     | Winter@2023 |
      | gallopadmin | Winter@2022! | lthomas      | Winter@2023 |
      | gallopadmin | Winter@2022! | wdennis      | Winter@2023 |
      | gallopadmin | Winter@2022! | bfulmer      | Winter@2023 |
      | gallopadmin | Winter@2022! | dbeattie     | Winter@2023 |
      | gallopadmin | Winter@2022! | dhennessee   | Winter@2023 |
      | gallopadmin | Winter@2022! | jhardin      | Winter@2023 |
      | gallopadmin | Winter@2022! | mewers       | Winter@2023 |
      | gallopadmin | Winter@2022! | cmaggio      | Winter@2023 |
      | gallopadmin | Winter@2022! | thunter      | Winter@2023 |
      | gallopadmin | Winter@2022! | cdegourville | Winter@2023 |
      | gallopadmin | Winter@2022! | aslater      | Winter@2023 |
      | gallopadmin | Winter@2022! | aallen       | Winter@2023 |
      | gallopadmin | Winter@2022! | pwarren      | Winter@2023 |
      | gallopadmin | Winter@2022! | blynch       | Winter@2023 |
      | gallopadmin | Winter@2022! | gjackson     | Winter@2023 |
