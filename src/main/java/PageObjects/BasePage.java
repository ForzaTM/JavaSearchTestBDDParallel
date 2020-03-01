package PageObjects;

import Core.DriverManager;
import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public DriverManager manager;
    public WebDriver driver;
    private WebDriverWait wait;

    public BasePage(DriverManager manager) {
        this.manager = manager;
        this.wait = manager.wait;
        driver = manager.driver;
    }

    public WebElement FindElementWithDelay(By by, boolean isWait) {
        try {
            if (isWait) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            Log.info("Element searched by: " + by + " present on the page");
            return driver.findElement(by);
        } catch (Exception ex) {
            Log.info("Element searched by: " + by + " not found on the page: " + ex);
            return null;
        }
    }

    public WebElement FindElementInsideElementWithDelay(By by1, By by2, boolean isWait) {
        try {
            if (isWait) wait.until(ExpectedConditions.visibilityOfElementLocated(by1));
            Log.info("Element searched by: " + by2 + " inside element by: " + by1 + " present on the page");
            return driver.findElement(by1).findElement(by2);
        } catch (Exception ex) {
            Log.info("Element searched by: " + by2 + " inside element by: " + by1 + " not found on the page: " + ex);
            return null;
        }
    }

    public List<WebElement> FindElementsWithDelay(By by, boolean isWait) {
        try {
            if (isWait) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            Log.info("Elements searched by: " + by + " present on the page");
            return driver.findElements(by);
        } catch (Exception ex) {
            Log.info("Element searched by: " + by + " not found on the page: " + ex);
            return null;
        }
    }

    public List<WebElement> FindElementsInsideElementWithDelay(By by1, By by2, boolean isWait) {
        try {
            if (isWait) wait.until(ExpectedConditions.visibilityOfElementLocated(by1));
            Log.info("Elements searched by: " + by2 + " inside element by: " + by1 + " present on the page");
            return driver.findElement(by1).findElements(by2);
        } catch (Exception ex) {
            Log.info("Elements searched by: " + by2 + " inside element by: " + by1 + " not found on the page: " + ex);
            return null;
        }
    }


}
