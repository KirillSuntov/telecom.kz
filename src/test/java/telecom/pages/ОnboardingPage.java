package telecom.pages;

import io.qameta.allure.Step;
import org.junit.Assert;

import java.io.IOException;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;
import static telecom.testconfig.BaseSetings.screenshot1;

public class ОnboardingPage {
    public void CheckAll() {
        CheckTarif();
        CheckPackageSettings();
    }

    @Step("Проверка отображения тарифов на главной странице")
    public void CheckTarif() {
        open("ru/");
        $$(byClassName("new-service-package__card__image")).get(0).shouldBe(text("Keremet TV"));
        $$(byClassName("new-service-package__card__image")).get(1).shouldBe(text("Bereket"));
        $$(byClassName("new-service-package__card__image")).get(2).shouldBe(text("Keremet Mobile"));
    }

    @Step("Переход на конструктор пакета")
    public void CheckPackageSettings() {
        $$(withText("Подробнее")).get(1).click();
        $(byClassName("package-settings-form__settings__banner-bereket")).isDisplayed();

        pause(5000);
    }

}
