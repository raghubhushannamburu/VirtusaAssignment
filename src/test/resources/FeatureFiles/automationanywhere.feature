Feature:  mouse hover on automationanywhere


Scenario: Request Demo on automationanywhere
Given I navigate and login to automationanywhere website
Then I click AcceptAllCookies button
Then I click on RequestDemo button and validated labels

Scenario: Mouse hover on automationanywhere
Given I navigate and login to automationanywhere website
Then I click AcceptAllCookies button
Then I mouse hovered on product
And I asserted text








