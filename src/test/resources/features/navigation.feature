Feature: Navigate from home page

  @JobPage
  Scenario: Navigate to registration page
    Given we want to go to job registration
    When we click on send us your cv
    Then the registration page will be opened

    @NewsPage
  Scenario: Navigate to news page
    Given we want to go to news page
    When we click on news
    Then we navigate to news page
