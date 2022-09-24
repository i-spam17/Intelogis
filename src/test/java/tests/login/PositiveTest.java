package tests.login;

import base.BaseTest;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import helpers.Helpers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.DesktopPage;

public class PositiveTest extends BaseTest {
    private static final String LOGIN = Helpers.loadProperties().getProperty("LOGIN");
    private static final String PASSWORD = Helpers.loadProperties().getProperty("PASSWORD");
    private static final String USERNAME = "Тестер";


    @Test
    @DisplayName("Тест авторизации в аккаунте")
    @ExtendWith({ScreenShooterExtension.class})
    void userCanLoginToTMS() {
        openLoginPage()
                .fillInputLogin(LOGIN)
                .fillInputPass(PASSWORD)
                .clickEnterButton();
        new DesktopPage().checkCurrentUserName(USERNAME);
    }
}
