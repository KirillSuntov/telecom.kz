package telecom.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class FWALTEPage {
    public void CheckAll() {
        CheckTarif();
        CheckPackageSettings();
    }

    @Step("Проверка отображения тарифов на главной странице")
    public void CheckTarif() {

    }

    @Step("Переход на потенциальную сделку")
    public void CheckPackageSettings() {

    }
}
