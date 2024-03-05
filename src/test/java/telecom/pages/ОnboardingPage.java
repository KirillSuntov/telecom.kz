package telecom.pages;

import io.qameta.allure.Step;
import org.junit.Assert;

import java.io.IOException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;
import static telecom.testconfig.BaseSetings.screenshot1;
import org.openqa.selenium.Keys;

public class ОnboardingPage {
    public void CheckAll() {
        CheckTarif();
//        CheckKeremetTVPackageSettings();
//        CheckBereketPackageSettings();
//        CheckOnboardingFail();
//        CheckKeremetMobilePackageSettings();
        CheckOnboardingSuccess();
    }

    @Step("Проверка отображения тарифов на главной странице")
    public void CheckTarif() {
        open("ru/");
        $$(byClassName("new-service-package__card__image")).get(0).shouldBe(text("Keremet TV"));
        $$(byClassName("new-service-package__card__image")).get(1).shouldBe(text("Bereket"));
        $$(byClassName("new-service-package__card__image")).get(2).shouldBe(text("Keremet Mobile"));
    }

    @Step("Проверка конструктора пакета Keremet TV")
    public void CheckKeremetTVPackageSettings() {
        $$(withText("Подключить")).first().click();
        $(byClassName("package-settings-form__settings__banner-keremet-tv")).shouldBe(visible);
        $(byClassName("package-settings-form__contract-term")).shouldBe(visible);
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("3 года"));
        $$(byClassName("package-settings-form__calculate__row")).first().shouldHave(text("3 года"));
        $$(byClassName("package-settings-form__settings-description")).first().shouldBe(visible);
        $(byClassName("package-settings-form__calculate")).shouldBe(visible);
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("6 999 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("7 399 ₸/в месяц"));
        $$(byClassName("package-settings-form__settings__button")).get(1).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("2 года"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("2 года"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("7 499 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("7 899 ₸/в месяц"));
        $$(byClassName("package-settings-form__settings__button")).get(2).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("1 год"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("1 год"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("7 999 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("8 399 ₸/в месяц"));
        $(byClassName("no-contract")).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("Без контракта"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("Без контракта"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("8 499 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("8 899 ₸/в месяц"));
    }

    @Step("Проверка конструктора пакета Bereket")
    public void CheckBereketPackageSettings() {
        open("ru/");
        $$(withText("Подробнее")).get(2).click();
        $(byClassName("package-settings-form__settings__banner-bereket")).shouldBe(visible);
        $(byClassName("package-settings-form__contract-term")).shouldBe(visible);
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("3 года"));
        $$(byClassName("package-settings-form__calculate__row")).first().shouldHave(text("3 года"));
        $(byClassName("package-settings-form__mobile-connection")).shouldBe(visible);
        $(byXpath("//*[@class='package-settings-form__settings__sim active sim-altel']")).shouldBe(visible);
        $$(byClassName("package-settings-form__calculate__row")).get(1).shouldHave(text("Altel:"));
        $(byClassName("package-settings-form__settings__activ")).click();
        $(byXpath("//*[@class='package-settings-form__settings__sim active sim-activ']")).shouldBe(visible);
        $$(byClassName("package-settings-form__calculate__row")).get(1).shouldHave(text("Activ:"));
        $$(byClassName("package-settings-form__settings-description")).first().shouldBe(visible);
        $(byXpath("//*[@class='package-settings-form__settings__sim active']")).shouldHave(text("2 SIM"));
        $$(byClassName("package-settings-form__calculate__row")).get(1).shouldHave(text("2 SIM"));
        $(byXpath("(//*[@class='package-settings-form__settings__sim'])[2]")).click();
        $(byXpath("//*[@class='package-settings-form__settings__sim active']")).shouldHave(text("1 SIM"));
        $$(byClassName("package-settings-form__calculate__row")).get(1).shouldHave(text("1 SIM"));
        $(byClassName("package-settings-form__calculate")).shouldBe(visible);
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("8 999 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("9 399 ₸/в месяц"));
        $$(byClassName("package-settings-form__settings__button")).get(1).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("2 года"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("2 года"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("9 499 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("9 899 ₸/в месяц"));
        $$(byClassName("package-settings-form__settings__button")).get(2).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("1 год"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("1 год"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("9 999 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("10 399 ₸/в месяц"));
        $(byClassName("no-contract")).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("Без контракта"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("Без контракта"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("10 499 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("10 899 ₸/в месяц"));
    }

    @Step("Проверка конструктора пакета Keremet Mobile")
    public void CheckKeremetMobilePackageSettings() {
        open("ru/");
        $$(withText("Подробнее")).get(4).click();
        $(byClassName("package-settings-form__settings__banner-keremet-mobile")).shouldBe(visible);
        $(byClassName("package-settings-form__contract-term")).shouldBe(visible);
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("3 года"));
        $$(byClassName("package-settings-form__calculate__row")).first().shouldHave(text("3 года"));
        $(byClassName("package-settings-form__mobile-connection")).shouldBe(visible);
        $(byXpath("//*[@class='package-settings-form__settings__sim active sim-altel']")).shouldBe(visible);
        $$(byClassName("package-settings-form__calculate__row")).get(1).shouldHave(text("Altel:"));
        $(byClassName("package-settings-form__settings__activ")).click();
        $(byXpath("//*[@class='package-settings-form__settings__sim active sim-activ']")).shouldBe(visible);
        $$(byClassName("package-settings-form__calculate__row")).get(1).shouldHave(text("Activ:"));
        $$(byClassName("package-settings-form__settings-description")).first().shouldBe(visible);
        $(byXpath("//*[@class='package-settings-form__settings__sim active']")).shouldHave(text("2 SIM"));
        $$(byClassName("package-settings-form__calculate__row")).get(1).shouldHave(text("2 SIM"));
        $(byXpath("(//*[@class='package-settings-form__settings__sim'])[2]")).click();
        $(byXpath("//*[@class='package-settings-form__settings__sim active']")).shouldHave(text("1 SIM"));
        $$(byClassName("package-settings-form__calculate__row")).get(1).shouldHave(text("1 SIM"));
        $(byClassName("package-settings-form__calculate")).shouldBe(visible);
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("6 999 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("7 399 ₸/в месяц"));
        $$(byClassName("package-settings-form__settings__button")).get(1).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("2 года"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("2 года"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("7 499 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("7 899 ₸/в месяц"));
        $$(byClassName("package-settings-form__settings__button")).get(2).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("1 год"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("1 год"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("7 999 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("8 399 ₸/в месяц"));
        $(byClassName("no-contract")).click();
        $$(byCssSelector("[class*='active']")).get(9).shouldHave(text("Без контракта"));
        $(byClassName("package-settings-form__calculate__row")).shouldHave(text("Без контракта"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(2).shouldHave(text("8 499 ₸"));
        $$(byClassName("package-settings-form__calculate__payment-row")).get(3).shouldHave(text("400 ₸"));
        $(byClassName("package-settings-form__calculate__total-row")).shouldHave(text("8 899 ₸/в месяц"));
    }

    @Step("Неуспешное создание абонента Казахтелеком")
    public void CheckOnboardingFail() {
        $(byClassName("package-settings-form__btn__desk")).click();
        $(byId("FunctionalAccessWarningPopup___BV_modal_body_")).shouldBe(visible);
        $(byClassName("functionalAccessWarning__btn__primary")).click();
        $(byClassName("qr")).shouldBe(visible);
        $(byClassName("qr__link")).click();
        $(byClassName("ui-form__input__mobile")).setValue("7777777777");
        $(byName("town_state_id")).click();
        $(byName("town_state_id")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        $(byName("street")).setValue("ул. Е-753").sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        $(byName("house")).setValue("1");
        $(byClassName("technicalForm__btn__primary")).click() ;
        $(byId("LeadExistPopup___BV_modal_body_")).shouldBe(visible);
    }

    @Step("Создание абонента Казахтелеком до отправки кода otp")
    public void CheckOnboardingSuccess() {
        $$(withText("Подключить")).first().click();
        $(byXpath("//span[@aria-hidden='true']")).click();
        $(byXpath("(//*[@class='row inside-popup__btns']/div)[1]")).click();
        $$(withText("Подключить")).get(1).click();
        $(byXpath("//span[@aria-hidden='true']")).click();
        $(byXpath("(//*[@class='row inside-popup__btns']/div)[1]")).click();
        $$(withText("Подключить")).get(2).click();
        $(byClassName("ui-form__input__mobile")).setValue("7077777771");
        $(byName("town_state_id")).click();
        $(byName("town_state_id")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        $(byName("street")).setValue("ул. Е-753").sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        $(byName("house")).setValue("1");
        $(byClassName("technicalForm__btn__primary")).click() ;
//        $(byClassName("vue-otp")).shouldBe(visible);
    }
}
