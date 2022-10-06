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
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class VasPage {
    public void CheckALL() {
        addVas();
        delVas();
    }

    @Step("Подключение услуги Музыка Nur.kz")
    public void addVas() {
        $$(byText("Подключить")).get(1).click();
        $(byClassName("extra__services__email")).$(byText("Подключить")).click();
        pause(25000);
    }

    @Step("Отключение услуги Музыка Nur.kz")
    public void delVas() {
        pause(2000);
        open("ru/customer/services");
        $(byText("Отключить")).scrollTo().click();
        $(byText("Вы действительно хотите отключить \"Музыка Nur.kz\" ?"));
//       $(byClassName("btn btn-danger")).click();
        $$("[class*=btn-danger]").get(2).click();
        pause(5000);
        $(byText("Запрос обработан"));
    }
}
