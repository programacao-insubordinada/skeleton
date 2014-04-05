package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;

    public static void createPhantomJSDriver() {
        driver = new PhantomJSDriver();
        setDefaultDriverTimeout();
    }

    public static void createFireFoxDriver() {
        driver = new FirefoxDriver();
        setDefaultDriverTimeout();
    }

    public static WebDriver getCurrentDriver() {
        return driver;
    }

    public static void shutdownCurrentDriver() {
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

    private static void setDefaultDriverTimeout() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
