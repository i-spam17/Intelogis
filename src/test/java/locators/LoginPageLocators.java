package locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageLocators {
    public SelenideElement loginField() {
        return $(By.xpath("//input[@id=\"login\"]"));
    }

    public SelenideElement passwordField() {
        return $(By.xpath("//input[@id=\"password\"]"));
    }

    public SelenideElement enterButton() {
        return $(By.xpath("//span[.='Войти']"));
    }

    public SelenideElement alertLogin() {
        return $(By.xpath("//div[contains(text(), 'логин')]"));
    }

    public SelenideElement alertPassword() {
        return $(By.xpath("//div[contains(text(), 'пароль')]"));
    }

    public SelenideElement loginPage() {return $(By.xpath("//main"));}

    public SelenideElement alertErrorAuth() {
        return $(By.xpath("//div[text()='Ошибка авторизации. Не верные логин/пароль']"));
    }
}
