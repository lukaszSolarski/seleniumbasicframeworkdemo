package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static config.WebDriverSingleton.getInstance;
import static utility.Actions.waitForElementVisibility;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(getInstance(), this);
        waitForElementVisibility(pageContent);
    }

    /*
    This is element that should be available at each page of the application under test.
    It's a main container at the web page with the page content.
     */
    @FindBy(id = "columns")
    private WebElement pageContent;
}
