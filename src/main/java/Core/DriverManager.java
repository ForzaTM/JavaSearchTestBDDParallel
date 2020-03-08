package Core;

import Utilities.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {

    private WebDriver driver;
    private WebDriverWait wait;

    public void getBrowser(String browser) throws Exception {
        if (driver == null) {
            if (browser.toLowerCase().contains("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.toLowerCase().contains("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browser.toLowerCase().contains("opera")) {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
            } else {
                Log.error("Passed Browser: " + browser + " is not in the list of Driver method cases");
                throw new Exception("Passed Browser: " + browser + " is not in the list of Driver method cases");
            }
        }
            wait = new WebDriverWait(driver, 5);

            Log.info(browser + " driver successfully initialized");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}

