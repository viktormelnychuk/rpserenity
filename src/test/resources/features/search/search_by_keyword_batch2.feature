Feature: test feature batch 2

  Scenario Outline: scenario 2
    When I do "<method>" request
    Then I receive success response
    Examples:
      | method |
      | POST   |
      | GET    |
      | PUT    |
      | DELETE |
