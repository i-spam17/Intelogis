package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    public static void setup() {
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserPosition = "890x10";
        Configuration.browserSize = "780x950";
        Configuration.baseUrl = "https://ilswebreact-develop.azurewebsites.net/";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
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
