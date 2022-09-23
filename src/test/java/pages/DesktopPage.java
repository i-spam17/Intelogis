package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import locators.DesktopPageLocators;

public class DesktopPage {
    private DesktopPageLocators locator() {
        return new DesktopPageLocators();
    }

    @Step("Проверка имени текущего пользователя")
    public DesktopPage checkCurrentUserName (String username) {
        locator().currentUser().shouldHave(Condition.text(username));
        return this;
    }

    @Step("Проверка заголовка \"Рабочий стол\"")
    public DesktopPage checkHeadName (String headName) {
        locator().headName().shouldHave(Condition.text(headName));
        return this;
    }
}
