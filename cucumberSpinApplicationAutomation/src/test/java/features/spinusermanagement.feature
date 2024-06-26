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
      | username    | password     | UserCode | UserType       | ConcurrentSessions | Status | Language | FirstName | LastName | Address                    | City  | State | Zip        | Country       | TypeOfPrimaryPhone | PrimaryPhoneNumber | EmailAddress             | Department | SupervisorCode | ToolbarSearchMode | Password    | ConfirmPassword | PasswordPolicy | ProviderCode | BranchCode  | UserRole     |
      | gallopadmin | Winter@2022! | BVazquez | Company Claims |                 20 | Active | en_US    | Trevor    | McDonald | 5426 Bay Center Dr STE 600 | Tampa | FL    | 33609-3440 | United States | Business           | (813) 880-7000     | TMcDonald@aiiflorida.com | Claims     | JRitchie       | None              | Winter@2023 | Winter@2023     | StandardUser   | CA0CV        | Home Office | VP of Claims |

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
      | username    | password     | UserCode  | UserType | ConcurrentSessions | Status | Language | FirstName | LastName | Address                    | City  | State | Zip        | Country       | TypeOfPrimaryPhone | PrimaryPhoneNumber | EmailAddress             | Department | SupervisorCode | ToolbarSearchMode | Password    | ConfirmPassword | PasswordPolicy | BranchCode  | UserRole     |
      | gallopadmin | Winter@2022! | TMcDonald | Company  |                  1 | Active | en_US    | Trevor    | McDonald | 5426 Bay Center Dr STE 600 | Tampa | FL    | 33609-3440 | United States | Business           | (813) 880-7000     | TMcDonald@aiiflorida.com | Claims     | JRitchie       | None              | Winter@2023 | Winter@2023     | StandardUser   | Home Office | VP of Claims |

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
    And Select Password Policy : <PasswordPolicy>
    And Click On Save at UserMaintenance Screen
    Then Verify User Successfully Created

    Examples: 
      | username    | password    | SearchExistingUser | UserCode     | FirstName | LastName    | TypeOfPrimaryPhone | PrimaryPhoneNumber | EmailAddress                | PasswordPolicy | Password    | ConfirmPassword |
      | gallopadmin | April@2024! | srajendran         | ssigilipelli | Srujana   | Sigilipelli | Business           | (813) 880-7065     | ssigilipelli@aiiflorida.com | StandardUser   | April@2024! | April@2024!     |
      | gallopadmin | April@2024! | srajendran         | kbalu        | Kiruthika | Balu        | Business           | (813) 915-5865     | kbalu@aiiflorida.com        | StandardUser   | April@2024! | April@2024!     |

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
      | username    | password    | searchuser   | newpassword |
      | gallopadmin | April@2024! | ggahrman     | April@2024! |
      | gallopadmin | April@2024! | jbarnes      | April@2024! |
      | gallopadmin | April@2024! | BMCclain     | April@2024! |
      | gallopadmin | April@2024! | ASakamuri    | April@2024! |
      | gallopadmin | April@2024! | jburlett     | April@2024! |
      | gallopadmin | April@2024! | JBrock       | April@2024! |
      | gallopadmin | April@2024! | jwinslow     | April@2024! |
      | gallopadmin | April@2024! | djenkins     | April@2024! |
      | gallopadmin | April@2024! | Krajewski    | April@2024! |
      | gallopadmin | April@2024! | supadhyaya   | April@2024! |
      | gallopadmin | April@2024! | ERodriguez1  | April@2024! |
      | gallopadmin | April@2024! | ssoohoo      | April@2024! |
      | gallopadmin | April@2024! | rpasala      | April@2024! |
      | gallopadmin | April@2024! | HafeezShaik  | April@2024! |
      | gallopadmin | April@2024! | Vzaveri      | April@2024! |
      | gallopadmin | April@2024! | CTramontano  | April@2024! |
      | gallopadmin | April@2024! | zgawienczuk  | April@2024! |
      | gallopadmin | April@2024! | mderebecki   | April@2024! |
      | gallopadmin | April@2024! | LGuna        | April@2024! |
      | gallopadmin | April@2024! | mpamu        | April@2024! |
      | gallopadmin | April@2024! | akura        | April@2024! |
      | gallopadmin | April@2024! | vappikonda   | April@2024! |
      | gallopadmin | April@2024! | hchimakurthi | April@2024! |
      | gallopadmin | April@2024! | smunduri     | April@2024! |
      | gallopadmin | April@2024! | pvispute     | April@2024! |
      | gallopadmin | April@2024! | kshaik       | April@2024! |
      | gallopadmin | April@2024! | AG1730       | April@2024! |
      | gallopadmin | April@2024! | AG1171       | April@2024! |
      | gallopadmin | April@2024! | AG1529       | April@2024! |
      | gallopadmin | April@2024! | AG6718       | April@2024! |
      | gallopadmin | April@2024! | AG8134       | April@2024! |
      | gallopadmin | April@2024! | AG8735       | April@2024! |
      | gallopadmin | April@2024! | AG9077       | April@2024! |
      | gallopadmin | April@2024! | AG0005       | April@2024! |
      | gallopadmin | April@2024! | AG5959       | April@2024! |
      | gallopadmin | April@2024! | AG0676       | April@2024! |
      | gallopadmin | April@2024! | JLOWE        | April@2024! |
      | gallopadmin | April@2024! | JFOSTER      | April@2024! |
      | gallopadmin | April@2024! | DBEATTIE     | April@2024! |
      | gallopadmin | April@2024! | LZALANSKY    | April@2024! |
      | gallopadmin | April@2024! | TCRENSHAW    | April@2024! |
      | gallopadmin | April@2024! | pmadigan     | April@2024! |
      | gallopadmin | April@2024! | Wdennis      | April@2024! |
      | gallopadmin | April@2024! | Adjuster1    | April@2024! |
      | gallopadmin | April@2024! | Adjuster2    | April@2024! |
      | gallopadmin | April@2024! | Adjuster3    | April@2024! |
      | gallopadmin | April@2024! | Billing1     | April@2024! |
      | gallopadmin | April@2024! | BillingMgr   | April@2024! |
      | gallopadmin | April@2024! | Accounting   | April@2024! |
      | gallopadmin | April@2024! | Underwriter1 | April@2024! |
      | gallopadmin | April@2024! | uwmanager1   | April@2024! |
      | gallopadmin | April@2024! | csruw1       | April@2024! |
      | gallopadmin | April@2024! | Claimmgr1    | April@2024! |
      | gallopadmin | April@2024! | AGISA002537  | April@2024! |
      | gallopadmin | April@2024! | Zglover      | April@2024! |
      | gallopadmin | April@2024! | Aallen       | April@2024! |

  @UpdateUsers
  Scenario Outline: As a SPIN adminuser, I should to update concurrent session and email address of specific user.
    Given Launch the spin Application
    When User Login with <username> and <password>
    Then Verify that user <username> logged in to the application successfully
    And navigate to admin > user management screen
    And Search User Existing User Code: <SearchExistingUser>
    And Enter ConcurrentSessions : <ConcurrentSessions>
    And Enter the Email Address : <EmailAddress>
    And Click On Save at UserMaintenance Screen

    Examples: 
      | username    | password    | SearchExistingUser | EmailAddress         | ConcurrentSessions |
      | gallopadmin | Winter2023! | OB24USER1          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER2          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER3          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER4          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER5          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER6          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER7          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER8          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER9          | aiops@aiiflorida.com |                 10 |
      | gallopadmin | Winter2023! | OB24USER10         | aiops@aiiflorida.com |                 10 |
