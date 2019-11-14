package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class SignInPage extends BasePage {

    public SignInPage() {super();}

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement registerButton;

    @FindBy(xpath = "//label[text()='Email address']/input")
    private WebElement emailInput;

    @Step
    public RegisterPage openRegisterPage(String email) {
        emailInput.sendKeys(email);
        registerButton.click();
        captureScreenshot();
        return new RegisterPage();
    }
}
