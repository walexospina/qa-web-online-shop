@conversion_intent
@add_cart

Feature: add items to the shopping cart
  As a  user
  I want to purchase an item
  So that I can add items to my shopping catr


  @smoke
  @regression
  Scenario: add an item to the shopping cart

    Given I am in amazon web site
    And I am interesting in a "camera"
    Then I search and select my  favorite item to purchase
    When I go to my shopping  cart
    Then I should be ready to  process with the checkout