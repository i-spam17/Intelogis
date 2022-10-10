package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    @BeforeAll
    public static void setup() {
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserPosition = "10x10";
        Configuration.browserSize = "780x950";
        Configuration.headless = true;// удалить строку если нужно посмотреть на браузер!
        Configuration.baseUrl = "https://ilswebreact-develop.azurewebsites.net/";
        Configuration.reportsFolder = "target/screenshots";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    public LoginPage openLoginPage() {
        open("/");
        return new LoginPage();
    }

    @AfterAll
    public static void logout() {
        closeWebDriver();
    }
}
