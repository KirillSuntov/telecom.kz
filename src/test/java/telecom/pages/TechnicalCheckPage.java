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
import static telecom.testconfig.BaseSetings.technicalWorks;

public class TechnicalCheckPage {

    public void CheckBody() {
        positiveCheck();
        negativeCheck();

    }

    @Step("Заполнение данных при наличии технической возможности")
    public  void positiveCheck() {


        open("ru/technical-check");    technicalWorks();
        $(byName("town_state_id")).setValue("Аст");
        pause(500);
        $$(byText("Астана")).last().click();
        $(byName("street")).setValue("ташенова");
        pause(500);
        $$(withText("ТАШЕНОВА")).first().click();
        $(byName("house")).setValue("8");
        pause(500);
        $(byClassName("technical-check")).$(byTagName("button")).click();
        $(byId("resultStatus___BV_modal_title_")).shouldHave(text("У вас есть техническая возможность"));
        $(byId("resultStatus___BV_modal_body_")).$(byTagName("button")).click();
        $(byId("potential___BV_modal_title_")).shouldHave(text("Оставить заявку"));
    }

    @Step("Заполнение данных при отсутствии технической возможности")
    public  void negativeCheck() {
        open("technical-check");     technicalWorks();
        $(byName("town_state_id")).setValue("Аст");
        pause(500);
        $$(byText("Астана")).last().click();
        $(byName("street")).setValue("ташенова");
        pause(500);
        $$(withText("ТАШЕНОВА")).first().click();
        $(byName("house")).setValue("88");
        pause(500);
        $(byClassName("technical-check")).$(byTagName("button")).click();

//        $(byId("resultStatus___BV_modal_title_")).shouldHave(text("К сожалению, у вас нет технической возможности подключения оптоволоконного интернет"));

    }

}
