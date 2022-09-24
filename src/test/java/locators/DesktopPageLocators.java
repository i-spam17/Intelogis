package locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DesktopPageLocators {
    public SelenideElement currentUser() {
        return $(By.xpath("//span[.='Тестер']"));
    }

    public SelenideElement desktopPage(){return $(By.xpath("//main"));}
}
