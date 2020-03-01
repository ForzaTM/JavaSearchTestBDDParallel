package Core;

import Utilities.Log;
import org.openqa.selenium.WebElement;

public class CommonActions {
    private DriverManager manager;

    public CommonActions(DriverManager manager) {
        this.manager = manager;
    }

    public void OpenUrlWithBrowser(String browser, String url) throws Exception {
        Log.startLog("Starting " + browser + " browser with " + url +" url") ;
        try {
            manager.Driver(browser);
            manager.driver.get(url);
        } catch (Exception ex) {
            Log.error("Something went wrong during Driver method execution: " + ex);
            throw new Exception("Something went wrong during Driver method execution: " + ex);
        }
    }

    public void Click(WebElement element) throws Exception {
        try
        {
            element.click();
        }
        catch(Exception ex)
        {
            Log.error("Click on element failed: Exception: " + ex);
            throw new Exception("Click on element failed with exception: " + ex);
        }
        Log.info("Successful Click on element");
    }

    public String GetTitleOfTheCurrentBrowserPage() throws Exception {
        try {
            return manager.driver.getTitle();
        }
        catch(Exception ex)
        {
            Log.error("Exceptions in GetTitleOfTheCurrentBrowserPage method: " + ex);
            throw new Exception("Exceptions in GetTitleOfTheCurrentBrowserPage method: " + ex);
        }
    }
}
