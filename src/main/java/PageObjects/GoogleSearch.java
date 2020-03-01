package PageObjects;

import Core.DriverManager;
import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleSearch extends BasePage {

    WebElement searchBar;

    String SEARCHFIELD_PATH = ".//input[contains(@role,'combobox')]";

    By searchField = By.xpath(SEARCHFIELD_PATH);

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
