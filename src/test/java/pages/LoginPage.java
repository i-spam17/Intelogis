package pages;

import io.qameta.allure.Step;
import locators.LoginPageLocators;

public class LoginPage {
    private LoginPageLocators locator() {
        return new LoginPageLocators();
    }

    @Step("Заполняем поле \"логин\"")
    public LoginPage fillInputLogin(String login) {
        locator().loginField().click();
        locator().loginField().sendKeys(login);
        return this;
    }

    @Step("Заполняем поле \"пароль\" ")
    public LoginPage fillInputPass(String pass) {
        locator().passwordField().click();
        locator().passwordField().sendKeys(pass);
        return this;
    }

    @Step("Клик на кнопку \"Войти\" ")
    public LoginPage clickEnterButton() {
        locator().enterButton().click();
        return this;
    }
}
