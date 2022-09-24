package pages;

import com.codeborne.selenide.Condition;
import helpers.Helpers;
import io.qameta.allure.Step;
import locators.DesktopPageLocators;

public class DesktopPage {
    private DesktopPageLocators locator() {
        return new DesktopPageLocators();
    }

    @Step("Проверка имени текущего пользователя")
    public DesktopPage checkCurrentUserName (String username) {
        locator().currentUser().shouldHave(Condition.text(username));
        Helpers.takeScr(locator().desktopPage());
        return this;
    }
}
