Feature: BellyFeature

  Scenario: eaten many cukes and wait 4 and growl
    Given I have eaten 14 cukes
    When I wait 4 hour
    Then my Belly should growl

  Scenario: eaten many cukes and wait 2 and growl
    Given I have eaten 15 cukes
    When I wait 2 hour
    Then my Belly should growl

  Scenario: eaten few cukes and not growl
    Given I have eaten 9 cukes
    When I wait 2 hour
    Then my Belly should not growl

  Scenario: eaten many cukes and not growl
    Given I have eaten 3 cukes
    When I wait 1 hour
    Then my Belly should not growl