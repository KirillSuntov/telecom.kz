package telecom.pages;

import com.codeborne.selenide.impl.Screenshot;
import io.qameta.allure.Step;
import org.junit.Assert;
import telecom.testconfig.BaseSetings;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByAttribute;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import telecom.testconfig.BaseSetings;
//import sapasoft.reg.testconfigs.BaseSetings;

import java.io.IOException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.screenshots;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;
import static telecom.testconfig.BaseSetings.screenshot1;


public class PaymentPage {

    @Step("Переход на страницу оплаты")
    public void Payment() {
        LSForm();
        KT_Pay();
        pause(2000);
        TlForm();
        KT_Pay();
    }

    @Step("Переход на страницу оплаты")
    public void PaymentLK() {
        LKForm();
        KT_Pay();
        pause(2000);
    }

    @Step("Переход на оплату по номеру телефона")
    public void TlForm(){
        open("ru/");
        $("[class*=menu__payment]").click();
        $$(byClassName("nav-item")).first().click();
        $(byName("phone")).setValue("728 363-0378");
        pause(4000);

        System.out.println($(byName("amount")).getValue());
        if ($(byName("amount")).getValue().length()>1){
            System.out.println($(byName("amount")).getValue().length());
        }
        else{

            screenshot("123");
            try {
                screenshot1("Скрин последней страницы");
            } catch (IOException e) {
                e.printStackTrace();
            }
            Assert.fail("Сумма оплаты не подтянулась");
        }

        $(byName("amount")).clear();
        $(byName("amount")).setValue("100");
        $(byText("Перейти к оплате")).click();
    }

    @Step("Переход на оплату по номеру ЛС")
    public void LSForm(){
        open("ru/");
        $("[class*=menu__payment]").click();
        $(byName("abonent_id")).setValue("63279");
        pause(4000);

        System.out.println($(byName("amount")).getValue());

        if ($(byName("amount")).getValue().length()>1){
            System.out.println($(byName("amount")).getValue().length());
        }
        else{
            screenshot("123");
            try {
                screenshot1("Скрин последней страницы");
            } catch (IOException e) {
                e.printStackTrace();
            }
            Assert.fail("Сумма оплаты не подтянулась");
        }

        $(byName("amount")).clear();
        $(byName("amount")).setValue("100");
        $(byText("Перейти к оплате")).click();
//        $$(byClassName("main-menu__actions")).last().$(byTagName("button")).click();
//        pause(1000);
    }

    @Step("Переход на оплату из ЛК2")
    public void LKForm() {
        if ($(byName("amount")).getValue().length()>1){
            System.out.println($(byName("amount")).getValue().length());
        }
        else{
            screenshot("123");
            try {
                screenshot1("Скрин последней страницы");
            } catch (IOException e) {
                e.printStackTrace();
            }
            Assert.fail("Сумма оплаты не подтянулась");
        }
        $(byName("amount")).clear();
        $(byName("amount")).setValue("100");
        $(byClassName("bigBlueThing__payment")).$(byTagName("button")).click();

    }

    @Step("Заполнение и проверка данных в KT-Pay")
    public void KT_Pay() {
        switchTo().innerFrame("iframe_widget","iframe_widget"); //переключаемся на виджет оплаты

        $(byId("card_no_bin")).setValue("1111111111111111");
        $(byId("card_name")).setValue("testov test");
        $(byId("exp_month")).setValue("12");
        $(byName("exp_year")).setValue("12");
        $(byId("sec_cvv2")).setValue("444");

        $(byName("submit1")).click();

        $(byText("Некорректно указан номер карты"));

//        pause(1000);

    }


}
