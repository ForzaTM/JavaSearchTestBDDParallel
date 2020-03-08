Feature: Google Search

  Scenario Outline: Verify title of the first link
    Given '<Browser>' browser was opened with '<Url>' url
    When '<KeyWord>' keyword was typed in google search field on 'Google Search' page
    Then First link is opened on 'Search Results' page
    And It contains a '<KeyWord>' keyword in its title
    Examples:
    |Browser      |          Url           |   KeyWord    |
    | Chrome      | https://www.google.com |  automation  |
    | FireFox     | https://www.google.com |  automation  |
    | Opera       | https://www.google.com |  automation  |


  Scenario Outline: Verify expected domain on search result pages
    Given '<Browser>' browser was opened with '<Url>' url
    When '<KeyWord>' keyword was typed in google search field on 'Google Search' page
    Then Verify that '<Domain>' domain is present on 'Search Results' page within one of the '<Pages>' pages
    Examples:
      |Browser      |          Url           |   KeyWord    |         Domain               |Pages|
      | Chrome      | https://www.google.com |  automation  |   www.automationdirect.com   |  4  |
      | FireFox     | https://www.google.com |  automation  |   zapier.com                 |  4  |
      | Opera       | https://www.google.com |  automation  |   testautomationday.com      |  4  |