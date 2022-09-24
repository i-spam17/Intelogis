package helpers;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Helpers {
    public static void takeScr(SelenideElement element) {
        /**
         скриншот элемента страницы
         */
        String actualPath = "target/screenshots_pages/";
        try {
            FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(actualPath));
            AttachScreen(Files.readAllBytes(Paths.get(actualPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Attachment(type = "image/png")
    public static byte[] AttachScreen(byte[] bytes) {
        return bytes;
    }

    /**
     загрузка данных из файла
     */
    static FileInputStream data;
    static Properties property = new Properties();

    public static Properties loadProperties() {
        try {
            data = new FileInputStream("src/test/resources/configuration.properties");
            property.load(data);
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсутствует!");
        }
        return property;
    }


}
