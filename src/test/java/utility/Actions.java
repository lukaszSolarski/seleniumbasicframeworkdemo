package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static config.WebDriverSingleton.getInstance;
public class Actions {
    private static final int WAIT_TIMEOUT = 10;
    private static WebDriverWait wait = new WebDriverWait(getInstance(), WAIT_TIMEOUT);

    /*
    Wait until element is visible at the page.

    @param element the element that you are waiting for
     */
    public static void waitForElementVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
