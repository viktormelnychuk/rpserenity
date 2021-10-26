Feature: test feature

  Scenario Outline: scenario 1
    When I do "<method>" request
    Then I receive success response
    Examples:
      | method |
      | POST   |
      | GET    |
      | PUT    |
      | DELETE |
