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

  Scenario: scenario 2-failed
    When I do "POST" request
    Then I receive fail response