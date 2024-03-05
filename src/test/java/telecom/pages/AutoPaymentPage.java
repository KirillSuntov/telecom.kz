package telecom.pages;

import io.qameta.allure.Step;
import org.junit.Assert;

import java.io.IOException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;
import static telecom.testconfig.BaseSetings.screenshot1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import telecom.pages.Adm;
import telecom.testconfig.BaseSetings;

public class
AutoPaymentPage extends BaseSetings {
    @Step("Создание автооплаты")
    public void CreateAutoPayment() {
        GoToAutoPayment();
        Authorization();
        HavingAutoPaymentCheck();
        MyAutoPaymentCheck();
        SmallSumCheck();
        CalendarCheck();
        AddingCardCheck();
        BigSumCheck();
        CreatingAutoPayment();
    }

    @Step("Изменение автооплаты")
    public void UpdateAutoPayment() {
        UpdatingStatusCheck();
        UpdatingDateCheck();
        UpdatingCardCheck();
    }

    @Step("Удаление автооплаты")
    public void DeleteAutoPayment() {
        DeletingAutoPayment();
        DeletingAutoPaymentCheck();
    }

    @Step("Переход на страницу с авторизацией для создания автоплатежа")
    public void GoToAutoPayment() {

        open("ru/");
        $(byXpath("//*[@class='btn btn-with-icon main-menu__actions-item d-block']")).click();
        $(byName("abonent_id")).setValue("60205");
        $(byXpath("(//*[@class='btn btn-primary btn-block'])[1]")).click();
        $(byClassName("modal-info")).shouldBe(visible);
        pause(1000);

    }

    @Step("Авторизация")
    public void Authorization() {

        $(byXpath("//button[@class='button-primary defaultModal__btn']")).click();
        $(byName("phone")).setValue(login);
        $(by("type", "submit")).click();
        $(byName("password")).setValue(password);
        $(by("type", "submit")).click();
        pause(1000);

    }

    @Step("Проверка наличия уже существующего автоплатежа")
    public void HavingAutoPaymentCheck() {
pause(5000);
        open("ru/customer/auto-payment/");
        String name;
        name=$(byXpath("//*[@class='btn btn-secondary']")).getText();

        if (name.equals("Изменить настройки") ){

        $(byXpath("//*[@class='btn btn-secondary']")).click();
        DeleteAutoPayment();

        }
    }

    @Step("Проверка страницы 'Мой автоплатеж'")
    public void MyAutoPaymentCheck() {

        if ($(withText("Выбор личевого счета")).is(visible)) {
            $(withText("Продолжить")).click();
        } ;
        $(byXpath("//div[@class='title']")).shouldHave(text("Мой автоплатеж"));
        $(byXpath("//*[@class='t-input t-input--disabled']")).shouldHave(text("Отключен"));
        $(byXpath("//*[@class='info']")).shouldHave(text("Автоплатеж позволит Вам автоматически оплачивать услуги АО \"Казахтелеком\" каждый месяц на любую удобную Вам сумму"));
        $(byXpath("//*[@class='btn btn-secondary']")).click();
        $(withText("Продолжить")).click();
        pause(5000);
        if ($(withText("Выбор личевого счета")).is(visible)) {
            $(withText("Продолжить")).click();
        } ;
        $(byXpath("//div[@class='title']")).shouldHave(text("Создать автоплатеж"));
        $(byXpath("//*[@class='btn btn-primary disabled']")).shouldHave(text("Продолжить"));

    }

    @Step("Проверка ввода значения меньше минимально необходимого")
    public void SmallSumCheck() {

        $(byXpath("(//*[@type='text'])[1]")).setValue("199");
        $(byXpath("//*[@class='t-input error']")).should(exist);

    }

    @Step("Проверка настройки даты оплаты")
    public void CalendarCheck() {

        $(byXpath("//*[@alt='calendar']")).click();
        pause(1000);
        $(byId("auto-payment-modal-calendar___BV_modal_header_")).shouldBe(visible);
        $(byXpath("//*[@class='calendar-header']/button[2]")).click();
        $(byXpath("//*[@class='calendar-table']/tbody/tr[3]/td[1]")).click();
        $(byXpath("//*[@class='btn btn-primary']")).click();

    }

    @Step("Проверка добавления карты")
    public void AddingCardCheck() {

        $(byXpath("(//*[@type='text'])[1]")).setValue("200");
        $(byXpath("//*[@class='t-input error']")).shouldNot(exist);
        $(byClassName("checkbox")).click();
        $(byXpath("//*[@class='btn btn-primary']")).shouldHave(text("Продолжить")).click();
        $(byXpath("//*[@class='btn btn-primary disabled']")).shouldHave(text("Продолжить"));
        $(byXpath("//*[@class='btn btn-white']")).click();
        $(byXpath("//*[@class='frame-kazaktelecom frame-kazaktelecom--save-card']")).shouldBe(visible);
        back();
        $(byClassName("t-checkbox")).click();
        pause(1000);

    }

    @Step("Проверка отображения модалки с подтверждением автооплаты крупной суммы")
    public void BigSumCheck() {

        $(byXpath("(//*[@type='text'])[1]")).setValue("20000");
        $(byXpath("//*[@class='btn btn-primary']")).shouldHave(text("Продолжить")).click();
        pause(1000);
        $(byXpath("//*[@class='modal-info confirm-modal']")).shouldBe(visible);
        $(byXpath("//*[@class='btn btn-secondary']")).click();
//        $(byClassName("t-checkbox")).click();
        pause(1000);

    }

    @Step("Создание автооплаты")
    public void CreatingAutoPayment() {

        $(byXpath("(//*[@type='text'])[1]")).setValue("200");
        pause(1000);
        $(byXpath("//*[@class='btn btn-primary']")).shouldHave(text("Продолжить")).click();
        $(byClassName("auto-payment-status")).shouldBe(visible);
        $(byXpath("//*[@class='btn btn-primary']")).click();
        $(byXpath("//*[@class='t-input t-input--disabled']")).shouldHave(text("Включен"));
        $(byXpath("(//*[@class='t-input t-input--disabled'])[4]")).should(exist);

    }

    @Step("Проверка изменения статуса услуги")
    public void UpdatingStatusCheck() {

        $(byXpath("//*[@class='btn btn-secondary']")).click();
        $(byXpath("//*[@class='t-checkbox checked']")).click();
        $(byXpath("//*[@class='modal-info status-modal']")).shouldBe(visible);
        pause(1000);
        $(byXpath("//*[@class='btn btn-primary']")).click();
        $(byXpath("//*[@class='t-input t-input--disabled']")).shouldHave(text("Отключен"));

    }

    @Step("Провера изменения даты автоооплаты")
    public void UpdatingDateCheck() {

        $(byXpath("//*[@class='btn btn-secondary']")).click();
        $(byXpath("//*[@alt='calendar']")).click();
        $(byId("auto-payment-modal-calendar___BV_modal_content_")).shouldBe(visible);
        $(byXpath("//*[@class='calendar-table']/tbody/tr[3]/td[2]")).click();
        $(byXpath("//*[@class='btn btn-primary']")).click();

    }

    @Step("Проверка изменения банковской карты")
    public void UpdatingCardCheck() {

        $(byXpath("//*[@alt='credit-cart']")).click();
        $(byId("auto-payment-select-card___BV_modal_body_")).shouldBe(visible);
        pause(3000);
        $(byXpath("//*[@class='t-checkbox checked']")).click();
        pause(3000);
        $(byXpath("//*[@class='btn btn-primary']")).click();
        pause(3000);
        $(byXpath("//*[@class='btn btn-secondary disabled']")).shouldHave(text("Применить настройки"));

    }

    @Step("Удаление автооплаты")
    public void DeletingAutoPayment() {

        $(byXpath("//span[@role='button']")).click();
        $(byXpath("//*[@class='modal-info reset-settings']")).shouldBe(visible);
        $(byXpath("//*[@class='btn btn-primary']")).click();
        pause(1000);

    }

    @Step("Проверка удаления автооплаты")
    public void DeletingAutoPaymentCheck() {

        $(byXpath("//*[@class='modal-info__title']")).shouldHave(text("Настройки автоплатежа успешно сохранены"));
        $(byXpath("//*[@class='btn btn-primary']")).click();
        $(byXpath("//div[@class='title']")).shouldHave(text("Мой автоплатеж"));
        $(byXpath("//*[@class='t-input t-input--disabled']")).shouldHave(text("Отключен"));

    }
}
