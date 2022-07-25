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
        $(by("type", "submit")).click();
        pause(2000);

        NewPassword(password);
    }

    @Step("Установка нового пароля")
    public void NewPassword(String password) {
//        $("#password").setValue(withText("admin").sensitive());

        $(byId("userNewPassword")).setValue(password);
        $(byId("userRepeatNewPassword")).setValue(password);
        $(by("type", "submit")).click();

        $(byText("Пароль успешно сохранен"));
    }
}
