@test
Feature: fill and submit
  Background:
    Given user goes to toolsQA website practice form url

  @test01
  Scenario Outline:
    Given User provide valid "<firstname>" and "<lastname>"
    And User provide valid "<email>"
    And User click gender
    And User provide valid mobile number "<mobileNumber>"
    And User provide valid date of birth "<dateOfBirth>"
    And User write "<subjects>"
    And User click valid hobby
    And User sends photo
    And User provide valid address
    And User choose valid state and city
    Then User summit it
    Examples:
      | firstname |lastname |email|mobileNumber|dateOfBirth|subjects|
      |Abdurrahim|Ozturk|abdurrahimozturk.ao@gmail.com|0494981340|22/03/1993|Maths|
