package telecom.pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import telecom.testconfig.BaseSetings;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByAttribute;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import telecom.testconfig.BaseSetings;
//import sapasoft.reg.testconfigs.BaseSetings;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

import telecom.pages.Adm;

public class ResetPage extends SmsLogPage {

    @Step("Сброс пароля")
    public void reset(String login, String password) {
        open("ru/");
        $(byText("Вход")).click();
        $(byName("phone")).setValue(login);
        $(by("type", "submit")).click();
        $(byClassName("authorization__user-forgot__trigger-class")).$(byClassName("auth__link-outside")).click();

        $(byId("one-time-code")).setValue(getsmscode(login)); //получаем смс код из аминки
        pause(2000);
        $(by("type", "submit")).click();//
        pause(2000);

        NewPassword(password);
    }

    @Step("Установка нового пароля")
    public void NewPassword(String password) {
        $(byId("userNewPassword")).setValue(password);
        $(byId("userRepeatNewPassword")).setValue(password);
        $(by("type", "submit")).click();

        $(byText("Пароль успешно сохранен"));
    }


    @Step("Проверка верификации ЛК2")
    public void verification() {
        open("ru/");technicalWorks();
        $(byText("Вход")).click();
        $(byName("phone")).setValue("7070310755");
        $(by("type", "submit")).click();
//        System.out.println($(withText("Мобильный номер не верифицирован.")).getText());
        $(withText("Мобильный номер не верифицирован.")).click();
        $(withText("Мобильный номер не верифицирован."))
                .$(byAttribute("href", "https://telecom.kz/ru/customer/verification/confirm-explanation")).click();


        webdriver().driver().switchTo().window(1);
        $(withText("Отсканируйте QR код с помощью мобильного телефона")).click();

        $(withText("Другой способ")).click();

//        open("ru/customer/verification/confirm-iin");
//        $(byClassName("recaptcha-checkbox-border")).click();
        $(byText("Продолжить")).click();
        $(byText("Подтверждение личности")).click();
        pause(5000);
    }


}
