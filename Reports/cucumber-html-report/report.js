$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/GoogleSearch.feature");
formatter.feature({
  "name": "Google Search KeyWord",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify title of the first link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u0027\u003cBrowser\u003e\u0027 browser was opened with \u0027\u003cUrl\u003e\u0027 url",
  "keyword": "Given "
});
formatter.step({
  "name": "\u0027\u003cKeyWord\u003e\u0027 keyword was typed in google search field on \u0027Google Search\u0027 page",
  "keyword": "When "
});
formatter.step({
  "name": "\u0027Search Results\u0027 page is shown",
  "keyword": "And "
});
formatter.step({
  "name": "First link with a \u0027\u003cKeyWord\u003e\u0027 keyword is opened",
  "keyword": "Then "
});
formatter.step({
  "name": "It contains a \u0027\u003cKeyWord\u003e\u0027 keyword in its title",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "Url",
        "KeyWord"
      ]
    },
    {
      "cells": [
        "Chrome",
        "https://www.google.com",
        "automation"
      ]
    },
    {
      "cells": [
        "FireFox",
        "https://www.google.com",
        "automation"
      ]
    },
    {
      "cells": [
        "Opera",
        "https://www.google.com",
        "automation"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify title of the first link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u0027Chrome\u0027 browser was opened with \u0027https://www.google.com\u0027 url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.browser_was_opened_with_url(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027automation\u0027 keyword was typed in google search field on \u0027Google Search\u0027 page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.keyword_was_typed_in_google_search_field_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Search Results\u0027 page is shown",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.page_is_shown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "First link with a \u0027automation\u0027 keyword is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.first_link_with_a_keyword_is_opened(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It contains a \u0027automation\u0027 keyword in its title",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.it_contains_a_keyword_in_its_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify title of the first link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u0027FireFox\u0027 browser was opened with \u0027https://www.google.com\u0027 url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.browser_was_opened_with_url(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027automation\u0027 keyword was typed in google search field on \u0027Google Search\u0027 page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.keyword_was_typed_in_google_search_field_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Search Results\u0027 page is shown",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.page_is_shown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "First link with a \u0027automation\u0027 keyword is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.first_link_with_a_keyword_is_opened(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It contains a \u0027automation\u0027 keyword in its title",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.it_contains_a_keyword_in_its_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify title of the first link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u0027Opera\u0027 browser was opened with \u0027https://www.google.com\u0027 url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.browser_was_opened_with_url(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027automation\u0027 keyword was typed in google search field on \u0027Google Search\u0027 page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.keyword_was_typed_in_google_search_field_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Search Results\u0027 page is shown",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.page_is_shown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "First link with a \u0027automation\u0027 keyword is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.first_link_with_a_keyword_is_opened(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It contains a \u0027automation\u0027 keyword in its title",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.it_contains_a_keyword_in_its_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify expected domain on search result pages",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u0027\u003cBrowser\u003e\u0027 browser was opened with \u0027\u003cUrl\u003e\u0027 url",
  "keyword": "Given "
});
formatter.step({
  "name": "\u0027\u003cKeyWord\u003e\u0027 keyword was typed in google search field on \u0027Google Search\u0027 page",
  "keyword": "When "
});
formatter.step({
  "name": "\u0027Search Results\u0027 page is shown",
  "keyword": "And "
});
formatter.step({
  "name": "Verify that \u0027\u003cDomain\u003e\u0027 domain is present on one of the \u003cPages\u003e pages",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "Url",
        "KeyWord",
        "Domain",
        "Pages"
      ]
    },
    {
      "cells": [
        "Chrome",
        "https://www.google.com",
        "automation",
        "www.br-automation.com",
        "4"
      ]
    },
    {
      "cells": [
        "FireFox",
        "https://www.google.com",
        "automation",
        "zapier.com",
        "4"
      ]
    },
    {
      "cells": [
        "Opera",
        "https://www.google.com",
        "automation",
        "testautomationday.com",
        "4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify expected domain on search result pages",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u0027Chrome\u0027 browser was opened with \u0027https://www.google.com\u0027 url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.browser_was_opened_with_url(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027automation\u0027 keyword was typed in google search field on \u0027Google Search\u0027 page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.keyword_was_typed_in_google_search_field_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Search Results\u0027 page is shown",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.page_is_shown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \u0027www.br-automation.com\u0027 domain is present on one of the 4 pages",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.verify_that_domain_is_present_on_one_of_the_pages(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify expected domain on search result pages",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u0027FireFox\u0027 browser was opened with \u0027https://www.google.com\u0027 url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.browser_was_opened_with_url(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027automation\u0027 keyword was typed in google search field on \u0027Google Search\u0027 page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.keyword_was_typed_in_google_search_field_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Search Results\u0027 page is shown",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.page_is_shown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \u0027zapier.com\u0027 domain is present on one of the 4 pages",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.verify_that_domain_is_present_on_one_of_the_pages(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify expected domain on search result pages",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\u0027Opera\u0027 browser was opened with \u0027https://www.google.com\u0027 url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.browser_was_opened_with_url(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027automation\u0027 keyword was typed in google search field on \u0027Google Search\u0027 page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.keyword_was_typed_in_google_search_field_on_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\u0027Search Results\u0027 page is shown",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.page_is_shown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \u0027testautomationday.com\u0027 domain is present on one of the 4 pages",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.GoogleSearchSteps.verify_that_domain_is_present_on_one_of_the_pages(java.lang.String,int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: testautomationday.com domain is not present within 4 pages\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat Steps.GoogleSearchSteps.verify_that_domain_is_present_on_one_of_the_pages(GoogleSearchSteps.java:53)\r\n\tat ✽.Verify that \u0027testautomationday.com\u0027 domain is present on one of the 4 pages(file:///E:/IntelliJ2020/TestProject2020/src/test/java/Features/GoogleSearch.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});