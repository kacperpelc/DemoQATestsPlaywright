Feature:
  Scenario Outline:
    Given I open demoqa main page
    And I click on Forms card
    And I click on Practice Form
    When I write "<firstName>" in First Name input
    And I write "<lastName>" in Last Name input
    And I write "<email>" in Email input
    And I write "<number>" in Mobile Number input

    Examples:
    | firstName | lastName  | email               | number      |
    | Kacper    | Pelc      | kacperpelc@mail.com | 0661234642  |
    | Alojzy    | Roszpunka | ex@ample.com        | 0123456789  |