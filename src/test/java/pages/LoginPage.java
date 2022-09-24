package pages;

import com.codeborne.selenide.Condition;
import helpers.Helpers;
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
    public void clickEnterButton() {
        locator().enterButton().click();
    }

    @Step("Проверка алерта в поле \"логин\" ")
    public LoginPage checkAlertLogin(String alertLoginText) {
        Helpers.takeScr(locator().loginPage());
        locator().alertLogin().shouldBe(Condition.text(alertLoginText));
        return this;
    }

    @Step("Проверка алерта в поле \"пароль\" ")
    public void checkAlertPass(String alertPassText) {
        Helpers.takeScr(locator().loginPage());
        locator().alertPassword().shouldBe(Condition.text(alertPassText));
    }

    @Step("Проверка алерта  \"ошибка авторизации\" ")
    public void checkAlertErrorAuth(String alertErrorAuthText) {
        Helpers.takeScr(locator().loginPage());
        locator().alertErrorAuth().shouldBe(Condition.text(alertErrorAuthText));
    }
}
