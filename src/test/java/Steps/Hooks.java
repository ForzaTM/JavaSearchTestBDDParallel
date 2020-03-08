package Steps;

import Core.DriverManager;
import Utilities.Log;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public DriverManager manager;
    public WebDriver driver;

    public Hooks(DriverManager manager) {
        this.manager = manager;
        driver = manager.getDriver();
    }

    @After
    public void End(Scenario scenario) {
        if (driver != null) {
            if (scenario.isFailed()) {
                Log.error("Scenario: " + scenario.getName() + " Failed. Capturing screenshot!");
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            }
            Log.info("Clearing all coockies and closing driver");
            driver.manage().deleteAllCookies();
            driver.quit();
        }
        Log.info("Test finished with status: " + scenario.getStatus());
    }

}
