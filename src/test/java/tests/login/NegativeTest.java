package tests.login;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.LoginPage;

import java.util.stream.Stream;

public class NegativeTest extends BaseTest {
    private static final String ALERT_LOGIN_TEXT = "Пожалуйста, введите логин";
    private static final String ALERT_PASS_TEXT = "Пожалуйста, введите пароль";
    private static final String ALERT_ERROR_AUTH_TEXT = "Ошибка авторизации. Не верные логин/пароль";

    static Stream<Arguments> negativeData() {
        return Stream.of(
                Arguments.of(" ", " "),
                Arguments.of("test@test.test", "12345678"),
                Arguments.of("123", "123"),
                Arguments.of("фыв", "фыв"),
                Arguments.of("#/_!@\\'*&?", "#/_!@\\'*&?"),
                Arguments.of("-1", "-1"),
                Arguments.of("0", "0"),
                Arguments.of(Double.toString(Math.pow(10, 256)), Double.toString(Math.pow(10, 256))),
                Arguments.of("q we@qwe.qwe", "q we@qwe.qwe")
        );
    }

    @ParameterizedTest
    @MethodSource("negativeData")
    @DisplayName("Пользователь ввел некорректные данные при авторизации")
    void userFilledNotCorrectData(String login, String pass) {
        openLoginPage()
                .fillInputLogin(login)
                .fillInputPass(pass)
                .clickEnterButton();

        new LoginPage()
                .checkAlertErrorAuth(ALERT_ERROR_AUTH_TEXT);
    }

    @Test
    @DisplayName("Пользователь ввел пустые при авторизации")
    void userFilledEmptyData() {
        openLoginPage()
                .fillInputLogin("")
                .fillInputPass("")
                .clickEnterButton();
        new LoginPage()
                .checkAlertLogin(ALERT_LOGIN_TEXT)
                .checkAlertPass(ALERT_PASS_TEXT);
    }
}
