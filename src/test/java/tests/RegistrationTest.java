package tests;

import config.TestConfig;
import org.junit.Test;
import pages.HomePage;

public class RegistrationTest extends TestConfig {

    @Test
    public void userShouldSuccessfullyRegister() throws InterruptedException {
        new HomePage()
                .openSignInPage();
        Thread.sleep(5000);
    }
}
