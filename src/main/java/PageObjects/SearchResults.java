package PageObjects;

import Core.CommonActions;
import Core.DriverManager;
import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchResults extends BasePage {

    private CommonActions actions;

    public WebElement searchBar;
    public WebElement firstOfGoogleSearchResults;
    public WebElement switchPage;
    public WebElement navigationSection;

    String pageNumberLocator = ".//a[contains(@aria-label, 'Page 1')]";

    By searchField = By.xpath(".//input[contains(@role,'combobox')]");
    By googleSearchRes = By.id("search");
    By firstOfGoogleSearchRes = By.xpath(".//a[contains(@href, '')][1]");
    By navigationSect = By.tagName("tbody");
    By linksInSF = By.cssSelector("cite.iUh30.tjvcx");

    public SearchResults(DriverManager manager) {
        super(manager);
        actions = new CommonActions(manager);
        searchBar = FindElementWithDelay(searchField, true);
        firstOfGoogleSearchResults = FindElementInsideElementWithDelay(googleSearchRes, firstOfGoogleSearchRes, true);
        navigationSection = FindElementWithDelay(navigationSect, true);
    }

    public void nextPage(Integer pagenum) throws Exception {
        try {
            switchPage = FindElementInsideElementWithDelay(navigationSect, getPageNumberLocator(pagenum), false);
            switchPage.click();
        }
        catch (Exception ex)
        {
            Log.error("Failed to click nex page with number: " + pagenum + ". Exception: " + ex);
            throw new Exception("Failed to click nex page with number: " + pagenum + ". Exception: " + ex);
        }
    }

    public List<WebElement> linksInSearchList() throws Exception {
        try {
            return FindElementsWithDelay(linksInSF, false);
        }
        catch (Exception ex)
        {
            Log.error("Failed to get links from search results. Exception: " + ex);
            throw new Exception("Failed to get links from search results. Exception: " + ex);
        }
    }

    public void clickFirstSearchElementOnPage() throws Exception {
        try {
            actions.click(firstOfGoogleSearchResults);
        }
        catch(Exception ex)
        {
            Log.error("Failed to click first searched element on search results page. Exception: " + ex);
            throw new Exception("Failed to click first searched element on search results page. Exception: " + ex);
        }
    }

    public Boolean findDomainOnOneOfThePages(String domain, int amountOfPages) throws Exception {
        for (int i = 1; i <= amountOfPages; i++)
        {
           if(linksInSearchList().stream().anyMatch(element -> element.getText().toLowerCase().contains(domain.toLowerCase()))) {
               Log.info("Domain: " + domain + " was found on " + i + " page");
               return true;
           }
           nextPage(i);
        }
        Log.error("Failed to find domain: " + domain + " on " + amountOfPages + " search results pages");
        return false;
    }

    private By getPageNumberLocator(Integer i)
    {
        return By.xpath(pageNumberLocator.replaceAll("[0-9]", String.valueOf(i + 1)));
    }
}
