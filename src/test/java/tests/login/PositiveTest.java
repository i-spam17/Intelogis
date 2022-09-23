package tests.login;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.DesktopPage;

public class PositiveTest extends BaseTest {
    private static final String LOGIN = "rekame2869@seinfaq.com";
    private static final String PASSWORD = "XRCa91zn4fsJzcHW";
    private static final String USERNAME = "Тестер";

    @Test
    @DisplayName("Тест аунтификации в аккаунте")
    void checkUserAuth() {
        openLoginPage()
                .fillInputLogin(LOGIN)
                .fillInputPass(PASSWORD)
                .clickEnterButton();
        new DesktopPage().checkCurrentUserName(USERNAME);
    }
}
