package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Class responsible for creating WebDriver and preventing from existence of more than one driver at once.
 */
public class WebDriverSingleton {
    private static WebDriver driver;

    /*
    This is the only one constructor and it is private to prevent from creating more than one instance of this class;
     */
    private WebDriverSingleton() {}

    /*
    Returns the selenium driver. If the driver doesn't exist, it will be created here.
     */
    public static WebDriver getInstance() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    /*
    Closes the browsers and assigns the null to the 'driver'
     */
    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}