package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class HomePage extends BasePage {
    public HomePage() {
        super();
    }

    @FindBy(css = "[title=\"Log in to your customer account\"]")
    private WebElement signInButton;

    @Step
    public SignInPage openSignInPage() {
        signInButton.click();
        captureScreenshot();
        return new SignInPage();
    }
}
