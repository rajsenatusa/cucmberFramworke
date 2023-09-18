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
      | username    | password     | SearchExistingUser | UserCode 	   		| FirstName   	 | LastName 	   | TypeOfPrimaryPhone | PrimaryPhoneNumber | EmailAddress             			| PasswordPolicy  | Password     | ConfirmPassword  |
      | gallopadmin | AiiG@2070	 | DBEATTIE           	| Adjuster1	    	| Adjuster1   	 | Adjuster1 		 | Business           | (813) 512-6664     | model@aiiflorida.com 				  | StandardUser		|	Sep@2023!    | Sep@2023!    	  |
      | gallopadmin | AiiG@2070	 | JFOSTER            	| Adjuster2				| Adjuster2   	 | Adjuster2 		 | Business           | (737) 443-0821     | model@aiiflorida.com 					| StandardUser		|	Sep@2023!    | Sep@2023!    	  |
      | gallopadmin | AiiG@2070	 | LZALANSKY          	| Adjuster3	   		| Adjuster3   	 | Adjuster3 		 | Business           | (813) 880-7059     | model@aiiflorida.com 	 				| StandardUser		|	Sep@2023!    | Sep@2023!    	  |
      | gallopadmin | AiiG@2070	 | BSMITS           		| Billing1	   		| Billing1    	 | Billing1  		 | Business           | (970) 219-9815     | model@aiiflorida.com	  				| StandardUser		|	Sep@2023!    | Sep@2023!		   |
      | gallopadmin | AiiG@2070	 | TWATSON           		| BillingMgr			| BillingMgr	 	 | BillingMgr		 | Business           | (970) 219-9815     | model@aiiflorida.com	 					| StandardUser		|	Sep@2023!    | Sep@2023!		   |
      | gallopadmin | AiiG@2070	 | TCRENSHAW        		| Accounting			| Accounting	 	 | Accounting		 | Business           | (970) 219-9815     | model@aiiflorida.com	  				| StandardUser		|	Sep@2023!    | Sep@2023!		   |
      | gallopadmin | AiiG@2070	 | JLowe		       			| Underwriter1 		| Underwriter1	 | Accounting		 | Business           | (970) 219-9815     | model@aiiflorida.com						| StandardUser		|	Sep@2023!		 | Sep@2023!		   |
      | gallopadmin | AiiG@2070	 | MKOZIEL		       		| uwmanager1    	| uwmanager1	 	 | uwmanager1		 | Business           | (970) 219-9815     | model@aiiflorida.com						| StandardUser		|	Sep@2023!    | Sep@2023!		   |
      | gallopadmin | AiiG@2070	 | JFOSTER		       		| csruw1 					| csruw1		 		 | csruw1			 	 | Business           | (970) 219-9815     | model@aiiflorida.com	 					| StandardUser		|	Sep@2023!    | Sep@2023!		   |
      | gallopadmin | AiiG@2070	 | Wdennis		       		| Claimmgr1	 			| Claimmgr1	 	 	 | Claimmgr1 		 | Business           | (970) 219-9815     | model@aiiflorida.com						| StandardUser		|	Sep@2023!    | Sep@2023!	  	 |
	  	| gallopadmin | AiiG@2070	 | srajendran        		| rpasala 	   		| rpasala  	     | rpasala 		 	 | Business           | (813) 512-6664     | rpasala@aiiflorida.com					| StandardUser		| Sep@2023! 	 | Sep@2023!        |
      | gallopadmin | AiiG@2070	 | srajendran        		| HafeezShaik 		| HafeezShaik    | HafeezShaik   | Business           | (813) 512-6664     | HafeezShaik@aiiflorida.com			| StandardUser		| Sep@2023! 	 | Sep@2023!        |
	  	| gallopadmin | AiiG@2070	 | srajendran        		| Vzaveri					| Vzaveri	     	 | Vzaveri	     | Business           | (813) 512-6664     | vzaveri@aiiflorida.com					| StandardUser		| Sep@2023! 	 | Sep@2023!        |
      

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
      | username    | password  	| searchuser 		  | newpassword 	|
      | gallopadmin | July@2023!  | AG5959	   		 	| Sep@2023!     |
      | gallopadmin | July@2023!  | AG0676	   		 	| Sep@2023!     |
      | gallopadmin | July@2023!  | JLOWE		   		 	| Sep@2023!     |
      | gallopadmin | July@2023!  | MKOZIEL	   		 	| Sep@2023!     |
      | gallopadmin | July@2023!  | JFOSTER	   		 	| Sep@2023!     |
      | gallopadmin | July@2023!  | PKNOWLES	   		| Sep@2023!     |
      | gallopadmin | July@2023!  | DBEATTIE	   		| Sep@2023!     |
      | gallopadmin | July@2023!  | TWilliamsD	   	| Sep@2023!     |
      | gallopadmin | July@2023!  | LZALANSKY	   		| Sep@2023!     |
      | gallopadmin | July@2023!  | BSMITS	   		 	| Sep@2023!     |
      | gallopadmin | July@2023!  | TWATSON	   		 	| Sep@2023!     |
      | gallopadmin | July@2023!  | TCRENSHAW	   		| Sep@2023!     |
      | gallopadmin | July@2023!  | pmadigan	   		| Sep@2023!     |
      | gallopadmin | July@2023!  | Wdennis	   		 	| Sep@2023!     |
      	


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
    
      | username    | password     | SearchExistingUser | EmailAddress         | ConcurrentSessions | 
      | gallopadmin | Winter2023!  | OB24USER1  				| aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER2 				  | aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER3  			  | aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER4  				| aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER5  				| aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER6  				| aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER7  				| aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER8  				| aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER9  				| aiops@aiiflorida.com |                 10 | 
      | gallopadmin | Winter2023!  | OB24USER10 				| aiops@aiiflorida.com |                 10 | 
