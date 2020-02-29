package Core;

import org.openqa.selenium.WebElement;

public class CommonActions {
    private DriverManager manager;

    public CommonActions(DriverManager manager) {
        this.manager = manager;
    }

    public void OpenUrlWithBrowser(String browser, String url) throws Exception {
        try {
            manager.Driver(browser);
            manager.driver.get(url);
        } catch (Exception ex) {
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
            //log.Info("Click on element failed: " + element.getTagName() + " Exception: " + ex);
            throw new Exception("Click on element failed: " + element.getTagName() + " Exception: " + ex);
        }
        //log.Info("Successful Click on element: " + element.getTagName());
    }

    public String GetTitleOfTheCurrentBrowserPage() throws Exception {
        try {
            return manager.driver.getTitle();
        }
        catch(Exception ex)
        {
            //log.error("Failed to get title of the current browser page: " + ex);
            throw new Exception("Failed to get title of the current browser page: " + ex);
        }
    }
}
