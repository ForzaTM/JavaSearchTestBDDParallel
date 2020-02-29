package PageObjects;

import Core.CommonActions;
import Core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchResults extends BasePage {

    CommonActions actions;

    public WebElement searchBar;
    public WebElement firstOfGoogleSearchResults;
    public WebElement switchPage;
    public WebElement navigationSection;

    String NAVIGATIONSECTIONPATH_PATH = "tbody";
    String SEARCHFIELD_PATH = ".//input[contains(@role,'combobox')]";
    String SEARCHRESULT_PATH = "search";
    String FIRSTOFSEARCHRESULTS_PATH = ".//a[contains(@href, '')][1]";
    String LINKSINSEARCHFIELD_PATH = "cite.iUh30.tjvcx";


    By searchField = By.xpath(SEARCHFIELD_PATH);
    By googleSearchRes = By.id(SEARCHRESULT_PATH);
    By firstOfGoogleSearchRes = By.xpath(FIRSTOFSEARCHRESULTS_PATH);
    By navigationSect = By.tagName(NAVIGATIONSECTIONPATH_PATH);
    By linksInSF = By.cssSelector(LINKSINSEARCHFIELD_PATH);

    public SearchResults(DriverManager manager) {
        super(manager);
        actions = new CommonActions(manager);
        searchBar = FindElementWithDelay(searchField, true);
        firstOfGoogleSearchResults = FindElementInsideElementWithDelay(googleSearchRes, firstOfGoogleSearchRes, true);
        navigationSection = FindElementWithDelay(navigationSect, true);
    }

    public void NextPage(Integer pagenum) {
        switchPage = FindElementInsideElementWithDelay(navigationSect, By.xpath(".//a[contains(@aria-label, 'Page " + pagenum + "')]"), false);
        switchPage.click();
    }

    public List<WebElement> linksInSearchList() {
        return FindElementsWithDelay(linksInSF, false);
    }

    public void ClickFirstSearchElementOnPage() throws Exception {
        actions.Click(firstOfGoogleSearchResults);
    }

    public Boolean FindDomainOnOneOfThePages(String domain, int amountOfPages)
    {
        for (int i = 1; i <= amountOfPages; i++)
        {
            for (WebElement element : linksInSearchList()) {
                if (element.getText().toLowerCase().contains(domain.toLowerCase()))
                    return true;
            }
            NextPage(i + 1);
        }
        return false;
    }
}
