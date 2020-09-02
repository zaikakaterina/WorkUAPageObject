Feature: Apply for a job

  Scenario: I as a job seeker WTBAT send my resume and apply for job
    Given I navigate to "https://www.work.ua/ru/"
    When I fill in search fields
    And I click on "Найти вакансии" button
    Then I scroll down to the vacancy of choice
    And I click on a vacancy in the list
    Then Page with the vacancy description is opened
    And I click on apply button
    And I fill in required data
    And I browse a resume file
    When I add a letter
    Then I click on submit button
