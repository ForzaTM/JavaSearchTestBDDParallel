package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {

    public WebDriver driver;
    public WebDriverWait wait;

    public void Driver(String browser) throws Exception {

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
            throw new Exception("Passed Browser is not in the list of Driver method cases");
        }
        wait = new WebDriverWait(driver, 5);
    }
}

