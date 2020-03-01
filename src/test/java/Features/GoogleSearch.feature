Feature: Google Search KeyWord

  Scenario Outline: Verify title of the first link
    Given '<Browser>' browser was opened with '<Url>' url
    When '<KeyWord>' keyword was typed in google search field on 'Google Search' page
    And 'Search Results' page is shown
    Then First link with a '<KeyWord>' keyword is opened
    And It contains a '<KeyWord>' keyword in its title
    Examples:
    |Browser      |          Url           |   KeyWord    |
    | Chrome      | https://www.google.com |  automation  |
    | FireFox     | https://www.google.com |  automation  |
    | Opera       | https://www.google.com |  automation  |


  Scenario Outline: Verify expected domain on search result pages
    Given '<Browser>' browser was opened with '<Url>' url
    When '<KeyWord>' keyword was typed in google search field on 'Google Search' page
    And 'Search Results' page is shown
    Then Verify that '<Domain>' domain is present on one of the <Pages> pages
    Examples:
      |Browser      |          Url           |   KeyWord    |         Domain               |Pages|
      | Chrome      | https://www.google.com |  automation  |   www.br-automation.com      |  4  |
      | FireFox     | https://www.google.com |  automation  |   zapier.com                 |  4  |
      | Opera       | https://www.google.com |  automation  |   testautomationday.com      |  4  |