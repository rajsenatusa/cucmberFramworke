Feature: Spin Application Claim Maintenance Feature

  @ProviderMaintenance
  Scenario Outline: As a SPIN adminuser, I should be able to add providers
    Given Launch the spin Application
    When User Login with <username> and <password>
    Then Verify that user <username> logged in to the application successfully
    And Navigate to Claims > Claims Maintenance Screen > Provider > New Provider
    And Enter Provider Code <ProviderCode>
    And Select Provider Type <ProviderType>
    And Enter Status Date <StatusDate>
    And Select Business Type <BusinessType>
    And Select Allowed Combined Payments <AlloywedComPayments>
    And Enter Business Name <BusinessName>
    And Enter Provider Name <ProviderName>
    And Enter DBA Name <DBAName>
    And Enter Street Address <StreetAddress>
    And Enter City of the the provider <ProviderCity>
    And Select the State of the provider <ProviderState>
    And Enter the Zip Code of the provider <ProviderZip>
    And Select Type of the Provider Primary Phone <TypeOfProviderPrimaryPhone>
    And Enter the Provider Primary Phone Number <ProviderPrimaryPhoneNumber>
    And Enter Email Address of The Provider <ProviderEmailAddress>
    And Select Recieve Xactanalysis Work <RecieveXactAnalaysisWork>
    And Copy Accounting Information
    And Select Required TaxInformation_OneZeroNineNine <RequiredTax>
    And Select Payment Preference <SelectPaymentPreference>
    And Select Severity Assignment Green
    And Select Severity Assignment Yellow
    And Select Severity Assignment Orange
    And Select Severity Assignment Red
    And Save Provider Information
    Then Verify the Provider Successfuly Created

    Examples: 
      | username    | password     | ProviderCode | ProviderType |  StatusDate | BusinessType | AlloywedComPayments | BusinessName   	| ProviderName   	| DBAName        	| StreetAddress                  | ProviderCity  | ProviderState   | ProviderZip   | TypeOfProviderPrimaryPhone | ProviderPrimaryPhoneNumber | ProviderEmailAddress      | RecieveXactAnalaysisWork | 	RequiredTax			 | SelectPaymentPreference |
      | gallopadmin | Winter@2022! | TESTCODE6278  | Adjuster     |  01/01/2022 | Individual   | No                 | BusinessSample1 | BusinessSample1 | BusinessSample1 | 5426 Bay Center Dr., Suite 650 | Tampa 				 | FL							 | 33609 				 | Business           				| (662) 397-2301     			 | sample@sample.com 				| Inactive                 | 	No							 |Check                    |
