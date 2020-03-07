package PageObjects;

import Core.DriverManager;
import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch extends BasePage {

    private WebElement searchBar;

    By searchField = By.xpath(".//input[contains(@role,'combobox')]");

    public GoogleSearch(DriverManager manager) {
        super(manager);
        searchBar = FindElementWithDelay(searchField, true);
    }

    public void EnterText(String text) throws Exception {
        try {
            searchBar.sendKeys(text);
            searchBar.sendKeys(Keys.ENTER);
            Log.info("Text: " + text + " successfully entered");
        }
        catch(Exception ex)
        {
            Log.error("Failed to enter text: " + text + ". Exception: " + ex);
            throw new Exception("Failed to enter text: " + text + ". Exception: " + ex);
        }
    }
}
