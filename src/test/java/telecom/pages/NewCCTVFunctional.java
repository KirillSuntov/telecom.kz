package telecom.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class NewCCTVFunctional {
    public void WholeCCTV() {
        AuthCCTV();
        CCTVModule();
        AllTheTabsAndButtons();
    }

    @Step("Авторизация в учетную запись с технической возможностью")
    public void AuthCCTV() {
        open("");
        $$(byText("Вход")).last().click();
        $(byId("phone")).clear();
        $(byId("phone")).sendKeys("7007144012");
        $(byText("Продолжить")).click();
        $(By.xpath("//input[@name='password']")).sendKeys("Test4012");
        $(byXpath("//button[@type='submit']")).click();
        pause(3000);
    }

    @Step("Модуль видеонаблюдения и авторизация в Нетрис")
    public void CCTVModule() {
        $(byText("Лицевой счет 10412510")).click();
        $(byText("Видеонаблюдение в подъезде")).scrollTo().shouldBe(visible);
        $$(byClassName("kt-nav__link")).last().scrollTo().shouldBe(visible);
        pause(1000);
        $$(byClassName("kt-nav__link")).last().click();
        pause(2000);

        // Переход на iFrame с Нетрисом
        webdriver().driver().switchTo().frame(0);
        pause(1000);
        $(byText("Загрузка...")).shouldBe(visible);
        pause(8000);
    }

    @Step("Проверка всех вкладок и кнопок")
    public void AllTheTabsAndButtons() {
        // Открытие камеры
        $(byCssSelector("#react-main-app > div > div > div:nth-child(3) > div:nth-child(2) > div > div > div:nth-child(1) > div > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(2)")).click();
        pause(500);

        // Кнопка календаря
        $(byCssSelector("#react-main-app > div > div > div:nth-child(3) > div:nth-child(2) > div > div > div:nth-child(3) > div > div.player-window-dialog > div > div > div > div:nth-child(5) > div:nth-child(4)")).click();
        pause(500);
        $(byCssSelector("#react-main-app > div > div > div:nth-child(3) > div:nth-child(2) > div > div > div:nth-child(3) > div > div.player-window-dialog > div > div > div > div:nth-child(5) > div:nth-child(4) > div > div > div > div:nth-child(5) > svg:nth-child(2) > path")).click();

        // Кнопка скриншота
        $(byXpath("//a[@class='snapshot']")).click();
        pause(500);
        $(byXpath("//a[@class='snapshot']")).click();
        pause(500);

        // Кнопка закрытия окна камеры
        $(byCssSelector("#react-main-app > div > div > div:nth-child(3) > div:nth-child(2) > div > div > div:nth-child(3) > div > div.player-window-dialog > div > div > div > div:nth-child(3) > svg")).click();
        pause(500);


        // Переход в другие разделы
        $(byXpath("//a[@href='#/players-layout']")).shouldBe(visible);
        $(byText("На карте")).click();
        $(byText("Найти")).shouldBe(visible);
        $(byText("Настройки")).click();
        $$(byText("Персональные данные")).last().shouldBe(visible);
    }
}
