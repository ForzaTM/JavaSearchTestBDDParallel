package Steps;

import Core.CommonActions;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class GoogleSearchSteps {

    private CommonActions actions;

    public GoogleSearchSteps(CommonActions actions) {
        this.actions = actions;
    }

    @Given("{string} browser was opened with {string} url")
    public void browser_was_opened_with_url(String browser, String url) throws Exception {
        actions.OpenUrlWithBrowser(browser, url);
    }

    @When("{string} keyword was typed in google search field on {string} page")
    public void keyword_was_typed_in_google_search_field_on_page(String keyWord, String page) throws Exception {
        actions.PageToBeCreated(page);
        actions.googleSearchPage.EnterText(keyWord);
    }

    @Then("First link is opened on {string} page")
    public void first_link_is_opened_on_page(String page) throws Exception {
        actions.PageToBeCreated(page);
        actions.searchResultsPage.clickFirstSearchElementOnPage();
    }

    @Then("It contains a {string} keyword in its title")
    public void it_contains_a_keyword_in_its_title(String keyWord) throws Exception {
        Assert.assertTrue("Title doesnt contain searched word: "
                + keyWord, actions.getTitleOfTheCurrentBrowserPage().toLowerCase().contains(keyWord.toLowerCase()));
    }

    @Then("Verify that {string} domain is present on {string} page within one of the {string} pages")
    public void verify_that_domain_is_present_on_page_within_one_of_the_pages(String domain, String page, String amountOfPages) throws Exception {
        actions.PageToBeCreated(page);
        Assert.assertTrue(domain + " domain is not present within " + Integer.parseInt(amountOfPages) + " pages"
                ,actions.searchResultsPage.findDomainOnOneOfThePages(domain, Integer.parseInt(amountOfPages)));
    }
}
