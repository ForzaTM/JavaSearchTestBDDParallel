package Core;

import PageObjects.GoogleSearch;
import PageObjects.SearchResults;
import Utilities.Log;
import org.openqa.selenium.WebElement;

public class CommonActions {
    private DriverManager manager;

    public GoogleSearch googleSearchPage;
    public SearchResults searchResultsPage;

    public CommonActions(DriverManager manager) {
        this.manager = manager;
    }

    public void OpenUrlWithBrowser(String browser, String url) throws Exception {
        Log.startLog("Starting " + browser + " browser with " + url + " url");
        try {
            manager.getDriver(browser);
            manager.driver.get(url);
        } catch (Exception ex) {
            Log.error("Something went wrong during Driver method execution: " + ex);
            throw new Exception("Something went wrong during Driver method execution: " + ex);
        }
    }

    public void click(WebElement element) throws Exception {
        try {
            element.click();
        } catch (Exception ex) {
            Log.error("Click on element failed: Exception: " + ex);
            throw new Exception("Click on element failed with exception: " + ex);
        }
        Log.info("Successful Click on element");
    }

    public String getTitleOfTheCurrentBrowserPage() throws Exception {
        try {
            return manager.driver.getTitle();
        } catch (Exception ex) {
            Log.error("Exceptions in GetTitleOfTheCurrentBrowserPage method: " + ex);
            throw new Exception("Exceptions in GetTitleOfTheCurrentBrowserPage method: " + ex);
        }
    }

    public void PageToBeCreated(String page) throws Exception {
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
