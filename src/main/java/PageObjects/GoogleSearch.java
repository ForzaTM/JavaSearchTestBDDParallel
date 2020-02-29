package PageObjects;

import Core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch extends BasePage {

    WebElement searchBar;

    String SEARCHFIELD_PATH = ".//input[contains(@role,'combobox')]";

    By searchField = By.xpath(SEARCHFIELD_PATH);

    public GoogleSearch(DriverManager manager) {
        super(manager);
        searchBar = FindElementWithDelay(searchField, true);
    }

    public void EnterText(String text)
    {
        searchBar.sendKeys(text);
        searchBar.sendKeys(Keys.ENTER);
        //log.info("Text: " + text + " successfully entered");
    }
}
