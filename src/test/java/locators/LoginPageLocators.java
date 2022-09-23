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
}
