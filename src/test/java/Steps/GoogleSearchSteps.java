package Steps;

import Core.CommonActions;
import Core.DriverManager;
import PageObjects.GoogleSearch;
import PageObjects.SearchResults;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class GoogleSearchSteps {

    private DriverManager manager;

    private GoogleSearch googleSearchPage;
    private SearchResults searchResultsPage;
    private CommonActions actions;

    public GoogleSearchSteps(DriverManager manager) {
        this.manager = manager;
        actions = new CommonActions(manager);
    }

    @Given("{string} browser was opened with {string} url")
    public void browser_was_opened_with_url(String browser, String url) throws Exception {
        actions.OpenUrlWithBrowser(browser, url);
    }

    @When("{string} keyword was typed in google search field on {string} page")
    public void keyword_was_typed_in_google_search_field_on_page(String keyWord, String page) throws Exception {
        PageToBeCreated(page);
        googleSearchPage.EnterText(keyWord);
    }

    @When("{string} page is shown")
    public void page_is_shown(String page) throws Exception {
        PageToBeCreated(page);
    }

    @Then("First link with a {string} keyword is opened")
    public void first_link_with_a_keyword_is_opened(String keyWord) throws Exception {
        searchResultsPage.ClickFirstSearchElementOnPage();
    }

    @Then("It contains a {string} keyword in its title")
    public void it_contains_a_keyword_in_its_title(String keyWord) throws Exception {

        Assert.assertTrue("Title doesnt contain searched word: "
                + keyWord, actions.GetTitleOfTheCurrentBrowserPage().toLowerCase().contains(keyWord.toLowerCase()));
    }

    @Then("Verify that {string} domain is present on one of the {int} pages")
    public void verify_that_domain_is_present_on_one_of_the_pages(String domain, int amountOfPages) {
        Assert.assertTrue(domain + " domain is not present within " + amountOfPages + "pages"
                ,searchResultsPage.FindDomainOnOneOfThePages(domain, amountOfPages));
    }

    private void PageToBeCreated(String page) throws Exception {
        switch (page.toLowerCase()) {
            case ("google search"): {
                googleSearchPage = new GoogleSearch(manager);
                break;
            }
            case ("search results"): {
                searchResultsPage = new SearchResults(manager);
                break;
            }
            default: {
                throw new Exception("Passed page is not in scope of PageToBeCreated method");
            }

        }
    }

}
