#Author: Jayapal@your.domain.com

@tag
Feature: Mobile Valdiadtion
  

  @tag1
  Scenario: Mobile Purchase
  
Given user launch the flipkart application

And user handle login

When user search mobile "Redmi"

And user select the mobile and click add to cart

And user doing payment

Then user recive the confirmation message


 @tag1
  Scenario:Mobile purchase by using One DimLisit
  
Given user launch the flipkart application

And user handle login

When user search mobile by using oneD list

|realme|SAMSUNG|

And user select the mobile and click add to cart oneD

And user doing payment oneD

Then user recive the confirmation message oneD

 
      
