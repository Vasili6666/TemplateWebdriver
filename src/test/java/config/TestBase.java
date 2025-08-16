/*
Меняем настройки:

        Открываем build.gradle и меняем:

        groovy
        group = 'your.new.package'  // Новое значение
        version = '1.0-SNAPSHOT'    // Можно оставить
        Обновляем пакеты:

        ПКМ на папке src/test/java/config → Refactor → Rename

        Меняем на ваш пакет (например, com.yourcompany.config)
*/


package config;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

    public class TestBase {
        @BeforeAll
        static void setup() {
            Configuration.browser = "chrome";
            Configuration.browserSize = "1920x1080";
            Configuration.timeout = 10000;
            Configuration.pageLoadStrategy = "eager";
            Configuration.webdriverLogsEnabled = true;
        }
    }

