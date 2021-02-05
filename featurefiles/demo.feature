Feature: Launch the Application

  Scenario: Open Chrome Aplication and Launch Cleartrip
    Given Url for Cleartrip Application
    When Url is validated
    And Select trip as RoundTrip
    And Select Source
    Then select Destination
    Then select Depart Date
    And Select Return date
    And Select Number of Adults
    And Click on Search Flight
    Then Close the Application
