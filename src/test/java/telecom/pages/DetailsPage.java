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
import static com.codeborne.selenide.Selenide.*;
import static telecom.testconfig.BaseSetings.pause;

public class DetailsPage {


    public void CheckDetails() {
//        $$(byClassName("kt-nav__link")).find(text("Детализация")).click();
        $(byText("Детализация")).click();
        CheckMobileDetails();
    }


    @Step("Проверка детализации - мобильная связь")
    public void CheckMobileDetails() {
//        pause(5000);
        $$(byAttribute("role", "presentation")).get(2).click();
        $(byId("number")).selectOption(0);

        $$(byAttribute("type", "submit")).find(text("30 дней")).click();
        pause(6000);
        if ($$(byClassName("table-detailing-date")).size() < 2) {
            Assert.fail("Детализация не отобразилась");
        }
        Checkaltelinfo();
    }

    @Step("Проверка детализации - интернет")
    public void CheckInternetDetails() {
        $$(byAttribute("role", "presentation")).get(0).click();
        $$(byAttribute("type", "submit")).find(text("Показать")).click();

    }

    @Step("Проверка детализации - Городская связь")
    public void CheckTelephonyDetails() {
        $$(byAttribute("role", "presentation")).get(1).click();
        $$(byAttribute("type", "submit")).find(text("Показать")).click();

    }

    @Step("Проверка остатка ресурсов в рамках тарифного плана")
    public void Checkaltelinfo(){
        if ($$(byClassName("detailsPage__altel__info")).size() < 2) {
            Assert.fail("Остаток ресурсов в рамках тарифного плана не отобразился");
        }

    }

}
