Feature: Verify contact module functionality

  Scenario: Verify that user should be able to craete contact
    Given User lounch "chrome" browser
    And User login with validate cretendial
    When user switch to contact module
    And user click on craete button
    And user enter first name as "abcd",last name "xyz" and middle name "pqr"
    And user select status as "On hold" and discription as "Testing desc"
    And user click on save button
    Then contact should be created
