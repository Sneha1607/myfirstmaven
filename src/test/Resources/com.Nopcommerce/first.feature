Feature: User registration

  @Raja1
  Scenario: User should register successfully
    Given User should on homepage
    When User click on register link
    Then User should navigate to registration page

  Scenario: User should login successfully
    Given User should on homepage
    When User click on login link
    Then User should navigate to login page