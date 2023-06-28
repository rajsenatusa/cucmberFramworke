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
      | gallopadmin | AiiG@2070		 | TWATSON           	| BillingMgr		  | BillingMgr	 	 | BillingMgr	   | Business           | (970) 219-9815     | Billing1@aiiflorida.com  			| StandardUser  | July@2023!   | July@2023!    	  |           
      | gallopadmin | AiiG@2070		 | TCRENSHAW        	| Accounting			| Accounting	 	 | Accounting		 | Business           | (970) 219-9815     | Billing1@aiiflorida.com  			| StandardUser  | July@2023!   | July@2023!    	  |           
      | gallopadmin | AiiG@2070		 | JLowe		       		| Underwriter1 		| Underwriter1	 | Accounting		 | Business           | (970) 219-9815     | Underwriter1@aiiflorida.com  	| StandardUser  | July@2023!   | July@2023!    	  |           
      | gallopadmin | AiiG@2070		 | MKOZIEL		       	| uwmanager1      | uwmanager1	   | uwmanager1		 | Business           | (970) 219-9815     | uwmanager1@aiiflorida.com	  	| StandardUser  | July@2023!   | July@2023!    	  |          
      | gallopadmin | AiiG@2070		 | JFOSTER		       	| csruw1 					| csruw1		     | csruw1				 | Business           | (970) 219-9815     | csruw1@aiiflorida.com	 				| StandardUser  | July@2023!   | July@2023!    	  |           
      | gallopadmin | AiiG@2070		 | Wdennis		       	| Claimmgr1	 			| Claimmgr1	 	   | Claimmgr1 		 | Business           | (970) 219-9815     | Claimmgr1@aiiflorida.com	 			| StandardUser  | July@2023!   | July@2023!    	  |          
      | gallopadmin | AiiG@2070		 | srajendran        	| rpasala 	   		| rpasala  	     | rpasala 		 	 | Business           | (813) 512-6664     | rpasala@aiiflorida.com		 		 	| StandardUser  | July@2023! 	 | July@2023!       |
      | gallopadmin | AiiG@2070		 | srajendran        	| HafeezShaik 		| HafeezShaik    | HafeezShaik   | Business           | (813) 512-6664     | HafeezShaik@aiiflorida.com			| StandardUser  | July@2023! 	 | July@2023!       |
	    | gallopadmin | AiiG@2070		 | srajendran        	| mcemek 					| mcemek	       | mcemek	     	 | Business           | (813) 512-6664     | mcemek@aiiflorida.com				  | StandardUser  | July@2023! 	 | July@2023!       |
	    | gallopadmin | AiiG@2070		 | srajendran        	| Asakamuri				| Asakamuri	     | Asakamuri     | Business           | (813) 512-6664     | asakamuri@aiiflorida.com			  | StandardUser  | July@2023! 	 | July@2023!       |
	    | gallopadmin | AiiG@2070		 | srajendran        	| Vzaveri					| Vzaveri	       | Vzaveri	     | Business           | (813) 512-6664     | vzaveri@aiiflorida.com				  | StandardUser  | July@2023! 	 | July@2023!       |

      

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
      | username    | password    | searchuser 		| newpassword 	|
	  	| gallopadmin | AiiG@2070   | bkudela				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   | kdavis				| July@2023! 	|	
	  	| gallopadmin | AiiG@2070   |	dcohen				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   | mgupta				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	svenigalla		| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	jrogers1			| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	rpasala				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	nzachariah		| July@2023! 	|
	  	| gallopadmin | AiiG@2070   | kshaik				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	pvispute			| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	jscrape				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	aortiz				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	lrallo				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	mkaplan				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	jgriffin			| July@2023! 	|	
	  	| gallopadmin | AiiG@2070   |	cyavas				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	tpeck					| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	ckriss				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	jritchie			| July@2023! 	|	
	  	| gallopadmin | AiiG@2070   |	mharris				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	striplett			| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	jkossmann			| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	mcemek				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	bwhite				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	Wdennis				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	ccowell				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	ggahrman			| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	ldynda				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	jbarnes				| July@2023! 	|	
	  	| gallopadmin | AiiG@2070   |	tbrydon				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	ASakamuri			| July@2023! 	|	
	  	| gallopadmin | AiiG@2070   |	vzaveri				| July@2023! 	|	
	  	| gallopadmin | AiiG@2070   |	jburlett			| July@2023! 	|	
	  	| gallopadmin | AiiG@2070   |	JBrock				| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	jwinslow			| July@2023! 	|	
	  	| gallopadmin | AiiG@2070   |	djenkins			| July@2023! 	|
	  	| gallopadmin | AiiG@2070   |	rfredericks		| July@2023! 	|


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
