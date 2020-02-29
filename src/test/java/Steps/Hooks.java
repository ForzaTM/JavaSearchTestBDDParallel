package Steps;

import Core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    public DriverManager manager;
    public WebDriver driver;

    public Hooks(DriverManager manager) {
        this.manager = manager;
        driver = manager.driver;
    }

    @After
    public void CleanUp() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }

}
