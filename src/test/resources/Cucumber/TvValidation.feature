#Author: your.jayapal@your.domain.com


@tag
Feature: TV Valdiadtion
  

  @tag1
  Scenario: TV Purchase
  
Given user launch the flipkart application

And user handle login

When user search Tv "SAMSUNG TV"

And user select the Tv and click add to cart

And user doing payment

Then user recive the confirmation message


  Scenario Outline: TV Validation
    
    Given user launch the flipkart application

    And user handle login

    When user search Tv "<Tv>" 

   And user select the Tv and click add to cart

   And user doing payment

    Then user recive the confirmation message

     Examples:

|Tv|
|SONY TV|
|LG TV|
    
  
