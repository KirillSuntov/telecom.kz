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
import telecom.pages.Adm;
import telecom.testconfig.BaseSetings;

public class AutoPaymentPage extends BaseSetings {
    public void CheckAll() {
        CreateAutoPayment();
        UpdateAutoPayment();
        DeleteAutoPayment();
    }

    @Step("Создание автооплаты")
    public void CreateAutoPayment() {
        open("ru/");
        $(byXpath("//*[@class='btn btn-with-icon main-menu__actions-item d-block']")).click();
        $(byName("abonent_id")).setValue("60205");
        $(byXpath("(//*[@class='btn btn-primary btn-block'])[1]")).click();
        $(byClassName("modal-info")).shouldBe(visible);
        pause(1000);
        $(byXpath("//button[@class='button-primary defaultModal__btn']")).click();
        $(byName("phone")).setValue(login);
        $(by("type", "submit")).click();
        $(byName("password")).setValue(password);
        $(by("type", "submit")).click();
        $(byXpath("//div[@class='title']")).shouldHave(text("Мой автоплатеж"));
        $(byXpath("//*[@class='t-input t-input--disabled']")).shouldHave(text("Отключен"));
        $(byXpath("//*[@class='info']")).shouldHave(text("Автоплатеж позволит Вам автоматически оплачивать услуги АО \"Казахтелеком\" каждый месяц на любую удобную Вам сумму"));
        $(byXpath("//*[@class='btn btn-secondary']")).click();
        $(byXpath("//div[@class='title']")).shouldHave(text("Создать автоплатеж"));
        $(byXpath("//*[@class='btn btn-primary disabled']")).shouldHave(text("Продолжить"));
        $(byXpath("(//*[@type='text'])[1]")).setValue("199");
        $(byXpath("//*[@class='t-input error']")).should(exist);
        $(byXpath("(//*[@type='text'])[1]")).setValue("20000");
        $(byXpath("//*[@class='t-input error']")).shouldNot(exist);
        $(byClassName("checkbox")).click();
        $(byXpath("//*[@class='btn btn-primary']")).shouldHave(text("Продолжить")).click();
        $(byXpath("//*[@class='btn btn-primary disabled']")).shouldHave(text("Продолжить"));
        $(byXpath("//*[@class='btn btn-white']")).click();
        $(byXpath("//*[@class='frame-kazaktelecom frame-kazaktelecom--save-card']")).shouldBe(visible);
        back();
        $(byClassName("t-checkbox")).click();
        $(byXpath("//*[@class='btn btn-primary']")).shouldHave(text("Продолжить")).click();
        $(byXpath("//*[@class='modal-info confirm-modal']")).shouldBe(visible);
        $(byXpath("//*[@class='btn btn-secondary']")).click();
        pause(1000);
        $(byXpath("(//*[@type='text'])[1]")).setValue("200");
        $(byXpath("//*[@class='btn btn-primary']")).shouldHave(text("Продолжить")).click();
        pause(1000);
        $(byClassName("auto-payment-status")).shouldBe(visible);
        $(byXpath("//*[@class='btn btn-primary']")).click();
        $(byXpath("//*[@class='t-input t-input--disabled']")).shouldHave(text("Включен"));
        $(byXpath("(//*[@class='t-input t-input--disabled'])[4]")).should(exist);
    }

    @Step("Изменение автооплаты")
    public void UpdateAutoPayment() {
        $(byXpath("//*[@class='btn btn-secondary']")).click();
        $(byXpath("//*[@class='t-checkbox checked']")).click();
        $(byXpath("//*[@class='modal-info status-modal']")).shouldBe(visible);
        $(byXpath("//*[@class='btn btn-primary']")).click();
        $(byXpath("//*[@class='t-input t-input--disabled']")).shouldHave(text("Отключен"));
        $(byXpath("//*[@class='btn btn-secondary']")).click();
        $(byXpath("//*[@alt='calendar']")).click();
        $(byId("auto-payment-modal-calendar___BV_modal_content_")).shouldBe(visible);
        $(byXpath("//*[@class='btn btn-primary']")).click();
        $(byXpath("//*[@alt='credit-cart']")).click();
        $(byId("auto-payment-select-card___BV_modal_body_")).shouldBe(visible);
        pause(1000);
        $(byXpath("//*[@class='t-checkbox checked']")).click();
        $(byXpath("//*[@class='btn btn-primary']")).click();
        $(byXpath("//*[@class='btn btn-secondary disabled']")).shouldHave(text("Применить настройки"));
    }

    @Step("Удаление автооплаты")
    public void DeleteAutoPayment() {
        $(byXpath("//span[@role='button']")).click();
        $(byXpath("//*[@class='modal-info reset-settings']")).shouldBe(visible);
        $(byXpath("//*[@class='btn btn-primary']")).click();
        pause(1000);
        $(byXpath("//*[@class='modal-info__title']")).shouldHave(text("Настройки автоплатежа успешно сохранены"));
        $(byXpath("//*[@class='btn btn-primary']")).click();
        $(byXpath("//div[@class='title']")).shouldHave(text("Мой автоплатеж"));
        $(byXpath("//*[@class='t-input t-input--disabled']")).shouldHave(text("Отключен"));
    }
}
