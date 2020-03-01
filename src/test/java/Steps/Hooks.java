package Steps;

import Core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public DriverManager manager;
    public WebDriver driver;

    public Hooks(DriverManager manager) {
        this.manager = manager;
        driver = manager.driver;
    }

    @After
    public void TearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }

}
